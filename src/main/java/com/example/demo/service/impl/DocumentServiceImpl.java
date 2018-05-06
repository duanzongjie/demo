package com.example.demo.service.impl;

import com.example.demo.mapper.DocumentMapper;
import com.example.demo.model.Document;
import com.example.demo.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DocumentServiceImpl implements DocumentService {


    @Autowired
    DocumentMapper documentMapper;


    @Override
    public List<Document> getAllDocument() {
        return documentMapper.getAllDocument();
    }

    @Override
    public Document getDocumentById(int documentId) {
        return documentMapper.getDocumentById(documentId);
    }

    @Override
    public int addDocument(Document document) {
        return documentMapper.addDocument(document);
    }

    @Override
    public int delDocument(int documentId) {
        return documentMapper.delDocument(documentId);
    }
}
