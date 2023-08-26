package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.DB;

public class Program {

	public static void main(String [] args){
//		Connection connection = DB.getConnection();
//		DB.closeConnection();
//		System.out.println(connection);

		Connection connection = null;
		Statement statement = null;

		ResultSet resultSet = null;


		
		try {
			connection = DB.getConnection();

			statement = connection.createStatement();

			resultSet = statement.executeQuery("select * from department");

			while (resultSet.next()) {
				System.out.println(
						"ID: " + resultSet.getInt("id") + " Nome: " + resultSet.getString("name") 
						);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
