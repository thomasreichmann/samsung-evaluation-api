package dev.thomasar.samsungevaluationapi.controllers;


import dev.thomasar.samsungevaluationapi.dtos.CurrencyDTO;
import dev.thomasar.samsungevaluationapi.dtos.QuotationDTO;
import dev.thomasar.samsungevaluationapi.services.CurrencyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/currencies")
public class CurrenciesController {
    private final CurrencyService currencyService;

    public CurrenciesController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping
    public List<CurrencyDTO> getCurrencies() {
        return currencyService.getCurrencies();
    }

    @GetMapping("quotations")
    public List<QuotationDTO> getQuotations() {
        return currencyService.getQuotations();
    }
}
