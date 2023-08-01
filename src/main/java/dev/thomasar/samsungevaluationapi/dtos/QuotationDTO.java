package dev.thomasar.samsungevaluationapi.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

public class QuotationDTO {
    private String fromCurrencyCode;
    private String toCurrencyCode;
    private BigDecimal cotacao;
    private LocalDate dataHoraCotacao;

    public QuotationDTO(String fromCurrencyCode, String toCurrencyCode, BigDecimal cotacao, LocalDate dataHoraCotacao) {
        this.fromCurrencyCode = fromCurrencyCode;
        this.toCurrencyCode = toCurrencyCode;
        this.cotacao = cotacao;
        this.dataHoraCotacao = dataHoraCotacao;
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

    public BigDecimal getCotacao() {
        return cotacao;
    }

    public void setCotacao(BigDecimal cotacao) {
        this.cotacao = cotacao;
    }

    public LocalDate getDataHoraCotacao() {
        return dataHoraCotacao;
    }

    public void setDataHoraCotacao(LocalDate dataHoraCotacao) {
        this.dataHoraCotacao = dataHoraCotacao;
    }
}
