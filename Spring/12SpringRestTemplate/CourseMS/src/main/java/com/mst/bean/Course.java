package com.mst.bean;

import java.util.List;
import java.util.Set;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Long> getStudentIds() {
		return studentIds;
	}
	public void setStudentIds(List<Long> studentIds) {
		this.studentIds = studentIds;
	}
	public List<Long> getRoomIds() {
		return roomIds;
	}
	public void setRoomIds(List<Long> roomIds) {
		this.roomIds = roomIds;
	}
	@ElementCollection
	private List<Long> studentIds;
	@ElementCollection
	private List<Long> roomIds;
}
