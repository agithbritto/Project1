package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {
	
	@Id
	private long iddepartment;
	
	public long getIddepartment() {
		return iddepartment;
	}

	public void setIddepartment(long iddepartment) {
		this.iddepartment = iddepartment;
	}
	@Column(name = "department_name")
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Department() {
		
	}
	
	public Department(String department_name) {
		super();
		this.departmentName = departmentName;
	}
	
	
}
