package com.cg.fms.service;

import java.util.List;

import com.cg.fms.exception.FMSException;
import com.cg.fms.model.EmployeeModel;
import com.cg.fms.model.FeedbackProgramModel;

public interface ITrainerManagement {



	public EmployeeModel addTrainer(EmployeeModel employeeMaster) throws Exception;

	public boolean removeEmployee(long employeeId) throws Exception;
	
	EmployeeModel updateEmployee(long employee_id , EmployeeModel empmodel) throws  Exception;

	public EmployeeModel getById(long id) throws Exception;	

	public List<EmployeeModel> getAll();

}
