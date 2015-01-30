package com.dimikcomputing.helloworld;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/read-cookie")
public class SimpleServletReadingCookie extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();
		String ourCookie = null;

		for (Cookie cookie : cookies) {
			if ("helloworld".equals(cookie.getName())) {
				ourCookie = cookie.getName();
				System.out.println("We have got our cookie: " + ourCookie);
			}
		}

		resp.getWriter().print("We have got the cookie: " + ourCookie);

	}
}
