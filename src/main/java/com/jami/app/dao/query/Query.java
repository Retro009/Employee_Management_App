package com.jami.app.dao.query;

public class Query {
	
	private Query() {}

	public static final String INSERT_EMPLOYEE = "INSERT INTO employee(emp_id,emp_name,emp_department,emp_salary) VALUES(?,?,?,?);";
	public static final String FIND_EMPLOYEE_BY_ID ="SELECT * FROM employee WHERE emp_id=?";
	public static final String FIND_ALL_EMPLOYEE="SELECT * FROM employee";
	public static final String DELETE_EMPLOYEE="DELETE FROM employee WHERE emp_id=?";
	
	public static final String INSERT_SKILL = "INSERT INTO skills (skill_id,skill_desc) VALUES(?,?)";
	public static final String FIND_SKILL_BY_ID = "SELECT * FROM skills WHERE skill_id=?";
	public static final String FIND_ALL_SKILL = "SELECT * FROM skills";
	public static final String DELETE_SKILL = "DELETE FROM skills WHERE skill_id=?";
}
