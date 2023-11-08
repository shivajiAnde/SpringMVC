package springmvc.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//import springmvc.service.UserService;

@Controller
public class ContactController {
	
//	@Autowired
//	private UserService userService;
//	
	@ModelAttribute
	public void common(Model model) {
		model.addAttribute("Name","LearnCodeWithDurgesh");
		model.addAttribute("small","small information about the programmer");
	}
	@RequestMapping("/contact")
	public String getContact(Model model) {
		return "contact";
	}
	
	@RequestMapping(path = "/processing",method = RequestMethod.POST)
	public String processing(@ModelAttribute User user,Model model) {
//		int id = this.userService.createUser(user);
//		model.addAttribute("userId",id);
		return "success";
	}
	
/*
	@RequestMapping(path = "/processing",method = RequestMethod.POST)
	public String processing(@RequestParam("name") String name,
			@RequestParam("email") String email,
			@RequestParam("password") String password,
			Model model
			) {
		User user =new User();
		user.setEmail(email);
		user.setName(name);
		user.setPassword(password);
//		model.addAttribute("name",name);
//		model.addAttribute("email",email);
//		model.addAttribute("password",password);
		
		model.addAttribute("user",user);
		return "success";
	}
*/
}
