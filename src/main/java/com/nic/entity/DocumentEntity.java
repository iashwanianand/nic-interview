package com.nic.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "document")
public class DocumentEntity implements Serializable {
	
	private static final long serialVersionUID = -1467796383768769210L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;
	
	@Column(name = "name", nullable = false, length = 255)
	private String name;
	
	@Column(name = "type", nullable = false, length = 50)
	private String type;
	
	@Column(name = "document", nullable = false)
	private byte[] document;

}
