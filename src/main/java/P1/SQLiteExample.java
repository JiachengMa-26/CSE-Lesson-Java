package P1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SQLiteExample {

	public static void main(String[] args) throws SQLException {
		String jdbcUrl = "jdbc:sqlite:contacts.db";
		Connection connection = DriverManager.getConnection(jdbcUrl);
		
		//step1
		//String sql = "create table contacts (firstname varchar(20), lastname varchar(20))";
		
		
		Scanner myObj = new Scanner(System.in); 
	    System.out.println("Enter firstName");
	    String firstName = myObj.nextLine(); 
	    System.out.println("Enter lstName");
	    String lastName = myObj.nextLine(); 
		
	    
	    //get ID
        Statement stmt = connection.createStatement();
        
        String query = "select count(*) from contacts";
        
        ResultSet rs = stmt.executeQuery(query);
        
        rs.next();
        int count = rs.getInt(1);
        System.out.println("Number of records in the table: "+count);
        //get ID
	    
	    
		//step2
		String sql = "insert into contacts values(" + "'"+firstName+ "','" + lastName + "'" + ")";

		
		//step1
		Statement statement = connection.createStatement();
		
		//step1
		//statement.executeUpdate(sql);
		
		//step2
		int rows = statement.executeUpdate(sql);
		System.out.println("Now adding row# " + rows);
		
		//step2
		if(rows > 0) {
			System.out.println("A row reated");
		}
		
		//step1
		//System.out.println("Table created");
		
		SQLiteExample app = new SQLiteExample();
        // delete the row with id 3
        app.delete(1);
        
       
		call();
		
		
		
	}
	//step3
	public static void call() throws SQLException {
		String jdbcUrl = "jdbc:sqlite:contacts.db";
		Connection connection = DriverManager.getConnection(jdbcUrl);
		String sql = "select rowid, * from contacts";
		Statement statement = connection.createStatement();
		
		ResultSet result = statement.executeQuery(sql);
		
		while (result.next()) {
			int rowid = result.getInt("rowid");
			String firstname = result.getString("firstname");
			String lastname = result.getString("lastname");
			
			System.out.println(rowid + "|" + firstname + "|" + lastname);
		}
	}
	
	private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:contacts.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
	
	public void delete(int id) {
        String sql = "DELETE FROM contacts WHERE id = ?";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setInt(1, id);
            // execute the delete statement
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}

