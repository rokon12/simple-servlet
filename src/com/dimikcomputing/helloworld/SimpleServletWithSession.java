package com.dimikcomputing.helloworld;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session")
public class SimpleServletWithSession extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		System.out.println("We are doGet method of SimpleServletWithSession");

		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession();

		String userName = req.getParameter("userName");
		
		if (userName != null && !userName.equals("")) {
			session.setAttribute("userName", userName);
		}

		out.println("request parameter has user name :  " + userName);
		out.println("session has user name :  "
				+ session.getAttribute("userName"));

	}
}
