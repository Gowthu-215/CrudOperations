package com.learn.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.springboot.entities.Employee;

public interface EmployeeRepository extends JpaRepository <Employee, String> {
	

}
