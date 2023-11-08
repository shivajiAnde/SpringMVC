package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FileUploadingController {
	
	@RequestMapping("/fileform")
	public String showUploadForm() {
		return "fileform";
	}
}
