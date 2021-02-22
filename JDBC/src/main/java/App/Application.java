package App;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connection.ConnectionUtils;
import connection.Mapper;


public class Application 
{
	static String READ_ALL = "select * from employee";
	
    public static void main( String[] args ) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
    {
        Connection connection = ConnectionUtils.openConnection();
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(READ_ALL);
        
        while(result.next()) {
        	Mapper.setEmployeeMap(result);
       }
    }
}
