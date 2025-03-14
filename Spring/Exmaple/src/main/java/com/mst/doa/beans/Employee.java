package com.mst.doa.beans;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Component
@Entity(name= "employees")
public class Employee {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	
	

	@Column(name="empl_name" , length = 155)
	private String name;
	
	@Enumerated(EnumType.ORDINAL)
	private Gender gender;
	
    private Address address;
    
    @ManyToOne
    @JoinColumn(name="depart_id" , nullable = false )
    private Department department;
    
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	
	  public Address getAddress() { return address; }
	  
	  
	  public void setAddress(Address address) { this.address = address; }
	 
	
}
