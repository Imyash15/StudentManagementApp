package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	
	static Connection con;
	public static Connection createC() {               //static so that we call it directly
		
		
		
	try {
		//Load the class
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create the connection
		String user="root";
		String password="Y1012Jqkhkp";
		String url="jdbc:mysql://localhost:3306/student_manage";
		con=DriverManager.getConnection(url, user, password);        //for data storing
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	return con;
	
	
   }

}
