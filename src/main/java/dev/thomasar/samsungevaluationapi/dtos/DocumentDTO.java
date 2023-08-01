package dev.thomasar.samsungevaluationapi.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class DocumentDTO {
    public List<ConvertedCurrency> convertedCurrencies;
    private Long documentId;
    private String documentNumber;
    private String notaFiscal;
    private LocalDate documentDate;
    private BigDecimal documentValue;
    private String currencyCode;

    public DocumentDTO(Long documentId, String documentNumber, String notaFiscal, LocalDate documentDate, BigDecimal documentValue, String currencyCode, List<ConvertedCurrency> currencies) {
        this.documentId = documentId;
        this.documentNumber = documentNumber;
        this.notaFiscal = notaFiscal;
        this.documentDate = documentDate;
        this.documentValue = documentValue;
        this.currencyCode = currencyCode;
        this.convertedCurrencies = currencies;
    }

    public Long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public LocalDate getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(LocalDate documentDate) {
        this.documentDate = documentDate;
    }

    public BigDecimal getDocumentValue() {
        return documentValue;
    }

    public void setDocumentValue(BigDecimal documentValue) {
        this.documentValue = documentValue;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public List<ConvertedCurrency> getConvertedCurrencies() {
        return convertedCurrencies;
    }

    public void setConvertedCurrencies(List<ConvertedCurrency> convertedCurrencies) {
        this.convertedCurrencies = convertedCurrencies;
    }
}
