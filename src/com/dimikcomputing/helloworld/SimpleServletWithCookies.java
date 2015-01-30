package com.dimikcomputing.helloworld;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie")
public class SimpleServletWithCookies extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		Cookie cookie = new Cookie("helloworld", "This is a cookie");

		resp.addCookie(cookie);

		resp.getWriter().println("You browser has a cookie! Checkitout");

	}

}
