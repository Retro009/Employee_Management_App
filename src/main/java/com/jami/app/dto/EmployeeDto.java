package com.jami.app.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private double salary;
	private String department;
}
