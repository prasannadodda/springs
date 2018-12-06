package com.cg.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="user")
public class UserController {
	
	@RequestMapping(value="showLogin")
	public String showLogin(Model model)
	{
		model.addAttribute("login",new Login() );
		return "login";
	}
	@RequestMapping(value="checkLogin")
	public String checkLogin(Model model)
	{
		return "loginsuccessfull";
	}
	@RequestMapping(value="showRegister")
	public String showRegister(Model model){
		model.addAttribute("register",new User());
		return "register";
	}
	@RequestMapping(value="checkRegister")
	public String checkRegister(User user,Model model)
	{
		return "registerSuccessfull";
	}

}
