package com.nic.serviceimpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.nic.dto.DocumentDto;
import com.nic.entity.DocumentEntity;
import com.nic.repo.DocumentRepo;
import com.nic.service.DocumentService;
import com.nic.util.ByteToMultipartFileConverter;
import com.nic.util.Constants;

@Service
public class DocumentServiceImpl implements DocumentService {

	@Autowired
	private DocumentRepo repo;

	@Override
	public ResponseEntity<?> getDocuments() {
		try {
			List<DocumentEntity> allDocuments = repo.findAll();
			List<DocumentDto> response = new ArrayList<>();
			if (allDocuments.size() != 0) {
				for (int i = 0; i < allDocuments.size(); i++) {
					DocumentDto dto = new DocumentDto();
					dto.setName(allDocuments.get(i).getName());
					dto.setType(allDocuments.get(i).getType());
					dto.setDocument(ByteToMultipartFileConverter.convert(allDocuments.get(i).getDocument()));
					response.add(dto);
				}
				return ResponseEntity.status(HttpStatus.OK).body(response);
			} else {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body(Constants.NO_DOCUMENT_FOUND);
			}
		} catch (IOException e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Constants.SOMETHING_WENT_WRONG);
		}
	}

	@Override
	public ResponseEntity<?> addDocument(DocumentDto dto) {
		try {
			DocumentEntity entity = new DocumentEntity();
			entity.setName(dto.getName());
			entity.setType(dto.getType());
			entity.setDocument(dto.getDocument().getBytes());
			DocumentEntity savedEntity = repo.save(entity);
			if (savedEntity != null) {
				return ResponseEntity.status(HttpStatus.OK).body(Constants.SAVED_SUCCESSFULLY);
			} else {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Constants.SOMETHING_WENT_WRONG);
			}
		} catch (IOException e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Constants.SOMETHING_WENT_WRONG);
		}
	}

}
