package ch17.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Commandprocess {
	public String requestpro(HttpServletRequest request, HttpServletResponse response) throws Throwable;
}
