package dev.thomasar.samsungevaluationapi.controllers;

import dev.thomasar.samsungevaluationapi.dtos.DocumentDTO;
import dev.thomasar.samsungevaluationapi.services.DocumentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/documents")
public class DocumentsController {

    private final DocumentService documentService;

    public DocumentsController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @GetMapping
    public List<DocumentDTO> getDocuments() {
        return documentService.getDocuments();
    }
}
