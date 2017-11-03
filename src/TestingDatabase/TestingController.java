package TestingDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestingController {
	
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	private static final String CONN_STRING = "jdbc:mysql://localhost/cardealer";



	// connection  method that connects us to the MySQL database

	public static Connection getConnection() throws SQLException{

		//System.out.println("Connected to student database successfully!");

		return DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
	}
}
