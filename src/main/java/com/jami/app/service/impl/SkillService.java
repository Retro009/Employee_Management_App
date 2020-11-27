package com.jami.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.jami.app.dao.ISkillDao;
import com.jami.app.dto.SkillDto;
import com.jami.app.model.Skill;
import com.jami.app.service.ISkillService;

public class SkillService implements ISkillService{

	private ISkillDao skillDao;
	
	@Override
	public SkillDto search(Long skillId) {
		SkillDto skillDto=new SkillDto();		
		Skill skill=skillDao.findById(skillId).get();
		skillDto.setId(skill.getId());
		skillDto.setDescription(skill.getDescription());
		return skillDto;
	}

	@Override
	public List<SkillDto> searchAll() {
		List<Skill> skills=skillDao.findAll();
		List<SkillDto> skillsDto=new ArrayList<SkillDto>();
		SkillDto skillDto=null;
		for(Skill skill:skills) {
			skillDto=new SkillDto();
			skillDto.setId(skill.getId());
			skillDto.setDescription(skill.getDescription());
			skillsDto.add(skillDto);
		}
		return skillsDto;
	}

	@Override
	public void create(SkillDto skillDto) {
		Skill skill=new Skill();
		skill.setId(skillDto.getId());
		skill.setDescription(skillDto.getDescription());
		skillDao.save(skill);
	}

	@Override
	public void remove(Long skillId) {
		skillDao.delete(skillDao.findById(skillId).get());
	}

	@Override
	public void update(SkillDto employee) {
		// TODO Auto-generated method stub
		
	}

}
