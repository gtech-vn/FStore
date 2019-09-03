package org.fstore.Controller;

import org.fstore.Entity.BussinessStaff;
import org.fstore.Model.ServerResponse;
import org.fstore.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	/**
	 * Sign up
	 * @param staff
	 * @return
	 */
	@RequestMapping(value="/api/user/signup", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody String Action(@RequestBody String staff) {
		Gson g = new Gson();		
		String ajaxResponse = "";
		return ajaxResponse;
	}
	
	/**
	 * Sign-in Action
	 * @param info
	 * @return
	 */
	@RequestMapping(value="/api/user/signin", method = RequestMethod.POST)
	public @ResponseBody String signinAction(@RequestBody String staffInfo) {
		
		Gson gson = new Gson();
		BussinessStaff staff = gson.fromJson(staffInfo, BussinessStaff.class);
		String token = userService.auth(staff.getUsername(), staff.getPassword());
		ServerResponse response = new ServerResponse();
		if(token.isEmpty()) {
			response.setStatus("Fail");
		}
		response.setContent(token);
		return gson.toJson(response);
	}
	
	/**
	 * Sign up Form
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/signup", method = RequestMethod.GET)
	public String signupFormAction(Model model) {
		return "users/RegisterPage";
	}
}
