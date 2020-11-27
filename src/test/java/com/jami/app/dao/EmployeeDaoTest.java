package com.jami.app.dao;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.jdbc.Sql;

import com.jami.app.model.Employee;



@DataJpaTest
@Sql({"../../../../schema.sql", "../../../../test-data.sql"})
@ComponentScan
class EmployeeDaoTest {
	
  @Autowired IEmployeeDao iEmployeeDao;
	
  @Autowired private JdbcTemplate jdbcTemplate;
  
  @Test
  void injectedComponentsAreNotNull(){
	  assertThat(iEmployeeDao).isNotNull();
	  assertThat(jdbcTemplate).isNotNull();
  }
  
  @Test
  void testGetEmployeeById() {
	  long id =  iEmployeeDao.findById(101l).get().getId();
	  assertEquals(101, iEmployeeDao.findById(id).get().getId());
  }
  
  @Test
  void testGetEmployees() {
	  assertEquals(5,iEmployeeDao.findAll().size());
  }
  
//  @Test
//  void testSaveEmployee() {
//	  Employee employee=new Employee();
//	  employee.setId((long) 1);
//	  employee.setSalary(10000);
//	  employee.setDepartment("Management");
//	  assertEquals(true,iEmployeeDao.save(employee));
//  }
  
//  @Test
//  void testRemoveEmployee() {
//	  assertEquals(true,iEmployeeDao.deleteById((long) 101));
//  }

}
