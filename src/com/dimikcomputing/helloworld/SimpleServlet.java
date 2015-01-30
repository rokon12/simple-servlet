package com.dimikcomputing.helloworld;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/simpleServlet" })
public class SimpleServlet extends HttpServlet {

	private static final long serialVersionUID = -8162693170723743211L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		System.out.println("We are no the doGet method");
		resp.getWriter().print("Hello from servlet, on the page!");
	}
}
