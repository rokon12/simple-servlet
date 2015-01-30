package com.dimikcomputing.helloworld;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi")
public class SimpleServletWithParams extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		System.out.println("We are doGet method of SimpleServletWithParams");

		PrintWriter out = resp.getWriter();

		String userName = req.getParameter("userName");
		String age = req.getParameter("age");

		out.print("Hi! " + userName + "!" + " Your age is: " + age);
	}

}
