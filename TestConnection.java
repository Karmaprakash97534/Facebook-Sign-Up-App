package com.java.signup;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class TestConnection {
   public static Connection createConnection() throws FileNotFoundException, IOException 
   {
	Connection connection =null;
	try {
		// get the data from properties file
		Class.forName("oracle.jdbc.driver.OracleDriver");	
		connection=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","system","welcome");
	}
	   catch(ClassNotFoundException | SQLException e)
	{
		e.printStackTrace();  
	}
	return connection;
   }
}