package com.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loan.model.LoginModel;

@Repository
public interface LoginRepository extends JpaRepository<LoginModel,String> {

}
