package com.nic.service;

import org.springframework.http.ResponseEntity;

import com.nic.dto.LockDTO;

public interface LockService {

	ResponseEntity<?> lock(LockDTO dto);

}
