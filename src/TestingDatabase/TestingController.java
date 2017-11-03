package TestingDatabase;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class TestingController {
	@FXML TextField fieldId;
	public void submitName(){
		fieldId.setText("Hello ");
	}

	/*
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Whiners_1997";
	private static final String CONN_STRING = "jdbc:mysql://localhost:3306/company";
	// connection  method that connects us to the MySQL database

	public static Connection getConnection() throws SQLException{

		System.out.println("Connected to student database successfully!");

		return DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
	}*/
}
