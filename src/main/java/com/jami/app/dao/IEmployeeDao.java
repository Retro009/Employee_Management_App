package com.jami.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.jami.app.model.Employee;

public interface IEmployeeDao extends JpaRepository<Employee, Long>,CrudRepository<Employee, Long> {
}
