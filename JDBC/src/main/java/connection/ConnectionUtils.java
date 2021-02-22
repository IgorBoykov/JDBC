package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	
public static String USER_NAME = "Igor";
public static String USER_PASSWORD = "4467Igor619";
public static String URL = "jdbc:mysql://localhost:3306/employee";

public static Connection openConnection() throws SQLException, ClassNotFoundException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	return DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD);
}

}
