package com.jami.app.service;

import java.util.List;

import com.jami.app.dto.EmployeeDto;

public interface IEmployeeService {

	EmployeeDto search(Long employeeId);
	List<EmployeeDto> searchAll();
	void create(EmployeeDto employee);
	void remove(Long employeeId);
	void update(EmployeeDto employee);
}
