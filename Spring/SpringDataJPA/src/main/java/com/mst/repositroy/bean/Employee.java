package com.mst.repositroy.bean;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="employees")
@Getter
@Setter
@ToString
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique=true , nullable=false , length=50, name="fullName" )
    private String name;
    private int age;
    private int salary;
    @Enumerated(EnumType.ORDINAL)
    private Gender gender;

    @ManyToOne
    @JoinColumn(name = "departId" , nullable = false)
    private Department department;

    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "address_City", referencedColumnName = "City"),
            @JoinColumn(name = "address_Code", referencedColumnName = "Code")
    })
    private Address address;
}
