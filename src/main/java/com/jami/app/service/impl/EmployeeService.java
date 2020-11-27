package com.jami.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jami.app.dao.IEmployeeDao;
import com.jami.app.dto.EmployeeDto;
import com.jami.app.mapper.IEmployeeMapper;
import com.jami.app.model.Employee;
import com.jami.app.service.IEmployeeService;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class EmployeeService implements IEmployeeService {

	private final IEmployeeDao employeeDao;
	private final IEmployeeMapper employeeMapper;
	
	@Override
	public EmployeeDto search(Long employeeId) {
		return employeeMapper.toDto(employeeDao.findById(employeeId).get());
	}

	@Override
	public List<EmployeeDto> searchAll() {
		List<Employee> employees = employeeDao.findAll();
		List<EmployeeDto> employeesDto = new ArrayList<>();
		for (Employee employee : employees) {
			EmployeeDto employeeDto = employeeMapper.toDto(employee);
			employeesDto.add(employeeDto);
		}
		return employeesDto;
	}

	@Override
	public void create(EmployeeDto employeeDto) {
		employeeDao.save(employeeMapper.toModel(employeeDto));
	}

	@Override
	public void remove(Long employeeId) {
		employeeDao.delete(employeeDao.findById(employeeId).get());
	}

	@Override
	public void update(EmployeeDto employeeDto) {
		employeeDao.save(employeeMapper.toModel(employeeDto));
	}

}
