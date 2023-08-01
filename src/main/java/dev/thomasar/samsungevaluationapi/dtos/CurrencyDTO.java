package dev.thomasar.samsungevaluationapi.dtos;

public class CurrencyDTO {
    private int currencyId;
    private String currencyCode;
    private String currencyDesc;

    public CurrencyDTO() {
    }

    public CurrencyDTO(int currencyId, String currencyCode, String currencyDesc) {
        this.currencyId = currencyId;
        this.currencyCode = currencyCode;
        this.currencyDesc = currencyDesc;
    }

    public int getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(int currencyId) {
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
