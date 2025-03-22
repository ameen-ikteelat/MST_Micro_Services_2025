package com.mst.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mst.bean.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
