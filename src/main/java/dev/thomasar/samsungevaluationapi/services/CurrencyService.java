package dev.thomasar.samsungevaluationapi.services;

import dev.thomasar.samsungevaluationapi.adapters.sds.SDSApi;
import dev.thomasar.samsungevaluationapi.adapters.sds.response.CurrencyResponse;
import dev.thomasar.samsungevaluationapi.dtos.CurrencyDTO;
import org.springframework.stereotype.Service;

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
}
