package com.mst.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mst.bean.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
