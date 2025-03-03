package ioc.clas;




public class Employee {
	private int id ;  
	private String name;  
	private String dept;
	private Address address;
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Employee(int id, String name , Address address) {
		this.id = id;
		this.name = name;
		this.address=address;
	}

	

	public void showDetails(){  
	    System.out.println(id+" "+name+" "+dept);
	    System.out.println(address.toString());  
	}

}
