package com.nic.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nic.entity.DocumentEntity;

@Repository
public interface DocumentRepo extends JpaRepository<DocumentEntity, Long> {

}
