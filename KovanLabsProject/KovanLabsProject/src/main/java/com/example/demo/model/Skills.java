package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "skill")
public class Skills {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long skillId;
	
	@Column(name = "skill_name")
	private String skillName;

	@ManyToOne
    @JoinColumn(name = "Student_id")
    Employee employee;
	
	public String getskillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public Skills() {
		
	}
	
	public Skills(int skillId,String skillName,Employee employee) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
		this.employee = employee;
	}
	
	public long getSkillId() {
		return skillId;
	}
	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}
	
	
}
