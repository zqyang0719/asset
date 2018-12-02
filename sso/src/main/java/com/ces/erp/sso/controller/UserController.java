package com.ces.erp.sso.controller;


import com.ces.erp.sso.pojo.ResultInfo;
import com.ces.erp.sso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value="/login", method=RequestMethod.POST)
	@ResponseBody
	public ResultInfo userLogin(String username, String password,
								HttpServletRequest request, HttpServletResponse response) {
		try {
			ResultInfo result = userService.userLogin(username, password, request, response);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return ResultInfo.build(500, "");
		}
	}

	@RequestMapping(value="/logout/{token}")
	public String logout(@PathVariable String token) {
		userService.logout(token); // 思路是从Redis中删除key，实际情况请和业务逻辑结合
		return "index";
	}

	@RequestMapping("/token/{token}")
	@ResponseBody
	public Object getUserByToken(@PathVariable String token) {
		ResultInfo result = null;
		try {
			result = userService.queryUserByToken(token);
		} catch (Exception e) {
			e.printStackTrace();
			result = ResultInfo.build(500, "");
		}
		return result;
	}
}
