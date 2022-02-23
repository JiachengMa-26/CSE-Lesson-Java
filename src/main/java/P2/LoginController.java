package P2;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

	@FXML
	private AnchorPane root;

	@FXML
	private TextField txtUserName;

	@FXML
	private Button loginButton;

	@FXML
	private PasswordField txtPassword;

	@FXML
	private VBox pane;

	@FXML
	private Label isConnected;

	LoginModel loginModel = new LoginModel();

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		if (loginModel.isDbConnected()) {
			isConnected.setText("Connected");
		} else {
			isConnected.setText("Not connected");
		}

	}

	public void login(ActionEvent event) {
		String username = txtUserName.getText();
		String password = txtPassword.getText();
		
		
		if (loginModel.isLogin(username, password)) {
			isConnected.setText("Login success");
			//open tableview
		} else {
			isConnected.setText("Login failure");
			// display success on a label
			
		}

	}
}