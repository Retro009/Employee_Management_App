package com.jami.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

	@Id
	@Column(name="emp_id")
	private Long id;
	@Column(name="emp_name")
	private String name;
	@Column(name="emp_salary")
	private double salary;
	@Column(name="emp_department")
	private String department;
}
