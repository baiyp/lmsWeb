package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class LoginController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
	System.out.println("LoginController: " + LoginController.METHOD_GET);
	
    String userName = request.getParameter("userName");
	
	String msg="";
    ModelAndView mav=new ModelAndView("loginResult");//注意要在/WEB-INF/jsp下面创建loginResult.jsp页面
    if(!"".equals(userName)){
        msg="欢迎您：" + userName ;
    }else{
        msg="请填写用户名信息";
    }
	        
	  mav.addObject("msg",msg);
	  return mav; 
	}

}
