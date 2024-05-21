package com.nic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nic.dto.LockDTO;
import com.nic.service.LockService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class LockController {

	@Autowired
	private LockService lockService;

	@PostMapping("/lock")
	public ResponseEntity<?> lock(@Valid @RequestBody LockDTO dto) {
		ResponseEntity<?> lock = lockService.lock(dto);
		return lock;
	}

}
