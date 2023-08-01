package dev.thomasar.samsungevaluationapi.dtos;

import java.time.LocalDate;

public class DocumentDTO {
    private Long documentId;
    private String documentNumber;
    private String notaFiscal;
    private LocalDate documentDate;
    private Double documentValue;
    private String currencyCode;

    public DocumentDTO(Long documentId, String documentNumber, String notaFiscal, LocalDate documentDate, Double documentValue, String currencyCode) {
        this.documentId = documentId;
        this.documentNumber = documentNumber;
        this.notaFiscal = notaFiscal;
        this.documentDate = documentDate;
        this.documentValue = documentValue;
        this.currencyCode = currencyCode;
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

    public Double getDocumentValue() {
        return documentValue;
    }

    public void setDocumentValue(Double documentValue) {
        this.documentValue = documentValue;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
