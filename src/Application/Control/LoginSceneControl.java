package Application.Control;

import java.util.ArrayList;

import org.apache.commons.codec.binary.Base64;

import Application.DataTypes.Admin;
import DataAccess.AdminData;
import Presentation.LoginScene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginSceneControl {

	//fields
	private static Button loginButton;
	private static Button signUpButton;
	private static TextField usernameField;
	private static TextField passwordField;
	private static ArrayList<Admin> admins;
	private static String username;
	private static String password;


	//initialize
	public static void initialize(){
		//username field
		usernameField = LoginScene.getUsernameField();

		//password field
		passwordField = LoginScene.getPasswordField();

		//admins list
		admins = AdminData.getAdmins();

		//loginButton
		loginButton = LoginScene.getLoginButton();
		signUpButton = LoginScene.getSignUpButton();
		loginButton.setDefaultButton(true);
		loginButton.setOnAction(e->{
			//username
			username = usernameField.getText();

			//password
			password = passwordField.getText();

			handle_loginButton();
		});
		signUpButton.setOnAction(e->{
			handle_signUpButton();
		});


	}

	//handle sign Up button
	public static void handle_signUpButton(){
		MainControl.signUpScene();

	}

	//handle login button
	public static void handle_loginButton(){
		int ok = 0;
		String paas= "";

		//        byte[] encodedBytes = Base64.encodeBase64("123".getBytes());
		//    	System.out.println("encodedBytes " + new String(encodedBytes));
		//    	String enc =  new String(encodedBytes);
		//    	byte[] decodedBytes = Base64.decodeBase64(enc.getBytes());
		//    	System.out.println("decodedBytes " + new String(decodedBytes));
		//    	String dec = new String(decodedBytes);

		if(isInputValid()) {
			



			//verify the user credentials in database
			for(Admin admin : AdminData.getAdmins()) {
				if ("Customer".equalsIgnoreCase(admin.getRole())) {
					byte[] decodedBytes = Base64.decodeBase64(admin.getPassword().getBytes());
				    	System.out.println("decodedBytes " + new String(decodedBytes));
				    	paas = new String(decodedBytes);
					   //valid user and password Customer Login
				}else {
					paas = admin.getPassword().toString();
				}

				if (admin.getAdmin_id().equalsIgnoreCase(username) && paas.equalsIgnoreCase(password)) {
					if ("Customer".equalsIgnoreCase(admin.getRole())) {
						MainControl.showCustomerMenuScene(); //valid user and password Customer Login
					}else {
						MainControl.showMenuScene(); //valid username and password Admin Login
					}
					System.out.println("login successful");
					ok = 1;
					break;
				}
			}

			//wrong username or pass
			if(ok == 0) {
				usernameField.clear();
				passwordField.clear();

				Alert alert = new Alert(Alert.AlertType.WARNING);
				alert.setHeaderText("Login failed");
				alert.setContentText("Invalid username or password");
				alert.initOwner(MainControl.getWindow());
				alert.showAndWait();
			}
		}
	}


	//method to verify the user input
	public static boolean isInputValid(){
		String error = "";

		if(username.isEmpty())
			error+="Insert username!\n";

		if(password.isEmpty())
			error += "Insert password!\n";

		if(error=="")
			return true;

		else{
			Alert alert = new Alert(Alert.AlertType.WARNING);
			alert.setContentText(error);
			alert.setHeaderText("Invalid input!");
			alert.initOwner(MainControl.getWindow());
			alert.showAndWait();
			return false;
		}
	}

}
