package com.api.book.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {

	//	public final String UPLOAD_DIR="C:\\Users\\IDC-120\\Documents\\workspace-spring-tool-suite-4-4.24.0.RELEASE\\bootrestbook-1\\src\\main\\resources\\static\\image";
	public final String UPLOAD_DIR=new ClassPathResource("static/image/").getFile().getAbsolutePath();

	public FileUploadHelper() throws IOException{
		
	}

	
	public boolean uploadFile(MultipartFile multipartFile) {
		
		boolean f=false;
		try {
			
			//
//			InputStream is = multipartFile.getInputStream();
//			byte data[]=new byte[is.available()];
//			is.read(data);
//			
//			//Write
//			FileOutputStream outputStream=new FileOutputStream(UPLOAD_DIR+File.separator+multipartFile.getOriginalFilename());
//			outputStream.write(data);
//			outputStream.flush();
//			outputStream.close();
			Files.copy(multipartFile.getInputStream(), Paths.get(UPLOAD_DIR+File.separator+multipartFile.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
			f=true;
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return f;
	}

}
