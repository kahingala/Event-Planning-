package com.adminDemo;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/deleteServlet")
public class deleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    //Controlling delete
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pid = request.getParameter("pid");
		
		//Declares a boolean variable 
		boolean isTrue;
		//Calls a method named deleteCustomer from a class named packageDBUtil
		isTrue = packageDBUtil.deleteCustomer(pid);
		
		// Checks if the deleting was successful.
		if (isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("insertPackage.jsp");
			dispatcher.forward(request, response);
		}
		else {
			
			List<Admin> cusDetails = packageDBUtil.getCustomerDetails(pid);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("useraccount.jsp");
			dispatcher.forward(request, response);
		}
	}

}
