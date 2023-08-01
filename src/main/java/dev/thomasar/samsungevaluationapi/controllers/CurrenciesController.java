package dev.thomasar.samsungevaluationapi.controllers;


import dev.thomasar.samsungevaluationapi.adapters.sds.SDSApi;
import dev.thomasar.samsungevaluationapi.adapters.sds.response.CurrencyResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/currencies")
public class CurrenciesController {
    private final SDSApi sdsApi;

    public CurrenciesController(SDSApi sdsApi) {
        this.sdsApi = sdsApi;
    }

    @GetMapping
    public List<CurrencyResponse> getCurrencies() {
        List<CurrencyResponse> currencies = sdsApi.getCurrencies();

        return currencies;
    }
}
