package com.dimikcomputing.helloworld;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/post")
public class SimpleServletPost extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		System.out.println("doPost on SimpleServletPost");

		String userName = req.getParameter("userName");
		String age = req.getParameter("age");

		System.out.println("username: " + userName + " and age: " + age);

		resp.getWriter().print("Hi! " + userName + "!" + " Your age is: " + age);

	}
}
