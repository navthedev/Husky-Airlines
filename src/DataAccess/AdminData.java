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
