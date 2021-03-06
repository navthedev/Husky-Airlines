package Presentation;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class VolunteerLoginScene {

    //fields
    private static Scene scene;
    private static Pane layout;
    private static VBox vbox;
    private static Label welcomeLabel;
    private static ImageView img;
    private static Button bookingsB, flightsB, planesB, exitB;


    //initialization of objects
    public static void initialize() {

        //welcomeLabel
        welcomeLabel = new Label("      Welcome\n\t   to\n Husky Airlines");
        welcomeLabel.setId("welcome");
        welcomeLabel.setAlignment(Pos.CENTER);
        welcomeLabel.relocate(810,90);

        //img
        img = new ImageView("/Presentation/img.png");
        img.setFitHeight(380);
        img.setFitWidth(680);
        img.relocate(30,85);

        //bookingsB
        bookingsB = new Button("Bookings");
        bookingsB.setAlignment(Pos.CENTER);
        bookingsB.setDefaultButton(true);
        bookingsB.getStyleClass().add("menu-button");

        //flightsB
        flightsB = new Button("Flights");
        flightsB.setAlignment(Pos.CENTER);
        flightsB.getStyleClass().add("menu-button");

        //planesB
        planesB = new Button("Planes");
        planesB.setAlignment(Pos.CENTER);
        planesB.getStyleClass().add("menu-button");

        //EXITB
        exitB = new Button("Exit");
        exitB.setId("exit-button");
        exitB.setAlignment(Pos.CENTER);

        //VBox
        vbox = new VBox(10);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox.relocate(940,320);
        vbox.getChildren().addAll(bookingsB,flightsB,planesB,exitB);

        //layout
        layout = new Pane();
        layout.getChildren().addAll(img, welcomeLabel, vbox);

        //scene
        scene = new Scene(layout, 1200, 700);
        scene.getStylesheets().add("Presentation/style.css");

        System.out.println("Volunteer Login scene initialized");
    }


    //getters
    public static Scene getScene() {
        return scene;
    }

    public static Pane getLayout() {
        return layout;
    }

    public static VBox getVbox() {
        return vbox;
    }

    public static Label getWelcomeLabel() {
        return welcomeLabel;
    }

    public static ImageView getImg() {
        return img;
    }

    public static Button getBookingsB() {
        return bookingsB;
    }

    public static Button getFlightsB() {
        return flightsB;
    }

    public static Button getPlanesB() {
        return planesB;
    }

    public static Button getExitB() {
        return exitB;
    }

}
