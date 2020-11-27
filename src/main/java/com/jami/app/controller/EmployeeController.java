package com.jami.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.jami.app.dto.EmployeeDto;
import com.jami.app.service.IEmployeeService;

@RestController
@RequestMapping("/user")
//@ConfigurationProperties(prefix="")
public class EmployeeController {
	
//	@Value("${name}")
//	private String name;
	@Autowired
	IEmployeeService employeeService;
	
	@RequestMapping(value="employee/{id}", method=RequestMethod.GET, produces="application/json" )
	public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id")Integer id){
		System.out.println("Hello");
		return new ResponseEntity<> (employeeService.search(id.longValue()),HttpStatus.OK);
	}
	
	@RequestMapping(value="employee", method=RequestMethod.GET, produces="application/json" )
	public ResponseEntity<List<EmployeeDto>> getEmployees(){
		return new ResponseEntity<> (employeeService.searchAll(),HttpStatus.OK);
	}
	
	@RequestMapping(value="employee", method=RequestMethod.POST, produces="application/json" )
	public ResponseEntity<Void> addEmployee(@RequestBody EmployeeDto employee,UriComponentsBuilder builder){
		employeeService.create(employee);
		return new ResponseEntity<>(HttpStatus.CREATED);
		
	}
	
	@RequestMapping(value="employee/{id}", method=RequestMethod.DELETE, produces="application/json" )
	public ResponseEntity<Void> removeEmployee(@PathVariable("id")Integer id){
		employeeService.remove(id.longValue());
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(value="employee", method=RequestMethod.PUT, produces="application/json")
	public ResponseEntity<Void> updateEmployee(@RequestBody EmployeeDto employee,UriComponentsBuilder builder){
		employeeService.update(employee);
		return new ResponseEntity<>(HttpStatus.CREATED);
		
	}
}