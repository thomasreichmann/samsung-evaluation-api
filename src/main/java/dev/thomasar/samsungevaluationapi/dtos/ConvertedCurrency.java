package dev.thomasar.samsungevaluationapi.dtos;

import java.math.BigDecimal;

public class ConvertedCurrency {

    private String fromCurrencyCode;  // Original currency code of the document
    private String toCurrencyCode;    // Currency code after conversion
    private BigDecimal originalValue; // Original value in the document's currency
    private BigDecimal convertedValue; // Value after conversion

    public ConvertedCurrency(String fromCurrencyCode, String toCurrencyCode, BigDecimal originalValue, BigDecimal convertedValue) {
        this.fromCurrencyCode = fromCurrencyCode;
        this.toCurrencyCode = toCurrencyCode;
        this.originalValue = originalValue;
        this.convertedValue = convertedValue;
    }

    public String getFromCurrencyCode() {
        return fromCurrencyCode;
    }

    public void setFromCurrencyCode(String fromCurrencyCode) {
        this.fromCurrencyCode = fromCurrencyCode;
    }

    public String getToCurrencyCode() {
        return toCurrencyCode;
    }

    public void setToCurrencyCode(String toCurrencyCode) {
        this.toCurrencyCode = toCurrencyCode;
    }

    public BigDecimal getOriginalValue() {
        return originalValue;
    }

    public void setOriginalValue(BigDecimal originalValue) {
        this.originalValue = originalValue;
    }

    public BigDecimal getConvertedValue() {
        return convertedValue;
    }

    public void setConvertedValue(BigDecimal convertedValue) {
        this.convertedValue = convertedValue;
    }

}
