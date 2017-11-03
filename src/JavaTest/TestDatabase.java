package JavaTest;

import java.sql.*;
public class TestDatabase {

	public static void main(String[] args) {
		try{
			//get connection to data base
			Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/DATABASE NAME?autoReconnect=true&useSSL=false","USERNAME","PASSWORD");
			// create a statement
			Statement st = mycon.createStatement();
			// execute SQL query
			ResultSet rs = st.executeQuery("select * from employee");
			//process the result set
			while(rs.next())
			{
				System.out.println(rs.getString("Fname") + " "+ rs.getString("Lname"));
			}
		}catch(Exception E){
			System.out.println("Not Connecting to database");
		}

	}

}
