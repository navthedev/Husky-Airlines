

package Presentation;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ForgotPasswordScene {
	 //fields
    private static Stage dialogStage;
    private static Scene scene;
    private static GridPane gridPane;
    private static VBox vboxLabel;
    private static Label title;
    private static TextField ForgotLabel;

	private static Button reset;
    private static BorderPane borderPane;
    private static HBox buttons;


    //initialization of objects
    public static void initialize() {

        // labels
    	title = new Label();
    	title.setText("Forgot Password ? Please enter your email");

    	ForgotLabel = new TextField();


        //Information Label


        //button setup
        reset = new Button("Reset");
        reset.setDefaultButton(true);

        //layout
        buttons = new HBox(10);
        buttons.getChildren().addAll(reset);
        buttons.setAlignment(Pos.CENTER);
        gridPane = new GridPane();
        borderPane = new BorderPane();
        gridPane.setAlignment(Pos.CENTER);
        vboxLabel = new VBox();
        gridPane.setHgap(10);
        vboxLabel.setSpacing(34);
        vboxLabel.getChildren().addAll(title,ForgotLabel,buttons);
        gridPane.add(vboxLabel, 0, 0);
        borderPane.setCenter(gridPane);
       

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


    public static Scene getScene() {
        return scene;
    }
    
    public static TextField getForgotLabel() {
		return ForgotLabel;
	}

	public static Button getReset() {
		return reset;
	}

    public static void setScene(Scene scene) {
        ForgotPasswordScene.scene = scene;
    }
}

