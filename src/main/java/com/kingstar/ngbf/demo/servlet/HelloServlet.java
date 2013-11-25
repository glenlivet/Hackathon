package com.kingstar.ngbf.demo.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description 
 * @author liang.ma
 * @date 2013-8-26 下午5:20:02
 * @since 0.0.0.0
 */

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		resp.setContentType("Content-Type: text/plain;charset=utf-8");
		ServletOutputStream out = resp.getOutputStream();
//		out.println("hello embed servlet!");

		Enumeration<String> name = req.getParameterNames();
		while(name.hasMoreElements()) {
			String myName = name.nextElement();
			out.println(myName+"="+req.getParameter(myName));
			System.out.println(myName+"="+req.getParameter(myName));
		}
	}
}



