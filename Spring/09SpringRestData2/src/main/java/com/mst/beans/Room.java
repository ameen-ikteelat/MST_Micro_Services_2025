package com.mst.beans;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Data
public class Room {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Changed from 'int' to 'Long'
    
    private String number;
    private int capacity;
    
    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL) // Cascade operations to Students
    private Set<Student> students = new HashSet<>();
    
    @ManyToMany(mappedBy = "rooms")
    private Set<Course> courses = new HashSet<>(); 
}
