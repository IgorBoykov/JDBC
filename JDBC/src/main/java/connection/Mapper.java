package connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import domain.Employee;

public class Mapper {

	public static Set<Employee> setEmployeeMap(ResultSet result) throws SQLException {

		Set<Employee> setEmployee = new HashSet<>();

		int id = result.getInt("id");
		String firstName = result.getString("firstName");
		String lastName = result.getString("lastName");

		setEmployee.add(new Employee(id, firstName, lastName));
		
		for (Employee employee : setEmployee) {
			System.out.println(employee);
			
		}

		return setEmployee;
	}

	
//	public static Employee employeeMap (ResultSet result) throws SQLException {
//    	int id = result.getInt("id");
//    	String firstName = result.getString("firstName");
//    	String lastName = result.getString("lastName"); 	
//    	
//	return new Employee(id, firstName, lastName);
//	}

}
