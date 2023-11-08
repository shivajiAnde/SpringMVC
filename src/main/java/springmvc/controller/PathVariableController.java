package springmvc.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class PathVariableController {

		
		@RequestMapping("/book/{userId}/{userName}/")
		public String handler(@PathVariable("userId") int id,@PathVariable("userName") String userName) {
			System.out.println(id);
			System.out.println(userName);
			return "file";
		}
}
