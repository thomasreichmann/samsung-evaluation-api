package dev.thomasar.samsungevaluationapi.dtos;

import java.time.LocalDateTime;

public class QuotationDTO {
    private String fromCurrencyCode;
    private String toCurrencyCode;
    private String cotacao;
    private LocalDateTime dataHoraCotacao;

    public QuotationDTO(String fromCurrencyCode, String toCurrencyCode, String cotacao, LocalDateTime dataHoraCotacao) {
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
}
