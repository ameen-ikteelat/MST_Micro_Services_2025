package com.mst.repositroy.bean;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import com.mst.repositroy.bean.Employee;
import java.util.List;
import java.util.Set;


@Getter
@Setter
@ToString
@Entity
@Table(name="departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="departId")
    private int id;
    private String name;

    //1 depart : M employees
    @JsonManagedReference
    @OneToMany(mappedBy = "department" ,fetch = FetchType.EAGER ,cascade = CascadeType.ALL)
    private List<Employee> employees;
}
