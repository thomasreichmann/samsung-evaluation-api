package dev.thomasar.samsungevaluationapi.services;

import dev.thomasar.samsungevaluationapi.adapters.sds.SDSApi;
import dev.thomasar.samsungevaluationapi.adapters.sds.response.DocumentResponse;
import dev.thomasar.samsungevaluationapi.dtos.DocumentDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {
    private final SDSApi sdsApi;

    public DocumentService(SDSApi sdsApi) {
        this.sdsApi = sdsApi;
    }

    public List<DocumentDTO> getDocuments() {
        return sdsApi.getDocuments().stream().map(DocumentResponse::toDTO).toList();
    }
}
