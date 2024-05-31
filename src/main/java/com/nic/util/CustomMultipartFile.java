package com.nic.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.MediaType;
import org.springframework.web.multipart.MultipartFile;

public class CustomMultipartFile implements MultipartFile  {

	private final ByteArrayResource resource;
	private final String fileName;

	public CustomMultipartFile(ByteArrayResource resource, String fileName) {
		this.resource = resource;
		this.fileName = fileName;
	}

	@Override
	public String getName() {
		return fileName;
	}

	@Override
	public String getOriginalFilename() {
		return fileName;
	}

	@Override
	public String getContentType() {
		return MediaType.APPLICATION_PDF_VALUE;
	}

	@Override
	public boolean isEmpty() {
		return ((MultipartFile) resource).isEmpty();
	}

	@Override
	public long getSize() {
		try {
			return resource.getInputStream().available();
		} catch (IOException e) {
			return 0;
		}
	}

	@Override
	public byte[] getBytes() throws IOException {
		return resource.getByteArray();
	}

	@Override
	public InputStream getInputStream() throws IOException {
		return resource.getInputStream();
	}

	@Override
	public void transferTo(File dest) throws IOException, IllegalStateException {
		try (OutputStream out = new FileOutputStream(dest)) {
			out.write(resource.getByteArray());
		}
	}

}
