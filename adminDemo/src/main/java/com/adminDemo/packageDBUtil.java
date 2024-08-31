package com.adminDemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class packageDBUtil {
	private static boolean isSuccess;// track the success of database operations.
	private static Connection con = null;// holding the database connection.
	private static Statement stmt = null;// holding the SQL statement.
	private static ResultSet rs = null;//holding the result of a database query.
	
public static boolean insertcustomer(String packageName, String eventPackageName, String price, String accessPW) {//inserting a package into the database.
    	
    	boolean isSuccess = false;
    	
    	try {
    		con = DBConnect.getConnection();//connect to the database
    		stmt = con.createStatement();
    	    String sql = "insert into eventpackage values (0,'"+packageName+"','"+eventPackageName+"','"+price+"', '"+accessPW+"')";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		} else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
 	
    	return isSuccess;
    }

public static List<Admin> getCustomer(String accessPW) {//retrieves customer information based on the provided access password.
	
	ArrayList<Admin> customer = new ArrayList<>();
	
	try {
		
		con = DBConnect.getConnection();//connect to the database
		stmt = con.createStatement();
		String sql = "select * from eventpackage where accessPW='"+accessPW+"'";
		rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			int pid = rs.getInt(1);
			String packageName = rs.getString(2);
			String eventPackageName = rs.getString(3);
			String price = rs.getString(4);
			String accessPW1 = rs.getString(5);
			
			
			Admin cus = new Admin(pid,packageName,eventPackageName,price,accessPW1);
			customer.add(cus);
		}
		
	} catch (Exception e) {
		
	}
	
	return customer;	
}

public static boolean validate(String accessPW) {//validates a provided access password by querying the database
	
	try {
		con = DBConnect.getConnection();//connect to the database
		stmt = con.createStatement();
		String sql = "select * from eventpackage where accessPW='"+accessPW+"' ";
		rs = stmt.executeQuery(sql);
		
		if (rs.next()) {
			isSuccess = true;
		} else {
			isSuccess = false;
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
}
	
public static boolean updatecustomer(String pid, String packageName, String eventPackageName, String price, String accessPW) {
	// updates package information
	try {
		
		con = DBConnect.getConnection();//connect to the database
		stmt = con.createStatement();
		String sql = "update eventpackage set pid='"+pid+"',packageName='"+packageName+"',eventPackageName='"+eventPackageName+"',price='"+price+"',accessPW='"+accessPW+"'"
				+ "where pid='"+pid+"'";
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0) {
			isSuccess = true;
		}
		else {
			isSuccess = false;
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
}

public static List<Admin> getCustomerDetails(String pid) {//retrieves details of a package
	
	int convertedID = Integer.parseInt(pid);
	
	ArrayList<Admin> cus = new ArrayList<>();
	
	try {
		
		con = DBConnect.getConnection();//connect to the database
		stmt = con.createStatement();
		String sql = "select * from eventpackage where pid='"+convertedID+"'";
		rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int pid1 = rs.getInt(1);
			String packageName = rs.getString(2);
			String eventPackageName = rs.getString(3);
			String price = rs.getString(4);
			String accessPW = rs.getString(5);
	
			
			Admin c = new Admin(pid1,packageName,eventPackageName,price,accessPW);
			cus.add(c);
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}	
	return cus;	
}

public static boolean deleteCustomer(String pid) {//deletes a package
	
	int convId = Integer.parseInt(pid);//change data type
	
	try {
		
		con = DBConnect.getConnection();//connect to the database
		stmt = con.createStatement();
		String sql = "delete from eventpackage where pid='"+convId+"'";
		int r = stmt.executeUpdate(sql);
		
		if (r > 0) {
			isSuccess = true;
		}
		else {
			isSuccess = false;
		}
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
}


}
