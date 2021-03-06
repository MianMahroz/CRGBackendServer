package com.bestercapitalmedia.chiragh.imageutill;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
 

 
// TODO: Auto-generated Javadoc
/**
 * The Class UploadController.
 */
@RestController
@RequestMapping("/api/images/")
public class UploadController {
 
	/** The storage service. */
	@Autowired
	StorageService storageService;
 
	/** The files. */
	List<String> files = new ArrayList<String>();
 
	/**
	 * List uploaded files.
	 *
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/")
	public String listUploadedFiles(Model model) {
		return "uploadForm";
	}
 
	/**
	 * Handle file upload.
	 *
	 * @param file the file
	 * @param model the model
	 * @return the string
	 */
	@PostMapping("/save")
	public String handleFileUpload(@RequestParam("file") MultipartFile file, Model model) {
		try {
			storageService.store(file,"","");
			model.addAttribute("message", "You successfully uploaded " + file.getOriginalFilename() + "!");
			files.add(file.getOriginalFilename());
		} catch (Exception e) {
			model.addAttribute("message", "FAIL to upload " + file.getOriginalFilename() + "!");
		}
		return "uploadForm";
	}
 
	/**
	 * Gets the list files.
	 *
	 * @param model the model
	 * @return the list files
	 */
	@GetMapping("/gellallfiles")
	public String getListFiles(Model model) {
		model.addAttribute("files",
				files.stream()
						.map(fileName -> MvcUriComponentsBuilder
								.fromMethodName(UploadController.class, "getFile", fileName).build().toString())
						.collect(Collectors.toList()));
		model.addAttribute("totalFiles", "TotalFiles: " + files.size());
		return "listFiles";
	}
 
	/**
	 * Gets the file.
	 *
	 * @param filename the filename
	 * @return the file
	 */
	@GetMapping("/files/{filename:.+}")
	@ResponseBody
	public ResponseEntity<Resource> getFile(@PathVariable String filename) {
		Resource file = storageService.loadFile("",filename);
		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"")
				.body(file);
	}
}