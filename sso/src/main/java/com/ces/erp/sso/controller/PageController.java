package com.ces.erp.sso.controller;

import com.ces.erp.util.AESUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PageController {

	@RequestMapping("/login")
	public String showLogin(String redirect, Model model) {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		redirect = AESUtil.aesDecode(request.getParameter("redirect"));
		model.addAttribute("redirect", redirect);
		return "login";
	}
	
}
