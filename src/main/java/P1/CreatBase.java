package P1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatBase {

	public static void main(String[] args) throws SQLException {
		String jdbcUrl = "jdbc:sqlite:databaseProject.db";
		Connection connection = DriverManager.getConnection(jdbcUrl);
		
		String sql = "create table databaseProject ("
				+ "ID Integer, "
				+ "firstName varchar(20),"
				+ "lastName varchar(20),"
				+ "userName varchar(20),"
				+ "password varchar(20),"
				//The address has a street number, street name, city, state and zip code.
				+ "address varchar(100)"
				+ ")";
		Statement statement = connection.createStatement();
		statement.executeUpdate(sql);
		
		System.out.println("Table created");
	}

}
