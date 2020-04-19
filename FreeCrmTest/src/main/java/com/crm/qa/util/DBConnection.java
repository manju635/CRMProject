package com.crm.qa.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
	public void dbconnection(){
		
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://localhost:3306/testdb";
		
		//database credential
		final String user = "root";
		final String password = "Manju@2020";
		
		Connection con = null;
		Statement stmt = null;
		
		//Register JDBC Driver
		try {
			Class.forName(JDBC_DRIVER);
			
			//Open conn
			try {
				con = DriverManager.getConnection(DB_URL, user, password);
				
				//Stement
				stmt = con.createStatement();
				
				String sql = "select * from login";
				ResultSet excutequery = stmt.executeQuery(sql);
				
				//Extract data from result set
				while(excutequery.next()){
					
					String dbname = excutequery.getString("UserName");
					String dbpass = excutequery.getString("passwor");
					
					System.out.println("UserNameDB : " + dbname + "DBPASS : "+dbpass);
								
				}
				//Close all connection
				excutequery.close();
				stmt.close();
				con.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
