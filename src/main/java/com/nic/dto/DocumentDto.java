package com.nic.dto;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DocumentDto implements Serializable {

	private static final long serialVersionUID = -1655602533644796560L;
	
	@NotBlank(message = "Name cannot be blank")
	@Size(max = 255, message = "Name cannot exceed 255 characters")
	private String name;
	
	@NotBlank(message = "Type cannot be blank")
	@Size(max = 50, message = "Type cannot exceed 50 characters")
	private String type;
	
	@NotNull(message = "Document cannot be null")
	private MultipartFile document;

}
