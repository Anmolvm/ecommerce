package com.hsbc.auditing.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hsbc.auditing.models.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
