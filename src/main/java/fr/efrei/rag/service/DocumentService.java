package fr.efrei.rag.service;

import fr.efrei.rag.domain.Document;
import fr.efrei.rag.repository.DocumentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentService {
    private final DocumentRepository documentRepository;

    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public Document buildAndSaveDocument(Document document) {
        return documentRepository.save(document);
    }

    public List<Document> findAll(){
        return documentRepository.findAll();
    }

    public Optional<Document> findById(Long id){
        return documentRepository.findById(id);
    }
}
