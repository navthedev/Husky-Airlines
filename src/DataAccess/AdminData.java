package DataAccess;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Application.DataTypes.Admin;

public class AdminData {

    //fields
    private static ArrayList<Admin> admins;
    private static Statement statement;


    //get admins
    public static ArrayList<Admin> getAdmins(){
        admins = new ArrayList<>();

        try{
            statement = DataConnection.getConnection().createStatement();
            ResultSet rs = statement.executeQuery("SELECT* FROM Admin");

            if(rs != null)
                while (rs.next()) {
                    Admin admin = new Admin();
                    admin.setAdmin_id(rs.getString(1));
                    admin.setFirst_name(rs.getString(2));
                    admin.setLast_name(rs.getString(3));
                    admin.setPassword(rs.getString(4));
                    if ("admin".equalsIgnoreCase(rs.getString(5))) {
                    admin.setRole(rs.getString(5));
                    }else {
                    	admin.setRole("customer");
                    }
                    admin.setEmail(rs.getString(6));
                    admins.add(admin);
                }
        }

        catch(Exception e){
            e.printStackTrace();
        }

        return admins;
    }
    
    //method to add a admin
    public static void insertAdmin(String admin_idT,String fNameT,String lNameT,String password, String email)
    {
        try{
        	String url = "INSERT INTO Admin VALUE('"+ admin_idT  + "',' "
                    + fNameT + "', '" + lNameT + "', '"  + password + "','customer',"+"'"+email+"');";
            statement.executeUpdate(url);
           // customer.setCustomer_id(customers.indexOf(customer) + 1);
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }
    
  //method to add a admin
    public static void updateAdmin(String email)
    {
        try{
        	
            //statement.executeUpdate("UPDATE flight SET plane_id = "+flight.getPlane_id()+", schedule_id = "+flight.getSchedule_id()+", airline_id = "+flight.getAirline_id()+", first_class_left = "+flight.getFirst_class_left()+", coach_left = "+flight.getCoach_left()+",economy_left = "+flight.getEconomy_left()+",price = "+flight.getPrice()+" WHERE flight_id = "+flight.getFlight_id()+ ";");

        	String url = "UPDATE Admin SET password= 'abc123' WHERE email ='"+ email+"';";
            statement.executeUpdate(url);
           // customer.setCustomer_id(customers.indexOf(customer) + 1);
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }


}
