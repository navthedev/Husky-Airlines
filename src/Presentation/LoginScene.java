package Presentation;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;



public class LoginScene {

    //fields
    private static Scene scene;
    private static VBox loginLayout;
    private static Label loginLabel;
    private static Label huskyLabel;
    private static TextField usernameField;
    private static PasswordField passwordField;
    private static Hyperlink forgotPass;
	private static Button loginButton;
	private static Button signUpButton;



    //initialization of objects
    public static  void initialize(){

        //loginLabel
        loginLabel = new Label("Log in");
        loginLabel.setPadding((new Insets(0, 0, 30, 0)));
        loginLabel.setStyle("-fx-font-size: 24pt");
        


        //huskyLabel
        huskyLabel=new Label("Husky Airlines");
        huskyLabel.setId("welcome");
        
        
        forgotPass = new Hyperlink ("Forgot Password ?");
        forgotPass.setId("Forgot Password");
        
        //usernameField
        usernameField=new TextField();
        usernameField.setPromptText("User ID");
        usernameField.setMaxWidth(220);
        usernameField.setAlignment(Pos.CENTER);

        //passwordField
        passwordField=new PasswordField();
        passwordField.setAlignment(Pos.CENTER);
        passwordField.setMaxWidth(220);
        passwordField.setPromptText("Password");

        //loginField
        loginButton=new Button("Login");
        loginButton.setMaxWidth(120);
        
        //signUpField
        signUpButton=new Button("SignUp");
        signUpButton.setMaxWidth(120);

        //layout
        loginLayout = new VBox(10);
        loginLayout.setAlignment(Pos.CENTER);
        loginLayout.getChildren().addAll(huskyLabel,loginLabel,usernameField,passwordField,forgotPass,loginButton,signUpButton);

        //scene
        scene = new Scene(loginLayout,400,500);
        scene.getStylesheets().add("Presentation/style.css");



        System.out.println("login screen initialized");
    }


    //getters
    public static Scene getScene() {
        return scene;
    }

    public static VBox getLoginLayout() {
        return loginLayout;
    }

    public static Label getLoginLabel() {
        return loginLabel;
    }

    public static Label getHermesLabel() {
        return huskyLabel;
    }
    
    public static Hyperlink getForgotPass() {
  		return forgotPass;
  	}


    public static TextField getUsernameField() {
        return usernameField;
    }

    public static PasswordField getPasswordField() {
        return passwordField;
    }

    public static Button getLoginButton() {
        return loginButton;
    }
    
	public static Button getSignUpButton() {
		return signUpButton;
	}
    

}
