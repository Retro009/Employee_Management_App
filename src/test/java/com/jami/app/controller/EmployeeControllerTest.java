package com.jami.app.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.jami.app.dto.EmployeeDto;
import com.jami.app.service.impl.EmployeeService;

@AutoConfigureMockMvc
@WebMvcTest
@ContextConfiguration(classes= {EmployeeController.class, EmployeeService.class})
class EmployeeControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private EmployeeService employeeService;

	@Test
	void testGetEmployee() throws Exception {
		EmployeeDto employeeDto = new EmployeeDto();
		employeeDto.setId(100l);
		when(employeeService.search(100l)).thenReturn(employeeDto);
		mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8090/user/employee/100")
				.content("100")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value(100));
	}
}
