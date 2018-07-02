package com.bestercapitalmedia.chiragh.imageutill;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.multipart.MultipartFile;
 
 
// TODO: Auto-generated Javadoc
/**
 * The Class StorageService.
 */
@Service
public class StorageService {
	
	/** The log. */
	Logger log = LoggerFactory.getLogger(this.getClass().getName());
	
	/** The env. */
	@Autowired
	Environment env;
	
	/** The root location. */
	private  Path rootLocation;
 
	/**
	 * Store.
	 *
	 * @param file the file
	 * @param path the path
	 * @param fileName the file name
	 */
	public void store(MultipartFile file,String path,String fileName){
		try {
			rootLocation= Paths.get(env.getProperty("ImagePath")+path);
			if(!rootLocation.toFile().exists())
			init();
            Files.copy(file.getInputStream(), this.rootLocation.resolve(fileName));
        } catch (Exception e) {
        	throw new RuntimeException("FAIL!");
        }
	}
 
    /**
     * Load file.
     *
     * @param path the path
     * @param filename the filename
     * @return the resource
     */
    public Resource loadFile(String path,String filename) {
        try {
        	rootLocation= Paths.get(env.getProperty("ImagePath")+path);
            Path file = rootLocation.resolve(filename);
            Resource resource = new UrlResource(file.toUri());
            if(resource.exists() || resource.isReadable()) {
                return resource;
            }else{
            	throw new RuntimeException("FAIL!");
            }
        } catch (MalformedURLException e) {
        	throw new RuntimeException("FAIL!");
        }
    }
    
    /**
     * Delete all.
     */
    public void deleteAll() {
        FileSystemUtils.deleteRecursively(rootLocation.toFile());
    }
 
    /**
     * Inits the.
     */
    public void init() {
        try {
        	
            Files.createDirectory(rootLocation);
        } catch (IOException e) {
            throw new RuntimeException("Could not initialize storage!");
        }
    }
}
