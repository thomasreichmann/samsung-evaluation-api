package dev.thomasar.samsungevaluationapi.controllers;

import dev.thomasar.samsungevaluationapi.dtos.DocumentDTO;
import dev.thomasar.samsungevaluationapi.services.DocumentService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/documents")
public class DocumentsController {

    private final DocumentService documentService;

    public DocumentsController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @GetMapping
    public List<DocumentDTO> getDocuments(
            @RequestParam(required = false) String documentNumber,
            @RequestParam(required = false) String currencyCode,
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam(required = false) LocalDate startDate,
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam(required = false) LocalDate endDate
    ) {
        return documentService.getDocuments(documentNumber, currencyCode, startDate, endDate);
    }
}
