package com.adminDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/accessServlet")
public class accessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
//controlling access password
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String accessPW = request.getParameter("accessPW");
		
		//Declares a boolean variable
		boolean isTrue;
		
		//Calls a method named validate from packageDBUtil
		isTrue = packageDBUtil.validate(accessPW);
		
		// Checks if the accessing was successful.
		if (isTrue == true) {
			List<Admin> cusDetails = packageDBUtil.getCustomer(accessPW);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
		} else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Your access password is incorrect');");
			out.println("location='access.jsp'");
			out.println("</script>");
		}
	}

}
