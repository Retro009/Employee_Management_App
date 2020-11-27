package com.jami.app.service;

import java.util.List;

import com.jami.app.dto.SkillDto;;

public interface ISkillService {

	SkillDto search(Long skillId);
	List<SkillDto> searchAll();
	void create(SkillDto skill);
	void remove(Long skillId);
	void update(SkillDto employee);
}

