package Application.Control;

import org.apache.commons.codec.binary.Base64;

import Application.DataTypes.Admin;
import Presentation.SignUpAddScene;
import Presentation.VolunteerSignUpScene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

public class VolunteerSignUpSceneControl {

	// fields
	private static Button okB, cancelB;
	private static TextField emailT,phnoT,tohT,certiT,topT,arcrftIdT,engineTypeT,capacityT,luggageT,availabiltyT,passwordT,confPAssT;
	private static Admin admin = new Admin();
	private static boolean okPressed = false;

	// initialization of fields
	public static void initialize() {

		// ok Button
		okB = VolunteerSignUpScene.getOkB();
		okB.setOnAction(e -> handle_okB());

		// cancelB
		cancelB = VolunteerSignUpScene.getCancelB();
		cancelB.setOnAction(e -> handle_cancelB());

		// textFields
		
		emailT = VolunteerSignUpScene.getEmailT();
		phnoT = VolunteerSignUpScene.getPhnoT();
		tohT = VolunteerSignUpScene.getTohT();
		certiT = VolunteerSignUpScene.getCertiT();
		passwordT = VolunteerSignUpScene.getPasswordT();
		confPAssT = VolunteerSignUpScene.getConfPAssT();
		topT= VolunteerSignUpScene.getTopT();
		arcrftIdT = VolunteerSignUpScene.getArcrftIdT();
		engineTypeT = VolunteerSignUpScene.getEngineTypeT();
		capacityT = VolunteerSignUpScene.getCapacityT();
		luggageT =VolunteerSignUpScene.getLuggageT();
		availabiltyT = VolunteerSignUpScene.getAvailabiltyT();
		
	}

//    //setting customer for edit
//    public static void setCustomer(Customer c){
//        customer = c;
//        fNameT.setText(customer.getFirst_name());
//        lNameT.setText(customer.getLast_name());
//        ageT.setText(Integer.toString(customer.getAge()));
//        passport_nrT.setText(customer.getPassport_number());
//        phone_nrT.setText(customer.getPhone_nr());
//
//    }

	// ok button action
	public static void handle_okB() {
		if (isInputValid()) {

			byte[] encodedBytes = Base64.encodeBase64(passwordT.getText().getBytes());
			String encodedPassword = new String(encodedBytes);

			//VolunteerData.insertAdmin(admin_idT.getText(), fNameT.getText(), lNameT.getText(), encodedPassword,
			//		emailT.getText()); // add user to database

			Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
			alert.initOwner(MainControl.getWindow());
			alert.setContentText("User added! Please Sign in ");
			alert.showAndWait();
			System.out.println("new user added");
			if (alert.getResult() == ButtonType.YES) {
				SignUpAddScene.getDialogStage().close();
			} else {
				SignUpAddScene.getDialogStage().close();

			}
		}
	}

	// cancel button action
	public static void handle_cancelB() {
		VolunteerSignUpScene.getDialogStage().close();

	}

	// method to verify the user input
	public static boolean isInputValid() {
		String error = "";

//		if (fNameT == null || fNameT.getText().isEmpty())
//			error += "Invalid first name!\n";
//
//		if (lNameT == null || lNameT.getText().isEmpty())
//			error += "Invalid last name!\n";
//
//		if (admin_idT == null || admin_idT.getText().isEmpty())
//			error += "Invalid userID!\n";
//
//		if (emailT == null || emailT.getText().isEmpty())
//			error += "Invalid emailID!\n";
//		
//		if (passwordT == null || passwordT.getText().isEmpty())
//			error += "Please choose a Password nr!\n";
//
//		if (confPasswordT == null || confPasswordT.getText().isEmpty())
//			error += "Please re enter your password !\n";
//
//		if (!passwordT.getText().equalsIgnoreCase(confPasswordT.getText()))
//			error += "please check ! password doesnot match !\n";
//
//		if (error.equals(""))
//			return true;
//
//		else {
//			Alert alert = new Alert((Alert.AlertType.WARNING));
//			alert.initOwner(MainControl.getWindow());
//			alert.setContentText(error);
//			alert.setHeaderText("Invalid input!");
//			alert.showAndWait();
		return false;
//		}
	}

	// getters
	public static Admin getAdmin() {
		return admin;
	}

	public static boolean isOkPressed() {
		return okPressed;
	}

}
