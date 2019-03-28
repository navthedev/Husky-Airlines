

package Presentation;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VolunteerSignUpScene {
	//fields

	private static Stage dialogStage;
	private static Scene scene;
	private static GridPane gridPane;
	private static VBox vboxLabel, vboxText;
	private static Label title, email,phno,toh,certi,top,arcrftId,engineType,capacity,luggage,availabilty,password,confPAss;


	private static TextField emailT,phnoT,tohT,certiT,topT,arcrftIdT,engineTypeT,capacityT,luggageT,availabiltyT;
	private static PasswordField passwordT,confPAssT;
	private static Button okB,cancelB;
	private static BorderPane borderPane;
	private static HBox buttons;



	//initialization of objects
	public static void initialize() {

		// labels
		title = new Label();

		email = new Label();
		phno = new Label();
		toh = new Label();
		certi = new Label();
		top= new Label();
		arcrftId = new Label();
		engineType = new Label();
		capacity = new Label();
		luggage = new Label();
		availabilty = new Label();
		password = new Label();
		confPAss = new Label();

		//Information Label

		email.setText("Email");
		phno.setText("Phone No");
		toh.setText("Total Hours");
		certi.setText("Certifications");
		top.setText("Type Of plane");
		arcrftId.setText("Aircraft ID");
		engineType.setText("EngineType");
		capacity.setText("Capacity");
		luggage.setText("Luggage");
		availabilty.setText("Availability");
		password.setText("Password");
		confPAss.setText("Confirm Password");


		// text boxes
		emailT = new TextField();
		phnoT = new TextField();
		tohT = new TextField();
		certiT = new TextField();
		passwordT = new PasswordField();
		confPAssT = new PasswordField();
		topT= new TextField();
		arcrftIdT = new TextField();
		engineTypeT = new TextField();
		capacityT = new TextField();
		luggageT = new TextField();
		availabiltyT = new TextField();

		//Title Label
		title.setText("\n\nFill in your Information");
		title.setStyle("-fx-font-size:20pt");


		//button setup
		okB = new Button("Ok");
		okB.setDefaultButton(true);
		cancelB = new Button("Cancel");

		//layout
		buttons = new HBox(10);
		buttons.getChildren().addAll(okB,cancelB);
		buttons.setAlignment(Pos.CENTER);
		gridPane = new GridPane();
		borderPane = new BorderPane();
		gridPane.setAlignment(Pos.CENTER);
		vboxLabel = new VBox();
		vboxText = new VBox();
		gridPane.setHgap(10);
		vboxText.setSpacing(25);
		vboxLabel.setSpacing(34);
		
		vboxLabel.getChildren().addAll(email,password,confPAss,phno,toh,certi,top,arcrftId,engineType,capacity,luggage,availabilty);
		vboxText.getChildren().addAll(emailT,passwordT,confPAssT,phnoT,tohT,certiT,topT,arcrftIdT,engineTypeT,capacityT,luggageT,availabiltyT,buttons);
		
		gridPane.add(vboxLabel, 0, 0);
		gridPane.add(vboxText, 1, 0);
		borderPane.setCenter(gridPane);
		borderPane.setTop(title);
		borderPane.setAlignment(title, Pos.CENTER);
		
	    final ScrollBar sc = new ScrollBar();

		//stage setup
		borderPane.getStylesheets().add("/Presentation/syle.css");
		scene = new Scene(borderPane,500, 600);
		
		scene.getStylesheets().addAll("/Presentation/style.css");

		dialogStage = new Stage();
		dialogStage.getIcons().add(new Image("/Presentation/icon.png"));
		dialogStage.setScene(scene);

		System.out.println("signup dialog initialized");
	}

	public static Stage getDialogStage() {
		return dialogStage;
	}





	public static Scene getScene() {
		return scene;
	}



	public static void setScene(Scene scene) {
		VolunteerSignUpScene.scene = scene;
	}



	public static TextField getEmailT() {
		return emailT;
	}



	public static void setEmailT(TextField emailT) {
		VolunteerSignUpScene.emailT = emailT;
	}



	public static TextField getPhnoT() {
		return phnoT;
	}



	public static void setPhnoT(TextField phnoT) {
		VolunteerSignUpScene.phnoT = phnoT;
	}



	public static TextField getTohT() {
		return tohT;
	}



	public static void setTohT(TextField tohT) {
		VolunteerSignUpScene.tohT = tohT;
	}



	public static TextField getCertiT() {
		return certiT;
	}



	public static void setCertiT(TextField certiT) {
		VolunteerSignUpScene.certiT = certiT;
	}



	public static TextField getTopT() {
		return topT;
	}



	public static void setTopT(TextField topT) {
		VolunteerSignUpScene.topT = topT;
	}



	public static TextField getArcrftIdT() {
		return arcrftIdT;
	}



	public static void setArcrftIdT(TextField arcrftIdT) {
		VolunteerSignUpScene.arcrftIdT = arcrftIdT;
	}



	public static TextField getEngineTypeT() {
		return engineTypeT;
	}



	public static void setEngineTypeT(TextField engineTypeT) {
		VolunteerSignUpScene.engineTypeT = engineTypeT;
	}



	public static TextField getCapacityT() {
		return capacityT;
	}



	public static void setCapacityT(TextField capacityT) {
		VolunteerSignUpScene.capacityT = capacityT;
	}



	public static TextField getLuggageT() {
		return luggageT;
	}



	public static void setLuggageT(TextField luggageT) {
		VolunteerSignUpScene.luggageT = luggageT;
	}



	public static TextField getAvailabiltyT() {
		return availabiltyT;
	}



	public static void setAvailabiltyT(TextField availabiltyT) {
		VolunteerSignUpScene.availabiltyT = availabiltyT;
	}


	public static PasswordField getPasswordT() {
		return passwordT;
	}

	public static void setPasswordT(PasswordField passwordT) {
		VolunteerSignUpScene.passwordT = passwordT;
	}


	public static PasswordField getConfPAssT() {
		return confPAssT;
	}


	public static Button getCancelB() {
		return cancelB;
	}

	public static Button getOkB() {
		return okB;
	}




}
