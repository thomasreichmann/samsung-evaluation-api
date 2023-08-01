package dev.thomasar.samsungevaluationapi.dtos;

public class CurrencyDTO {
    private String currencyId;
    private String currencyCode;
    private String currencyDesc;

    public CurrencyDTO() {
    }

    public CurrencyDTO(String currencyId, String currencyCode, String currencyDesc) {
        this.currencyId = currencyId;
        this.currencyCode = currencyCode;
        this.currencyDesc = currencyDesc;
    }

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
}
