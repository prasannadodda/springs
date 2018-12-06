package com.cg.springmvcone.dto;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="employee_management")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@SequenceGenerator(name="emp_seq",sequenceName="emp_seq_eid")
	@Column(name="emp_id")
	private Integer empId;
	
	@Column(name="emp_name")
	@NotEmpty(message="Name should not be empty")
	private String empName;
	
	@Column(name="emp_deg")
	private String empDegnation;
	
	@Column(name="emp_sal")
	private String empSalary;
	
	@Column(name="emp_gen")
	private String empGender;
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDegnation() {
		return empDegnation;
	}
	public void setEmpDegnation(String empDegnation) {
		this.empDegnation = empDegnation;
	}
	public String getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	

}
