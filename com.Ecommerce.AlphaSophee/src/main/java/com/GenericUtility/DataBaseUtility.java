package com.GenericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DataBaseUtility {
	
	static Connection conn;
	
	public void connectDataBase() throws Throwable
	{
		Driver driver = new Driver();
		
		 DriverManager.registerDriver(driver);
		 Connection conn = DriverManager.getConnection(IpathConstant.DBURL,IpathConstant.DBUsername,IpathConstant.DBpassword);
		 
	}
	public void executeAndgetData(String Query,int columnIndex,String expecteddata) throws Throwable
	{
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(Query);
		boolean flag = false;
		while(result.next())
		{
			String actualresult = result.getString(columnIndex);
			if(actualresult.contains(expecteddata))
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("--Data is validated--");
		}
		else
		{
			System.out.println("--data is not validated--");
		}
		
	}
	public void executeAndUpdateData(String Query) throws Throwable
	{
		Statement statement = conn.createStatement();
		int update = statement.executeUpdate(Query);
		
		
		
	}
	
	public void closedatabase() throws SQLException
	{
		conn.close();
	}

}
