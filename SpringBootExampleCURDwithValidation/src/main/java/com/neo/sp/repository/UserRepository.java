package com.neo.sp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neo.sp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
