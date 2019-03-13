package Application.Control;

import Presentation.VolunteerLoginScene;
import javafx.scene.control.Button;


public class VolunteerLoginSceneControl {

    //fields
    private static Button bookingsB, flightsB, planesB, exitB;

    //initialization of fields
    public static void initialize(){
        //bookingsB
        bookingsB = VolunteerLoginScene.getBookingsB();
        bookingsB.setOnAction(e -> handle_bookingsB());

        //flightsB
        flightsB = VolunteerLoginScene.getFlightsB();
        flightsB.setOnAction(e -> handle_flightsB());

        //planesB
        planesB = VolunteerLoginScene.getPlanesB();
        planesB.setOnAction(e -> handle_planesB());

        //exitB
        exitB = VolunteerLoginScene.getExitB();
        exitB.setOnAction(e -> handle_exitsB());

    }


    //handle bookingsB
    public static void handle_bookingsB(){
        MainControl.showViewBookingScene();
    }

    //handle flightsB
    public static void handle_flightsB(){
        MainControl.showViewFlightsScene();
    }

    //handle planesB
    public static void handle_planesB(){
        MainControl.showViewPlanesScene();
    }

    //handle exitB
    public static void handle_exitsB(){
        MainControl.getWindow().close();
    }

}
