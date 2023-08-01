package dev.thomasar.samsungevaluationapi.services;

import dev.thomasar.samsungevaluationapi.adapters.sds.SDSApi;
import dev.thomasar.samsungevaluationapi.adapters.sds.response.CurrencyResponse;
import dev.thomasar.samsungevaluationapi.adapters.sds.response.QuotationResponse;
import dev.thomasar.samsungevaluationapi.dtos.CurrencyDTO;
import dev.thomasar.samsungevaluationapi.dtos.QuotationDTO;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class CurrencyService {
    private final SDSApi sdsApi;

    public CurrencyService(SDSApi sdsApi) {
        this.sdsApi = sdsApi;
    }

    public List<CurrencyDTO> getCurrencies() {
        return sdsApi.getCurrencies().stream().map(CurrencyResponse::toDTO).toList();
    }

    public List<QuotationDTO> getQuotations() {
        return sdsApi.getQuotations()
                .stream()
                .map(QuotationResponse::toDTO)
                .sorted(Comparator.comparing(QuotationDTO::getDataHoraCotacao).reversed())
                .toList();
    }
}
