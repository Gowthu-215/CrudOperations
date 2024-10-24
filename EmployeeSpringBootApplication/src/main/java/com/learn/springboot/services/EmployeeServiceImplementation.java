 package com.learn.springboot.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.learn.springboot.Repository.EmployeeRepository;
import com.learn.springboot.entities.Employee;
@Service
public class EmployeeServiceImplementation implements EmployeeSevice{
	
	EmployeeRepository emprepo;
	public EmployeeServiceImplementation(EmployeeRepository emprepo) {
		super();
		this.emprepo = emprepo;
	}

	@Override
	public String createEmp(Employee emp) {
		emprepo.save(emp);
		return "Employee object is created and saved";
	}

	@Override
	public Employee getEmpInfo(String empId) {
		Employee emp=emprepo.findById(empId).get();
		return emp;
	}
	

	@Override
	public List<Employee> getAllEmpInfo() {
		return (List<Employee>) emprepo.findAll();
	}

	@Override
	public String updateEmp(Employee emp) {
		emprepo.save(emp);
		return "Employee object is updated and saved";
	}

	@Override
	public String deleteEmp(String empId) {
		
		emprepo.deleteById(empId);
		return "employee object is deleted and saved";
	}

	
	

	
	
	
	
	
		
	

}
