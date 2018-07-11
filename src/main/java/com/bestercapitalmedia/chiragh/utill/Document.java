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

// TODO: Auto-generated Javadoc
/**
 * The Class Document.
 */
@Service
public class Document {

	/**
	 * Save multipart file.
	 *
	 * @param path the path
	 * @param name the name
	 * @param file the file
	 * @return the string
	 */
	public static String saveMultipartFile(String path,String name, MultipartFile file) {
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("ddMMyy-hhmmss");
		Date date = new Date();
		String fileName = "";

		if (!file.isEmpty()) {
			try {
				String[] split = file.getOriginalFilename().split("\\.");
				String ext = split[split.length - 1];
				fileName = name+"-File-" + dateFormat1.format(date) + "." + ext;
				System.out.println(path);
				if (Files.notExists(Paths.get(path), LinkOption.NOFOLLOW_LINKS))
					Files.createDirectories(Paths.get(path));
				long p=Files.copy(file.getInputStream(), Paths.get(path, fileName));
				System.out.println("Path Output"+p);
			} catch (Exception  e) {
				e.printStackTrace();
				return ""+e.getMessage();
			}
		} else {
			return "";
		}

		return fileName;
	}

}
