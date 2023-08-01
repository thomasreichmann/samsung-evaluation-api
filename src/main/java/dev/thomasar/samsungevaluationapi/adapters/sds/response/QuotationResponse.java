package dev.thomasar.samsungevaluationapi.adapters.sds.response;

import dev.thomasar.samsungevaluationapi.dtos.QuotationDTO;

import java.math.BigDecimal;
import java.time.LocalDate;

public class QuotationResponse {
    private String fromCurrencyCode;
    private String toCurrencyCode;
    private BigDecimal cotacao;
    private LocalDate dataHoraCotacao;

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

    public QuotationDTO toDTO() {
        return new QuotationDTO(fromCurrencyCode, toCurrencyCode, cotacao, dataHoraCotacao);
    }
}
