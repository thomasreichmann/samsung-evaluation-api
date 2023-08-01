package dev.thomasar.samsungevaluationapi.adapters.sds;

import dev.thomasar.samsungevaluationapi.adapters.sds.response.CurrencyResponse;
import dev.thomasar.samsungevaluationapi.adapters.sds.response.DocumentResponse;
import dev.thomasar.samsungevaluationapi.adapters.sds.response.QuotationResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(name = "SDSApi", url = "${sds.url}")
public interface SDSApi {

    @GetMapping("/currency")
    List<CurrencyResponse> getCurrencies();

    @GetMapping("/quotation")
    List<QuotationResponse> getQuotations();

    @GetMapping("/docs")
    List<DocumentResponse> getDocuments();
}
