package com.bestercapitalmedia.chiragh.utill;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class Document {

	public static String saveMultipartFile(String path,String name, MultipartFile file) {
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("ddMMyy-hhmmss");
		Date date = new Date();
		String fileName = "";
		System.out.println(path);

		if (!file.isEmpty()) {
			try {
				String[] split = file.getOriginalFilename().split("\\.");
				String ext = split[split.length - 1];
				fileName = name+"-File-" + dateFormat1.format(date) + "." + ext;

				if (Files.notExists(Paths.get(path), LinkOption.NOFOLLOW_LINKS))
					Files.createDirectories(Paths.get(path));
				Files.copy(file.getInputStream(), Paths.get(path, fileName));
			} catch (IOException | RuntimeException e) {
				e.printStackTrace();
				return "";
			}
		} else {
			return "";
		}

		return fileName;
	}

}
