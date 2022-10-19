package com.company.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {

	 public void ptr(String request, String response);
//추상메소드

String handlerRequest(HttpServletRequest request,HttpServletResponse response);

String handlerRequest(HttpServletRequest request);

		


		
		
}
