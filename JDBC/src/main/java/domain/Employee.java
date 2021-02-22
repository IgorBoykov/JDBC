package domain;

public class Employee {
	
	private int id;
	private String firstName;
	private String lastName;
	
	public Employee(int id, String forstName, String lastName) {
		super();
		this.id = id;
		this.firstName = forstName;
		this.lastName = lastName;
	}

	public Employee(String forstName, String lastName) {
		super();
		this.firstName = forstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getForstName() {
		return firstName;
	}

	public void setForstName(String forstName) {
		this.firstName = forstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	

}
