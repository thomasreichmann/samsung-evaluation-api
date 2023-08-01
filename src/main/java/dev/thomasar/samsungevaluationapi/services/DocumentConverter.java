package dev.thomasar.samsungevaluationapi.services;

import dev.thomasar.samsungevaluationapi.adapters.sds.response.DocumentResponse;
import dev.thomasar.samsungevaluationapi.dtos.ConvertedCurrency;
import dev.thomasar.samsungevaluationapi.dtos.CurrencyDTO;
import dev.thomasar.samsungevaluationapi.dtos.DocumentDTO;
import dev.thomasar.samsungevaluationapi.dtos.QuotationDTO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DocumentConverter {
    public DocumentDTO toDTO(DocumentResponse documentResponse, List<CurrencyDTO> targetCurrencies, List<QuotationDTO> quotations) {
        List<ConvertedCurrency> convertedCurrencies = new ArrayList<>();

        for (CurrencyDTO targetCurrency : targetCurrencies) {
            ConvertedCurrency convertedCurrency = convertToTargetCurrency(documentResponse, targetCurrency, quotations);
            if (convertedCurrency != null) {
                convertedCurrencies.add(convertedCurrency);
            }
        }

        return new DocumentDTO(
                documentResponse.getDocumentId(),
                documentResponse.getDocumentNumber(),
                documentResponse.getNotaFiscal(),
                documentResponse.getDocumentDate(),
                documentResponse.getDocumentValue(),
                documentResponse.getCurrencyCode(),
                convertedCurrencies
        );
    }

    public List<DocumentDTO> toDTO(List<DocumentResponse> documentResponses, List<CurrencyDTO> targetCurrencies, List<QuotationDTO> quotations) {
        return documentResponses.stream()
                .map(docResponse -> toDTO(docResponse, targetCurrencies, quotations))
                .collect(Collectors.toList());
    }

    private ConvertedCurrency convertToTargetCurrency(DocumentResponse documentResponse, CurrencyDTO targetCurrency, List<QuotationDTO> quotations) {
        if (documentResponse.getCurrencyCode().equalsIgnoreCase(targetCurrency.getCurrencyCode())) {
            return null;
        }

        QuotationDTO quotation = findQuotation(documentResponse.getCurrencyCode(), targetCurrency.getCurrencyCode(), quotations);
        if (quotation != null) {
            return createConvertedCurrency(documentResponse, quotation);
        }

        return null;
    }

    private QuotationDTO findQuotation(String fromCurrency, String toCurrency, List<QuotationDTO> quotations) {
        return quotations.stream()
                .filter(quotation -> quotation.getFromCurrencyCode().equalsIgnoreCase(fromCurrency)
                        && quotation.getToCurrencyCode().equalsIgnoreCase(toCurrency))
                .findFirst()
                .orElse(null);
    }

    private ConvertedCurrency createConvertedCurrency(DocumentResponse document, QuotationDTO quotation) {
        BigDecimal convertedValue = document.getDocumentValue().multiply(quotation.getCotacao());

        return new ConvertedCurrency(
                document.getCurrencyCode(),
                quotation.getToCurrencyCode(),
                document.getDocumentValue(),
                convertedValue
        );
    }
}
