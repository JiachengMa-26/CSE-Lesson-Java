package DataBaseProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DatabaseController {

	@FXML
	private TextField ff;

	@FXML
	private TextField lf;

	@FXML
	private TextField uf;

	@FXML
	private TextField pf;

	@FXML
	private TextField s1f;

	@FXML
	private TextField s2f;

	@FXML
	private TextField cf;

	@FXML
	private TextField stf;

	@FXML
	private TextField zpf;
	
	@FXML
	private TextField suF;

	@FXML
	private TextField duF;

	@FXML
	private Button suBut;
	
	@FXML
	private Button sb;

	@FXML
	private MenuButton suMBut;

	@FXML
	private MenuButton duMBut;

	@FXML
	private MenuItem si;

	@FXML
	private MenuItem su;

	@FXML
	private MenuItem sl;

	@FXML
	private MenuItem di;

	@FXML
	private MenuItem du;

	@FXML
	private MenuItem dl;

	@FXML
	private TextArea tA;

	DataBase db = new DataBase(); 
	
	public void sgUp(ActionEvent event) throws SQLException {

		String jdbcUrl = "jdbc:sqlite:databaseProject.db";
		Connection connection = DriverManager.getConnection(jdbcUrl);

		String firstName = ff.getText();
		String lastName = lf.getText();

		String userName = uf.getText();
		String password = pf.getText();

		String StreetNumber = s1f.getText();
		String StreetName = s2f.getText();
		String City = cf.getText();
		String State = stf.getText();
		String zipcode = zpf.getText();
		String address = StreetNumber + StreetName + City + State + zipcode;

		// get ID
		Statement stmt = connection.createStatement();

		String query = "select count(*) from databaseProject";

		ResultSet rs = stmt.executeQuery(query);

		rs.next();
		int count = rs.getInt(1) + 1;
		System.out.println("Now adding ID# : " + count);
		// get ID

		// step2
		String sql = "insert into databaseProject values(" + count + ",'" + firstName + "','" + lastName + "'," + "'"
				+ userName + "','" + password + "'," + "'" + address + "'" + ")";

		// step1
		Statement statement = connection.createStatement();

		// step1
		// statement.executeUpdate(sql);

		// step2
		int rows = statement.executeUpdate(sql);
		System.out.println("Now adding row# " + rows);

		// step2
		if (rows > 0) {
			System.out.println("A row reated");
		}
		System.out.println("Table created");
		tA.setText(db.call());

		stmt.close();
		connection.close();

	}
	
	public void sbb(ActionEvent event) throws SQLException {
		tA.setText(db.call());
	}

	public void sii(ActionEvent event) throws SQLException {
		tA.setText(db.search("ID", suF.getText()));
	}

	public void suu(ActionEvent event) throws SQLException {
		tA.setText(db.search("userName", suF.getText()));
	}

	public void sll(ActionEvent event) throws SQLException {
		tA.setText(db.search("lastName", suF.getText()));
	

	}

	public void dii(ActionEvent event) throws SQLException {
		tA.setText(db.DeleteRow("ID", duF.getText()));
	}

	public void duu(ActionEvent event) throws SQLException {
		tA.setText(db.DeleteRow("userName", duF.getText()));
	}

	public void dll(ActionEvent event) throws SQLException {
		tA.setText(db.DeleteRow("lastName", duF.getText()));
	}
}
	