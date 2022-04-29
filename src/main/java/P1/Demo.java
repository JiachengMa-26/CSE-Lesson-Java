package P1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Connection connection  = null;
		
		try {
			// establish a connection
			connection = ConnectionUtil.getConnection("MyDB.sqlite");
			
			// create a statement object from the connection
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30);
			
			// create a table Users
			statement.executeUpdate("DROP TABLE IF EXISTS Users");
			statement.executeUpdate("CREATE TABLE Users "
					+ "(ID INTEGER PRIMARY KEY AUTOINCREMENT, "
					+ "FirstName VARCHAR(50), "
					+ "LastName VARCHAR(50),"
					+ "UserName VARCHAR(50) NOT NULL UNIQUE,"
					+ "Password VARCHAR(50) NOT NULL"
					+ ")");
			
			
			Scanner myObj = new Scanner(System.in); 
		    System.out.println("Enter firstName");
		    String firstName = myObj.nextLine(); 
		    System.out.println("Enter lastName");
		    String lastName = myObj.nextLine(); 
			
			
			// insert records into Users
			statement.executeUpdate("INSERT INTO Users "
					+ "(FirstName, LastName, UserName, Password) "
					+ "VALUES (" +"'" +firstName+"','"+lastName +"',"+ "'jdoe', 'jd123')");
			
//			statement.executeUpdate("INSERT INTO Users "
//					+ "(FirstName, LastName, UserName, Password) "
//					+ "VALUES ('Joey', 'Smith', 'jsmith', 'js456')");
			
//			// retrieve resultset
//			ResultSet rs = statement.executeQuery("SELECT * FROM Users");
//			
//			// extract and display data from resultset
//			while(rs.next()) {
//				System.out.print("\nFirst Name: " + rs.getString("FirstName"));
//				System.out.print("\tLast Name: " + rs.getString("LastName"));
//				System.out.print("\tUser Name: " + rs.getString("UserName"));
//				System.out.println("\tPassword: " + rs.getString("Password"));
//			}
//			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.closeConnection(connection);
		}
		
		try {
			// establish a connection
			connection = ConnectionUtil.getConnection("MyDB.sqlite");
			
			// create a statement object from the connection
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30);
			
			// No need to create a table Users
			
			// insert records into Users
//			statement.executeUpdate("INSERT INTO Users "
//					+ "(FirstName, LastName, UserName, Password) "
//					+ "VALUES ('Jane', 'Doe', 'jdoe2', 'password123')");
//			
//			statement.executeUpdate("INSERT INTO Users "
//					+ "(FirstName, LastName, UserName, Password) "
//					+ "VALUES ('Zack', 'Smith', 'zsmith', 'zs789')");
			
			// retrieve resultset
			ResultSet rs = statement.executeQuery("SELECT * FROM Users");
			
			// extract and display data from resultset
			while(rs.next()) {
				System.out.print("\nFirst Name: " + rs.getString("FirstName"));
				System.out.print("\tLast Name: " + rs.getString("LastName"));
				System.out.print("\tUser Name: " + rs.getString("UserName"));
				System.out.println("\tPassword: " + rs.getString("Password"));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.closeConnection(connection);
		}
	}

}
