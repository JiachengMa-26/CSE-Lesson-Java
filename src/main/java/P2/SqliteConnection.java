package P2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SqliteConnection {
	public static Connection connector() {
		try {
			Class.forName("org.sqlite.JDBC");
			String url = "jdbc:sqlite:studentDB1.sqlite";
			Connection conn = DriverManager.getConnection(url);
			Statement statement = conn.createStatement();
			statement.executeUpdate("drop table if exists Students");
			statement.executeUpdate("create table students ("
					+ "StudentID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL ,"
					+ "FirstName VARCHAR(50), "
					+ "LastName VARCHAR(50), " 
					+ "gpa double, "
					+ "UserName VARCHAR(50),"
					+ "Password VARCHAR(50)"
					+ ")");
			statement.executeUpdate("insert into Students (UserName, Password) Values ('Adam', 'Smith')");
			statement.executeUpdate("insert into Students (UserName, Password) Values ('Bill', 'Smith')");
			return conn;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}