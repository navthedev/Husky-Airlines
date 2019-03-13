package Presentation;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SignUpAddScene {
	 //fields
    private static Stage dialogStage;
    private static Scene scene;
    private static GridPane gridPane;
    private static VBox vboxLabel, vboxText;
    private static Label fName, lName, admin_id, password,confPassword,title;
    private static Button okB,cancelB;
    private static TextField fNameT, lNameT, admin_idT;
    private static  PasswordField passwordT,confPasswordT;
    private static BorderPane borderPane;
    private static HBox buttons;


    //initialization of objects
    public static void initialize() {

        // labels
        title = new Label();
        admin_id = new Label();
        fName = new Label();
        lName = new Label();
        password = new Label();
        confPassword= new Label();

        // text boxes
        fNameT = new TextField();
        lNameT = new TextField();
        admin_idT = new TextField();
        passwordT = new PasswordField();
        confPasswordT = new PasswordField();

        //Title Label
        title.setText("\n\nFill in your Information");
        title.setStyle("-fx-font-size:20pt");

        //Information Label
        admin_id.setText("User ID");
        fName.setText("First Name");
        lName.setText("Last Name");
        password.setText("Password");
        confPassword.setText("Confirm Password");

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
        vboxLabel.getChildren().addAll(admin_id,fName,lName,password,confPassword);
        vboxText.getChildren().addAll(admin_idT,fNameT,lNameT,passwordT,confPasswordT,buttons);
        gridPane.add(vboxLabel, 0, 0);
        gridPane.add(vboxText, 1, 0);
        borderPane.setCenter(gridPane);
        borderPane.setTop(title);
        borderPane.setAlignment(title, Pos.CENTER);

        //stage setup
        borderPane.getStylesheets().add("/Presentation/syle.css");
        scene = new Scene(borderPane, 500, 600);
        scene.getStylesheets().addAll("/Presentation/style.css");

        dialogStage = new Stage();
        dialogStage.getIcons().add(new Image("/Presentation/icon.png"));
        dialogStage.setScene(scene);

        System.out.println("signup dialog initialized");
    }

    //GETTERS

    public static Stage getDialogStage(){
        return dialogStage;
    }

    public static Button getOkB() {
        return okB;
    }

    public static Button getCancelB() {
        return cancelB;
    }

    public static TextField getfNameT() {
        return fNameT;
    }

    public static TextField getlNameT() {
        return lNameT;
    }

    public static TextField getAdmin_IdT() {
        return admin_idT;
    }


    public static PasswordField getPasswordT() {
        return passwordT;
    }
    
    public static PasswordField getConfPasswordT() {
        return confPasswordT;
    }

    public static Scene getScene() {
        return scene;
    }

    public static void setScene(Scene scene) {
        SignUpAddScene.scene = scene;
    }
}
