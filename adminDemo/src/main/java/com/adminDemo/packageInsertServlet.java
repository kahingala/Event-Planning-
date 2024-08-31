package com.adminDemo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/packageInsertServlet")
public class packageInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    //controlling insert	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String packageName = request.getParameter("packageName");//Retrieves the value of the parameter.
		String eventPackageName = request.getParameter("eventPackageName");
		String price = request.getParameter("price");
		String accessPW =  request.getParameter("accessPW");
		
		//Declares a boolean variable 
boolean isTrue;
        //Calls a method named insertcustomer from a class named packageDBUtil
		isTrue = packageDBUtil.insertcustomer(packageName,eventPackageName,price,accessPW);
        // Checks if the insertion was successful.
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("access.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		
	}

}
