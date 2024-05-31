package com.nic.service;

import org.springframework.http.ResponseEntity;

import com.nic.dto.DocumentDto;

public interface DocumentService {

	ResponseEntity<?> getDocuments();

	ResponseEntity<?> addDocument(DocumentDto dto);

}
