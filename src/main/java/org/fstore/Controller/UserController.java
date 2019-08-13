package org.fstore.Controller;

import org.fstore.Entity.BussinessStaff;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {
	@RequestMapping(value="/api/user/signup", method = RequestMethod.POST)
	public String signupAction(@RequestBody BussinessStaff staff) {

		return "hello";
	}
	
	@RequestMapping(value="/signup", method = RequestMethod.GET)
	public String signupFormAction(Model model) {
		return "users/RegisterPage";
	}
}
