package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet1
 */
public class LoginServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//This declaration is used to initialize email and password 
		//strings to values entered by the user
		String email= request.getParameter("email");
		String pass= request.getParameter("pass");
		
		//This if else statement is used to authenticate the user signing in
		//If authenticated, the user will be directed to the loginsuccess.jsp
		//Else the user will be prompted with a message showing invalid credentials
		if(email.equals("em@g.com") && pass.equals("password")){
			HttpSession session= request.getSession();
			session.setAttribute("sesname", request.getParameter("email"));
			response.sendRedirect("loginsuccess.jsp");
		}
		else{
			response.getWriter().println("user validation error");
		}
	}

}
