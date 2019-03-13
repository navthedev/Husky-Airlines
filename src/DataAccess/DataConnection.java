package DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Petru on 19-May-16.
 */

public class DataConnection {
	
    //fields
    private static Connection connection;
    private static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/Husky?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static String userName = UserPass.getUserName(); //user credentials stored in UserPass
    private static String password = UserPass.getPassword();


    //method to connect to the database
    public static void connect() {
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DATABASE_URL, userName, password);

            System.out.println("database connection success");
        }

        catch (Exception e) {
            e.printStackTrace();

            System.out.println("problem with database connection");
        }
    }


    //getters
    public static Connection getConnection() {
        return connection;
    }

}
