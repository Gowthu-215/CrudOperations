package com.learn.springboot.services;

import java.util.List;

import com.learn.springboot.entities.Employee;

public interface EmployeeSevice {
   public String createEmp(Employee emp);
	
	public Employee getEmpInfo(String empId);
	
	public List<Employee> getAllEmpInfo();
	
	public String updateEmp(Employee emp);
	
	public String deleteEmp(String empId);
	

}
