package ch17.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MessageprocessURI implements Commandprocess{

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		// TODO Auto-generated method stub
		request.setAttribute("message", "요청 URI로 명령어를 전달");
		return "/ch17/process.jsp";
	}	
} 
