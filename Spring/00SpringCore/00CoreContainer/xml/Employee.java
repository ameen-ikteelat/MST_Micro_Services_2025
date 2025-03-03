package ioc.xml;

public class Employee {
	
	String employeeName;
	int employeeID;
	Address address;


	public Employee(String employeeName, int employeeID, ioc.xml.Address address) {

		this.employeeName = employeeName;
		this.employeeID = employeeID;
		this.address = address;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void showDetails() {
		System.out.println("ID: " + employeeID + ", Name: "+ employeeName);
		address.showAddress();
	}



}
