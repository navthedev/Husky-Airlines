package Application.Control;

import javax.mail.Session;

import Application.DataTypes.Admin;
import DataAccess.AdminData;
import Presentation.ForgotPasswordScene;
import Presentation.SignUpAddScene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ForgotPasswordSceneControl {

	// fields
	private static Button reset;
	private static TextField forgotLabel;
	private static Admin admin = new Admin();
	private static boolean okPressed = false;

	// initialization of fields
	public static void initialize() {

		// ok Button
		reset = ForgotPasswordScene.getReset();
		reset.setOnAction(e -> handle_okB());
		// textFields
		forgotLabel = ForgotPasswordScene.getForgotLabel();
	}

	public static void handle_okB() {
		if (isInputValid()) {
			String email ="";


			for(Admin admin : AdminData.getAdmins()) {
				email=admin.getEmail();

				if(forgotLabel.getText().equalsIgnoreCase(admin.getEmail())) {
				//do nothing
					System.out.println((admin.getEmail()+ "Emailexist"));
					
					break;
				}else {
					System.out.println("Email doesnot exist");
				}
				ForgotPasswordScene.getDialogStage().close();
			}
			AdminData.updateAdmin(email);
			EmailUtilityControl.sendEmail(email,"Reset Password","New Password is abc123");			

		}
	}

	// cancel button action
	public static void handle_cancelB() {
		SignUpAddScene.getDialogStage().close();

	}

	// method to verify the user input
	public static boolean isInputValid() {
		String error = "";

		if (forgotLabel == null || forgotLabel.getText().isEmpty())
			error += "Invalid emailID!\n";


		if (error.equals(""))
			return true;

		else {
			Alert alert = new Alert((Alert.AlertType.WARNING));
			alert.initOwner(MainControl.getWindow());
			alert.setContentText(error);
			alert.setHeaderText("Invalid input!");
			alert.showAndWait();
			return false;
		}
	}

	// getters
	public static Admin getAdmin() {
		return admin;
	}

	public static boolean isOkPressed() {
		return okPressed;
	}

}
