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
public class Skill {
	@Id
	@Column(name="skill_id")
	private long id;
	
	@Column(name="skill_desc")
	private String description;
}
