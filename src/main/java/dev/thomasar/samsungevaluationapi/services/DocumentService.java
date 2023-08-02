package dev.thomasar.samsungevaluationapi.services;

import dev.thomasar.samsungevaluationapi.adapters.sds.SDSApi;
import dev.thomasar.samsungevaluationapi.adapters.sds.response.DocumentResponse;
import dev.thomasar.samsungevaluationapi.dtos.CurrencyDTO;
import dev.thomasar.samsungevaluationapi.dtos.DocumentDTO;
import dev.thomasar.samsungevaluationapi.dtos.QuotationDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DocumentService {
    private final SDSApi sdsApi;
    private final CurrencyService currencyService;
    private final DocumentConverter documentConverter;


    public DocumentService(SDSApi sdsApi, CurrencyService currencyService, DocumentConverter documentConverter) {
        this.sdsApi = sdsApi;
        this.currencyService = currencyService;
        this.documentConverter = documentConverter;
    }

    public List<DocumentDTO> getDocuments(String documentNumber, String currencyCode, LocalDate startDate, LocalDate endDate) {
        List<DocumentResponse> documents = sdsApi.getDocuments();
        List<QuotationDTO> quotations = currencyService.getQuotations();
        List<CurrencyDTO> targetCurrencies = currencyService.getCurrencies();

        return documentConverter.toDTO(documents, targetCurrencies, quotations).stream()
                .filter(doc -> documentNumber == null || doc.getDocumentNumber().contains(documentNumber))
                .filter(doc -> currencyCode == null || doc.getCurrencyCode().equalsIgnoreCase(currencyCode))
                .filter(doc -> startDate == null || !doc.getDocumentDate().isBefore(startDate))
                .filter(doc -> endDate == null || !doc.getDocumentDate().isAfter(endDate))
                .collect(Collectors.toList());
    }
}
