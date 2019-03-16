package Application.Control;

import Application.DataTypes.Booking;
import Application.DataTypes.BookingTable;
import Application.DataTypes.Customer;
import Application.DataTypes.Flight;
import Application.DataTypes.FlightTable;
import Application.DataTypes.Plane;
import DataAccess.DataConnection;
import Presentation.BookingEditScene;
import Presentation.CustomerEditScene;
import Presentation.FlightsEditScene;
import Presentation.ForgotPasswordScene;
import Presentation.LoginScene;
import Presentation.MenuScene;
import Presentation.PlaneEditScene;
import Presentation.SignUpAddScene;
import Presentation.ViewBookingScene;
import Presentation.ViewCustomersScene;
import Presentation.ViewFlightsScene;
import Presentation.ViewPlaneScene;
import Presentation.VolunteerLoginScene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class MainControl {

    //fields
    public static Stage window = new Stage();



    //menu scene
    public static void showMenuScene(){
        //initialization of scene
        MenuScene.initialize();

        //initialization of controller
        MenuSceneControl.initialize();

        //set scene
        window.setScene(MenuScene.getScene());
        window.setTitle("Husky Airlines™");
        window.centerOnScreen();

    }
    
  //menu scene
    public static void showCustomerMenuScene(){
        //initialization of scene
        VolunteerLoginScene.initialize();

        //initialization of controller
        VolunteerLoginSceneControl.initialize();

        //set scene
        window.setScene(VolunteerLoginScene.getScene());
        window.setTitle("Husky Airlines™");
        window.centerOnScreen();

    }


    //login scene
    public static void showLoginScene() {
        //connect to database
        DataConnection.connect();

        //initialization of scene
        LoginScene.initialize();

        //initialization of actions
        LoginSceneControl.initialize();


        //set scene
        window.setScene(LoginScene.getScene());
        window.setTitle("Husky Airlines™");
        window.getIcons().add(new Image("/Presentation/icon.png"));

        window.show();
        window.centerOnScreen();
    }


    //view bookings scene
    public static void showViewBookingScene(){
        //initialization of scene
        ViewBookingScene.initialize();

        //initialization of actions
        ViewBookingSceneControl.initialize();

        //set scene
        window.setScene(ViewBookingScene.getScene());
        window.setTitle("Husky Airlines™  -  Bookings");
    }


    //view customers scene
    public static void showViewCustomerScene(){
        //initialization of scene
        ViewCustomersScene.initialize();

        //initialization of controller
        ViewCustomerSceneControl.initialize();

        //set scene
        window.setScene(ViewCustomersScene.getScene());
        window.setTitle("Husky Airlines™  -  Customers");
    }


    //view flights scene
    public static void showViewFlightsScene(){
        //initialization of scene
        ViewFlightsScene.initialize();

        //initialization of controller
        ViewFlightSceneControl.initialize();

        //set scene
        window.setScene(ViewFlightsScene.getScene());
        window.setTitle("Husky Airlines™  -  Flights");
    }


    //view planes scene
    public static void showViewPlanesScene(){
        //initialization of scene
        ViewPlaneScene.initialize();

        //initialization of controller
        ViewPlaneSceneControl.initialize();

        //set scene
        window.setScene(ViewPlaneScene.getScene());
        window.setTitle("Husky Airlines™  -  Planes");
    }


    //plane edit dialog
    public static boolean showPlaneEditScene(Plane plane){
        //initialization of scene
        PlaneEditScene.initialize();

        //initialization of control
        PlaneEditSceneControl.initialize();
        PlaneEditSceneControl.setPlane(plane);

        PlaneEditScene.getDialogStage().initOwner(window);
        PlaneEditScene.getDialogStage().setTitle("Plane menu");
        PlaneEditScene.getDialogStage().showAndWait();

        return PlaneEditSceneControl.isOkPressed();
    }


    //customer edit dialog
    public static boolean showCustomerEditScene(Customer customer){
        //initialization of scene
        CustomerEditScene.initialize();

        //initialization of control
        CustomerEditSceneControl.initialize();
        CustomerEditSceneControl.setCustomer(customer);

        CustomerEditScene.getDialogStage().initOwner(window);
        CustomerEditScene.getDialogStage().setTitle("Customer menu");
        CustomerEditScene.getDialogStage().showAndWait();

        return CustomerEditSceneControl.isOkPressed();
    }
    
    //customer edit dialog
    public static boolean signUpScene(){
        //initialization of scene
        SignUpAddScene.initialize();

        //initialization of control
        SignUpAddSceneControl.initialize();
     //   CustomerEditSceneControl.setCustomer(customer);

        SignUpAddScene.getDialogStage().initOwner(window);
        SignUpAddScene.getDialogStage().setTitle("Customer menu");
        SignUpAddScene.getDialogStage().showAndWait();

        return SignUpAddSceneControl.isOkPressed();
    }
    
    //customer edit dialog
    public static boolean ForgotPassScene(){
        //initialization of scene
        ForgotPasswordScene.initialize();
        ForgotPasswordSceneControl.initialize();


        ForgotPasswordScene.getDialogStage().initOwner(window);
        ForgotPasswordScene.getDialogStage().setTitle("Reset Password");
        ForgotPasswordScene.getDialogStage().showAndWait();

        return SignUpAddSceneControl.isOkPressed();
    }


    //flight edit dialog
    public static boolean showFlightEditScene(FlightTable flightTable, Flight flight){
        //initialization of scene
        FlightsEditScene.initialize();

        //initialization of controller
        FlightEditSceneControl.initialize();
        FlightEditSceneControl.setFlight(flightTable,flight);

        FlightsEditScene.getDialogStage().initOwner(window);
        FlightsEditScene.getDialogStage().setTitle("Flight menu");
        FlightsEditScene.getDialogStage().showAndWait();

        return FlightEditSceneControl.isOkPressed();
    }


    //booking edit dialog
    public static boolean showBookingEditScene(BookingTable bookingTable, Booking booking) {
        //initialization of scene
        BookingEditScene.initialize();

        //initialization of controller
        BookingEditSceneControl.initialize();
        BookingEditSceneControl.setBooking(bookingTable, booking);

        BookingEditScene.getDialogStage().initOwner(window);
        BookingEditScene.getDialogStage().setTitle("Booking menu");
        BookingEditScene.getDialogStage().showAndWait();

        return BookingEditSceneControl.isOkPressed();

    }



    //getters
    public static Stage getWindow() {
        return window;
    }

}
