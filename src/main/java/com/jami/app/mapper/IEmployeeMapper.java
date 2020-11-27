package com.jami.app.mapper;

import org.mapstruct.Mapper;

import com.jami.app.dto.EmployeeDto;
import com.jami.app.model.Employee;

@Mapper( componentModel = "spring")
public interface IEmployeeMapper {

	
	Employee toModel(EmployeeDto dto);
	EmployeeDto toDto(Employee model);
	
}
