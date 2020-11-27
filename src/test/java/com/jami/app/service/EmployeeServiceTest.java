package com.jami.app.service;



import java.util.Optional;

//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.jami.app.dao.IEmployeeDao;
import com.jami.app.model.Employee;
import com.jami.app.service.impl.EmployeeService;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

	@InjectMocks EmployeeService employeeService;
	@Mock IEmployeeDao employeeDao;
	
	@Test
	void testGetEmployeeById() {
		Employee employee = new Employee();
		Optional<Employee> opt = Optional.of(employee);
		employee.setId(101l);
		//when(employeeDao.findById(101l)).thenReturn(opt);
		//assertEquals(101, employeeService.search(101l).getId());
		//assertEquals(opt, employeeService.search(101l));
	}
}
