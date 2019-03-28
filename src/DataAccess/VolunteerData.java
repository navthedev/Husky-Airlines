package DataAccess;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Application.DataTypes.Admin;

public class VolunteerData {

    //fields
    private static ArrayList<Admin> volunteers;
    private static Statement statement;


    //get volunteers
    public static ArrayList<Admin> getAdmins(){
        volunteers = new ArrayList<>();

        try{
            statement = DataConnection.getConnection().createStatement();
            ResultSet rs = statement.executeQuery("SELECT* FROM Volunteer");

            if(rs != null)
                while (rs.next()) {
                    Admin volunteer = new Admin();
                    volunteer.setAdmin_id(rs.getString(1));
                    volunteer.setFirst_name(rs.getString(2));
                    volunteer.setLast_name(rs.getString(3));
                    volunteer.setPassword(rs.getString(4));
                    if ("admin".equalsIgnoreCase(rs.getString(5))) {
                    volunteer.setRole(rs.getString(5));
                    }else {
                    	volunteer.setRole("customer");
                    }
                    volunteer.setEmail(rs.getString(6));
                    volunteers.add(volunteer);
                }
        }

        catch(Exception e){
            e.printStackTrace();
        }

        return volunteers;
    }
    
    //method to add a admin
    public static void insertAdmin(String admin_idT,String fNameT,String lNameT,String password, String email)
    {
        try{
        	String url = "INSERT INTO Admin VALUE('"+ admin_idT  + "',' "
                    + fNameT + "', '" + lNameT + "', '"  + password + "','customer',"+"'"+email+"');";
            statement.executeUpdate(url);
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }
    
  //method to update a admin
    public static void updateAdmin(String email,String password)
    {
        try{
        	
        	
        	String url = "UPDATE Admin SET password= '"+ password+"'"+" WHERE email ='"+ email+"';";
            statement.executeUpdate(url);
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    


}
