package com.cg.fms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

// Employee table entity

@Entity
@Table(name = "employees_master")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "employee_id")
	private long employeeId;                      // primary Key employeeid

	@Column(name = "employee_name")
	private String employeeName;                 // employee name 

	@Column(name = "employee_password")
	private String employeePassword;            // employee password 

	@Column(name = "employee_role")
	private String employeeRole;                 // role of employee

	@Column(name = "employee_skill")
	private String empSkill;                     // skills of employee

	@ManyToOne
	@JoinColumn(name = "training_id")
	private Program program;                    // one to one mapping of employees to program

	@ManyToOne
	@JoinColumn(name = "trainer_id")
	private FeedbackTrainerEntity fbtrainer;     // many to one mapping to feedbak of trainer entity

	public Employee() {
		/* default constructor */
	}

	/* Parameterized Constructor*/


	public Employee(long employeeId, String employeeName, String employeePassword, String employeeRole, String empSkill) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeePassword = employeePassword;
		this.employeeRole = employeeRole;
		this.empSkill = empSkill;
	}


	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeePassword() {
		return employeePassword;
	}
	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}
	public String getEmployeeRole() {
		return employeeRole;
	}
	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}
	public String getEmpSkill() {
		return empSkill;
	}
	public void setEmpSkill(String empSkill) {
		this.empSkill = empSkill;
	}
	public Program getProgram() {
		return program;
	}

	public void setProgram(Program program) {
		this.program = program;
	}

	public FeedbackTrainerEntity getFbtrainer() {
		return fbtrainer;
	}

	public void setFbtrainer(FeedbackTrainerEntity fbtrainer) {
		this.fbtrainer = fbtrainer;
	}



	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeePassword="
				+ employeePassword + ", employeeRole=" + employeeRole + ", empSkill=" + empSkill + "]";
	}



}


