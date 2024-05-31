package com.nic.util;

import java.io.IOException;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.web.multipart.MultipartFile;

public class ByteToMultipartFileConverter {

	public static MultipartFile convert(byte[] bytes) throws IOException {
		ByteArrayResource resource = new ByteArrayResource(bytes);
		return new CustomMultipartFile(resource, "fileName");
	}
}
