//package com.jami.app.mapper;
//
//import com.jami.app.dto.EmployeeDto;
//import com.jami.app.model.Employee;
//import javax.annotation.Generated;
//import org.springframework.stereotype.Component;
//
//@Generated(
//    value = "org.mapstruct.ap.MappingProcessor",
//    date = "2020-10-22T07:41:08+0530",
//    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 1.8.0_192 (Oracle Corporation)"
//)
//@Component
//public class IEmployeeMapperImpl implements IEmployeeMapper {
//
//    @Override
//    public Employee toModel(EmployeeDto dto) {
//        if ( dto == null ) {
//            return null;
//        }
//
//        Employee employee = new Employee();
//
//        employee.setId( dto.getId() );
//        employee.setName( dto.getName() );
//        employee.setSalary( dto.getSalary() );
//        employee.setDepartment( dto.getDepartment() );
//
//        return employee;
//    }
//
//    @Override
//    public EmployeeDto toDto(Employee model) {
//        if ( model == null ) {
//            return null;
//        }
//
//        EmployeeDto employeeDto = new EmployeeDto();
//
//        employeeDto.setId( model.getId() );
//        employeeDto.setName( model.getName() );
//        employeeDto.setSalary( model.getSalary() );
//        employeeDto.setDepartment( model.getDepartment() );
//
//        return employeeDto;
//    }
//}
