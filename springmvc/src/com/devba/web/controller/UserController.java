package com.devba.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devba.web.controller.entity.UserInfo;
import com.devba.web.controller.service.IUserManager;

@Controller
@RequestMapping("/user")
public class UserController {
 
	@Resource(name="userManager")
	private IUserManager userManager;
	
	@RequestMapping("/toAddUser")
	public String toAddUser(){
		return "/addUser";
	}
	
	@RequestMapping("/addUser")
	public String addUser(UserInfo userInfo){
		userManager.addUser(userInfo);
		//转发到显示用户页面
		return "redirect:/user/getAllUser";
	}
	
	@RequestMapping("/getAllUser")
	public String getAllUser(HttpServletRequest request){
		List<UserInfo> userInfo = userManager.getAllUser();
		request.setAttribute("user", userInfo);
		return "/userManager";
	}
	
	@RequestMapping("/deleteUser")
	public void deleteUser(String id,HttpServletResponse response){
		String result = "{\"result\":\"error\"}";
		if(userManager.deleteUser(id)){
			result = "{\"result\":\"success\"}";
		}
		PrintWriter out = null;
		response.setContentType("application/json");
		try {
			out = response.getWriter();
			out.write(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/getUser")
	public String getUser(String id,HttpServletRequest request){
		UserInfo userInfo = userManager.getUser(id);
		request.setAttribute("user", userInfo);
		return "/editUser";
	}
	
	@RequestMapping("/updateUser")
	public String updateUser(UserInfo userInfo,HttpServletRequest request){
		if(userManager.updateUser(userInfo)){
			userInfo = userManager.getUser(userInfo.getId());
			request.setAttribute("user", userInfo);
			return "redirect:/user/getAllUser";
		}else{
			return "/error";
		}
	}
	
	
}
