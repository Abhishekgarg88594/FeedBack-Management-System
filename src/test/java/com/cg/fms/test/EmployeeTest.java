package com.cg.fms.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cg.fms.entity.Employee;
import com.cg.fms.model.EmployeeModel;
import com.cg.fms.repository.EmployeeRepo;
import com.cg.fms.service.TrainerManagementService;

@ExtendWith(MockitoExtension.class)
public class EmployeeTest {

	@Mock
	private EmployeeRepo Emprepo;

	@InjectMocks		// injecting package repository marked as @Mock into package service implementation 
	private TrainerManagementService tmsimpl;

	@Test
	@DisplayName("EmployeeService::getAll should return list of existing employee as EmployeeModel List")
	void testGetAll() {
		// checks for the list when getAll is called

		List<Employee> testdata = Arrays.asList(new Employee[] {
				new Employee(1L,"Vamsy","Vamsy123","java,c++", "Trainer"),
				new Employee(2L,"Rajesh","Rajesh123","java,c", "Admin"),
				new Employee(3L,"Deepa Rao","Deepa","angular js","Trainer")


		});

		List<EmployeeModel> expected = Arrays.asList(new EmployeeModel[] {
				new EmployeeModel(1L,"Vamsy","Vamsy123","java,c++","Trainer"),
				new EmployeeModel(2L,"Rajesh","Rajesh123","java,c", "Admin"),
				new EmployeeModel(3L,"Deepa Rao","Deepa","angular js", "Trainer")

		});
		Mockito.when(Emprepo.findAll()).thenReturn(testdata);	 // when repo.findAll() is called, then test data
		List<EmployeeModel> actual = tmsimpl.getAll();	
		assertEquals(expected, actual);

	}


	@Test
	@DisplayName("EmployeeService::getById should return list of existing employee as EmployeeModel List")
	void testGetById() throws Exception {
		// Testdata 1  checks for id 1
		Employee testdata = new Employee(1L,"Vamsy","Vamsy123","java,c++","Trainer");
		Mockito.when(Emprepo.existsById(1L)).thenReturn(true);
		Mockito.when(Emprepo.findById(1L)).thenReturn(Optional.of(testdata));

		EmployeeModel expected = new EmployeeModel(1L,"Vamsy","Vamsy123","java,c++", "Trainer");

		EmployeeModel actual = tmsimpl.getById(1L);	

		assertEquals(expected, actual);

		// Testdata 2  checks for id 2
		Employee testdata1 = new Employee(2L,"Rajesh","Rajesh123","java,c", "Admin");
		Mockito.when(Emprepo.existsById(2L)).thenReturn(true);
		Mockito.when(Emprepo.findById(2L)).thenReturn(Optional.of(testdata1));

		EmployeeModel expected1 = new EmployeeModel(2L,"Rajesh","Rajesh123","java,c", "Admin");

		EmployeeModel actual1 = tmsimpl.getById(2L);	

		assertEquals(expected1, actual1);
	}
}

