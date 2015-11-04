package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@Controller
public class UserController extends MultiActionController {
	
	
	
	
	@RequestMapping
	public ModelAndView userName(HttpServletRequest req,HttpServletResponse res){
		
		System.out.println("userName: " + LoginController.METHOD_GET);
		
	    String userName = req.getParameter("userName");
		
		String msg="";
	    ModelAndView mav=new ModelAndView("userResult");//注意要在/WEB-INF/jsp下面创建loginResult.jsp页面
	    if(!"".equals(userName)){
	        msg="欢迎您：" + userName ;
	    }else{
	        msg="请填写用户名信息";
	    }
		        
		  mav.addObject("msg",msg);
		  return mav; 
		
	}
	
	
	

}
