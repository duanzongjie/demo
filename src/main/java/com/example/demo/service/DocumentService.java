package com.example.demo.service;

import com.example.demo.model.Document;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DocumentService {
    List<Document> getAllDocument();

    Document getDocumentById(int documentId);

    int addDocument(Document document);

    int delDocument(@Param("documentId") int documentId);

}
