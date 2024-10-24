 package com.learn.springboot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.springboot.entities.Employee;
import com.learn.springboot.services.EmployeeSevice;


@RestController
@RequestMapping("Employee")
public class EmployeeController {
	
	EmployeeSevice empserv;

	public EmployeeController(EmployeeSevice empserv) {
		super();
		this.empserv = empserv;
	}
	
	@PostMapping
	public String createEmp(@RequestBody Employee emp) { 
		String msg =empserv.createEmp(emp);
		return msg;
	}
	@GetMapping(value="{empId}")
	public Employee getEmpInfo(@PathVariable String empId) {
		Employee emp=empserv.getEmpInfo(empId);
		return emp;
	}
	
	@GetMapping(value="getAllEmpInfo")
	public List<Employee> getAllEmpInfo() {
		return empserv.getAllEmpInfo();
	}
		
	
	@PutMapping
	public String updateEmp( @RequestBody Employee emp) {
		String msg=empserv.updateEmp(emp);
		return msg;
	}
	
	@DeleteMapping(value="{empId}")
    public String deleteEmp(@PathVariable String empId) {
		empserv.deleteEmp(empId);
		return "employee object is deleted and saved";
	      }
	
	
   

	
	
	
	
	
	
	

}
