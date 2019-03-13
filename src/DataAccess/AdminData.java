package DataAccess;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.commons.codec.binary.Base64;

import Application.DataTypes.Admin;

/**
 * Created by Administrator on 5/19/2016.
 */

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
                    if ("admin".equalsIgnoreCase(rs.getString(5))) {
                    admin.setRole(rs.getString(5));
                    admin.setPassword(rs.getString(4));
                    }else {
                    	admin.setRole("customer");
//                    	byte[] encodedBytes = Base64.encodeBase64(rs.getString(4).getBytes());
//                    	
//                    	String encPass = new String(encodedBytes);
                    	admin.setPassword(rs.getString(4));
                    }
                    admins.add(admin);
                }
        }

        catch(Exception e){
            e.printStackTrace();
        }

        return admins;
    }
    
    //method to add a admin
    public static void insertAdmin(String admin_idT,String fNameT,String lNameT,String password)
    {
        try{
        	String url = "INSERT INTO Admin VALUE('"+ admin_idT  + "',' "
                    + fNameT + "', '" + lNameT + "', '"  + password + "','customer');";
            statement.executeUpdate(url);
           // customer.setCustomer_id(customers.indexOf(customer) + 1);
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }


}
