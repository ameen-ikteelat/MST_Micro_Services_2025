package ioc.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employeeBean")
public class Employee {
	
	@Value ("Alex")
	private String employeeName;
	
	@Value ("87232")
	private int employeeID;
	
	@Autowired  
	private Address address;
	
	
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

