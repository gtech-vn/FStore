package org.fstore.Controller;

import org.fstore.Entity.BussinessStaff;
import org.fstore.Entity.Customer;
import org.fstore.Model.FStoreHibernateDao;
import org.fstore.Model.ServerResponse;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@Controller
public class UserController {
	FStoreHibernateDao<BussinessStaff> dao;
	
	@RequestMapping(value="/api/user/signup", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody signupAction(@RequestBody String staff) {
		Gson g = new Gson();
		BussinessStaff bussinessStaffEntity = g.fromJson(staff, BussinessStaff.class);
		setHibernateDao();
		dao.setClazz(BussinessStaff.class);
		dao.create(bussinessStaffEntity);
		String ajaxResponse = "";
		return "hello";
	}
	
	@RequestMapping(value="/api/user/signin", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody String signinAction(@RequestBody String info) {
		Gson gson = new Gson();
		ServerResponse response = new ServerResponse();
		return gson.toJson(response);
	}
	
	@RequestMapping(value="/signup", method = RequestMethod.GET)
	public String signupFormAction(Model model) {
		return "users/RegisterPage";
	}
	
	private void setHibernateDao()  {
		dao = new FStoreHibernateDao();
	}
}
