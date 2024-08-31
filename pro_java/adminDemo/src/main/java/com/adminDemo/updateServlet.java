package com.adminDemo;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//controlling update
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pid = request.getParameter("pid");
		String packageName = request.getParameter("packageName");
		String eventPackageName = request.getParameter("eventPackageName");
		String price = request.getParameter("price");
		String accessPW = request.getParameter("accessPW");
	
		//Declares a boolean variable 		
		boolean isTrue;

        //Calls a method named updatecustomer from a class named packageDBUtil
		isTrue = packageDBUtil.updatecustomer(pid, packageName, eventPackageName, price, accessPW);

		// Checks if the updating was successful.
		if(isTrue == true) {
			
			List<Admin> cusDetails = packageDBUtil.getCustomerDetails(pid);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
		}
		else {
			List<Admin> cusDetails = packageDBUtil.getCustomerDetails(pid);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
		}
	}

}
