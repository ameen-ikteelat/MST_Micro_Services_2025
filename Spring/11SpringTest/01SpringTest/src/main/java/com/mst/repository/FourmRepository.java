package com.mst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mst.repository.bean.Forum;


@Repository
public interface FourmRepository extends JpaRepository<Forum, Integer> {

}
