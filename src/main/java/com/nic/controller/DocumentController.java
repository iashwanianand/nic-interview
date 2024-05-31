package com.nic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nic.dto.DocumentDto;
import com.nic.service.DocumentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class DocumentController {
	
	@Autowired
	private DocumentService service;
	
	@GetMapping("/get-documents")
	public ResponseEntity<?> getDocuments() {
		return service.getDocuments();
	}
	
	@PostMapping("/add-document")
	public ResponseEntity<?> addDocument(@Valid @ModelAttribute DocumentDto dto) {
		return service.addDocument(dto);
	}

}
