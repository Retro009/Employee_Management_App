package com.jami.app.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.jami.app.model.Skill;

public interface ISkillDao extends JpaRepository<Skill, Long> {
}

