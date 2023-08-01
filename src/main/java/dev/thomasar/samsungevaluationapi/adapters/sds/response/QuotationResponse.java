package dev.thomasar.samsungevaluationapi.adapters.sds.response;

import dev.thomasar.samsungevaluationapi.dtos.QuotationDTO;

import java.time.LocalDateTime;

public class QuotationResponse {
    private String fromCurrencyCode;
    private String toCurrencyCode;
    private String cotacao;
    private LocalDateTime dataHoraCotacao;

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

    public String getCotacao() {
        return cotacao;
    }

    public void setCotacao(String cotacao) {
        this.cotacao = cotacao;
    }

    public LocalDateTime getDataHoraCotacao() {
        return dataHoraCotacao;
    }

    public void setDataHoraCotacao(LocalDateTime dataHoraCotacao) {
        this.dataHoraCotacao = dataHoraCotacao;
    }

    public QuotationDTO toDTO() {
        return new QuotationDTO(fromCurrencyCode, toCurrencyCode, cotacao, dataHoraCotacao);
    }
}
