package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/more")
	public String home(Model model) {
		System.out.println("this is home page");
		model.addAttribute("name","shivaji royal");
		model.addAttribute("id",1234);
		List<String> friends=new ArrayList<String>();
		friends.add("hari");
		friends.add("seena");
		friends.add("kalyan");
		model.addAttribute("friends", friends);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about page");
		return "about";
	}
	
	
	
	//ModelAndView using to send data from controller to view
	//instead of returning String u have to return ModelAndView Object refference
	//then we got a doubt that how can we set the View Name
	//model and view object consists of setViewName method to set the name...
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("help");
		modelAndView.addObject("name","shivaji royal");
		modelAndView.addObject("rollNo",134723);
		LocalDateTime time=LocalDateTime.now();
		modelAndView.addObject("dateAndTime",time);
		List<String> list=new ArrayList();
		list.add("magic moments");
		list.add("magnum");
		list.add("kingfisher");
		list.add("tuberg");
		list.add("calseburg");
		list.add("mansion house");
		modelAndView.addObject("list",list);
		
		return modelAndView;
	}
}
