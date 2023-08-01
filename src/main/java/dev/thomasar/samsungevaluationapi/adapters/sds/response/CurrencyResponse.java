package dev.thomasar.samsungevaluationapi.adapters.sds.response;

import dev.thomasar.samsungevaluationapi.dtos.CurrencyDTO;

public class CurrencyResponse {
    private String currencyId;
    private String currencyCode;
    private String currencyDesc;

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyDesc() {
        return currencyDesc;
    }

    public void setCurrencyDesc(String currencyDesc) {
        this.currencyDesc = currencyDesc;
    }

    public CurrencyDTO toDTO() {
        return new CurrencyDTO(currencyId, currencyCode, currencyDesc);
    }
}
