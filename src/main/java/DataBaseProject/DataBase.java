package DataBaseProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {

		
		public String call() throws SQLException {
			String jdbcUrl = "jdbc:sqlite:databaseProject.db";
			Connection connection = DriverManager.getConnection(jdbcUrl);
			String sql = "select rowid, * from databaseProject";
			Statement statement = connection.createStatement();

			ResultSet result = statement.executeQuery(sql);
			String presult = "";
			
			while (result.next()) {
				// int rowid = result.getInt("rowid");
				int ID = Integer.parseInt(result.getString("ID"));
				String firstname = result.getString("firstName");
				String lastname = result.getString("lastName");
				String username = result.getString("userName");
				String password = result.getString("password");
				String address = result.getString("address");
				presult += (ID + "|" + firstname + "|" + lastname + "|" + username + "|" + password + "|" + address + "\n");
				System.out.println(
						ID + "|" + firstname + "|" + lastname + "|" + username + "|" + password + "|" + address + "\n");
			}
			statement.close();
			connection.close();

			return presult;
			
		}
		
		public String search(String type, String value) throws SQLException {
	        
			String jdbcUrl = "jdbc:sqlite:databaseProject.db";
			Connection connection = DriverManager.getConnection(jdbcUrl);
			Statement stmt = connection.createStatement();
			
			String sql
	        = "select * FROM databaseProject WHERE " + type + "='" + value+"'";
			System.out.println(sql);
			Statement statement = connection.createStatement();

			ResultSet result = statement.executeQuery(sql);

			String presult = "";
			System.out.println(result.next());
			
			if (result.next()) {
				// int rowid = result.getInt("rowid");
				int ID = Integer.parseInt(result.getString("ID"));
				String firstname = result.getString("firstName");
				System.out.println(ID);
				String lastname = result.getString("lastName");
				String username = result.getString("userName");
				String password = result.getString("password");
				String address = result.getString("address");
				presult += (ID + "|" + firstname + "|" + lastname + "|" + username + "|" + password + "|" + address + "\n");
				System.out.println(
						ID + "|" + firstname + "|" + lastname + "|" + username + "|" + password + "|" + address + "\n");
			}else {
					return("NO User Found!");
	        }
			 
			stmt.close();
			connection.close();

			return presult;
			
		}

		public String DeleteRow(String type, String value) throws SQLException {
			
			String jdbcUrl = "jdbc:sqlite:databaseProject.db";
			Connection connection = DriverManager.getConnection(jdbcUrl);
			Statement stmt = connection.createStatement();
			PreparedStatement p = null;
			
			String sql
	        = "delete from databaseProject where " + type + "='" + value + "'";
			String sqlCheck
			= "select * FROM databaseProject WHERE " + type + "='" + value+"'";
			ResultSet result = stmt.executeQuery(sqlCheck);
			System.out.println(result.next());
			
			p =connection.prepareStatement(sql);
			p.execute();
			
			
			String presult = "";
			System.out.println(p.execute());
			
			if (p.execute() == false && result.next() == true) {
				
				presult += "Deleated! Now database is: \n" + call();
				
			}else {
					return("NO User Found!");
	        }
			 
			stmt.close();
			connection.close();

			return presult;
			
			
			
//			String theResult = "NO User found";
//			try {
//				String jdbcUrl = "jdbc:sqlite:databaseProject.db";
//				Connection connection = DriverManager.getConnection(jdbcUrl);
//				Statement stmt = connection.createStatement();
	//
//				PreparedStatement st = connection.prepareStatement("DELETE FROM databaseProject WHERE " + type + "='" + value + "'");
////				if (Integer.valueOf(value) >= 0) {
////					int ID = Integer.valueOf(value);
////					st.setInt(1, ID);
////					st.executeUpdate();
////				}
//				st.setString(1, value);
//				st.executeUpdate();
//				System.out.println("Delet Done");
//				stmt.close();
//				connection.close();
//				System.out.println("Now table is:");
//				theResult.equals(call());
//			} catch (Exception e) {
//				System.out.println(e);
//			}
//			return theResult;

		}

		public static void UpdateRow(String type, String value) {
			try {
				String jdbcUrl = "jdbc:sqlite:databaseProject.db";
				Connection connection = DriverManager.getConnection(jdbcUrl);
				Statement stmt = connection.createStatement();

				PreparedStatement st = connection.prepareStatement("UPDATE FROM databaseProject WHERE " + type + "='" + value + "'");
				if (Integer.valueOf(value) >= 0) {
					int ID = Integer.valueOf(value);
					// select what you need
					st.executeUpdate();
				}
				// select what you need

				st.executeUpdate();
				System.out.println("Update Done");
				stmt.close();
				connection.close();
				System.out.println("Now table is:");
				//call();
			} catch (Exception e) {
				System.out.println(e);
			}

		}



	/*
	 * //--module-path H:\Javafx-sdk-17.0.1\javafx-sdk-17.0.1\lib --add-modules
	 * javafx.controls,javafx.fxml public static void main(String[] args) throws
	 * SQLException { String jdbcUrl = "jdbc:sqlite:databaseProject.db"; Connection
	 * connection = DriverManager.getConnection(jdbcUrl);
	 * 
	 * Scanner myObj = new Scanner(System.in);
	 * System.out.println("Enter firstName"); String firstName = myObj.nextLine();
	 * System.out.println("Enter lastName"); String lastName = myObj.nextLine();
	 * 
	 * System.out.println("Enter userName"); String userName = myObj.nextLine();
	 * System.out.println("Enter password"); String password = myObj.nextLine();
	 * 
	 * System.out.println("========Now enter address========");
	 * System.out.println("Enter StreetNumber"); String StreetNumber =
	 * myObj.nextLine(); System.out.println("Enter StreetName"); String StreetName =
	 * myObj.nextLine(); System.out.println("Enter City"); String City =
	 * myObj.nextLine(); System.out.println("Enter State"); String State =
	 * myObj.nextLine(); System.out.println("Enter zipcode"); String zipcode =
	 * myObj.nextLine(); String address = StreetNumber + StreetName + City + State +
	 * zipcode;
	 * 
	 * //get ID Statement stmt = connection.createStatement();
	 * 
	 * String query = "select count(*) from databaseProject";
	 * 
	 * ResultSet rs = stmt.executeQuery(query);
	 * 
	 * rs.next(); int count = rs.getInt(1) + 1;
	 * System.out.println("Now adding ID# : "+count); //get ID
	 * 
	 * 
	 * //step2 String sql = "insert into databaseProject values(" + count +
	 * ",'"+firstName+ "','" + lastName + "'," +"'"+ userName + "','" + password +
	 * "'," +"'"+ address + "'" + ")";
	 * 
	 * 
	 * //step1 Statement statement = connection.createStatement();
	 * 
	 * //step1 //statement.executeUpdate(sql);
	 * 
	 * //step2 int rows = statement.executeUpdate(sql);
	 * System.out.println("Now adding row# " + rows);
	 * 
	 * //step2 if(rows > 0) { System.out.println("A row reated"); }
	 * System.out.println("Table created"); call();
	 * 
	 * 
	 * stmt.close(); connection.close();
	 * 
	 * 
	 * //DeleteRow("ID","3"); //UpdateRow("",""); }
	 */

	
}
