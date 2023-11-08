package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectiveController {
	
	@RequestMapping("/one")
	public RedirectView one() {
		RedirectView view = new RedirectView();
		view.setUrl("enjoy");
		return view;
		
		/*
		System.out.println("first handler");
		redirecting using redirect prefix
		return "redirect:/enjoy";
		*/
	}
	
	@RequestMapping("/enjoy")
	public String enjoy() {
		System.out.println("secong handler");
		return "index";
	}
	
}
