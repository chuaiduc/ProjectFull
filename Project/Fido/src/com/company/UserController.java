package com.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.company.entities.User;
import com.company.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("index");
		List<User> listUser=service.listAll();
		mav.addObject("listUser", listUser);
		return mav;
	}
}
