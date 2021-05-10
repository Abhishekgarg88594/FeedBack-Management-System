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

import com.cg.fms.entity.Course;
import com.cg.fms.model.CourseModel;
import com.cg.fms.repository.CourseRepo;
import com.cg.fms.service.CourseMaintenanceService;

@ExtendWith(MockitoExtension.class)
public class CourseTest {

	@Mock
	private CourseRepo repo;

	@InjectMocks		/* injecting package repository marked as @Mock into package service implementation */
	private  CourseMaintenanceService cmsimpl;

	@Test
	@DisplayName("CourseService::getAll should return list of existing courses as CourseModel List")
	void testGetAll() {

		// checks for the list when getAll is called

		List<Course> testdata = Arrays.asList(new Course[] {
				new Course(1L,"Java", "A java fundamental book", 10),
				new Course(2L,"Pyhton", "A python fundamental book", 15)
		});               

		List<CourseModel> expected = Arrays.asList(new CourseModel[] {
				new CourseModel(1L,"Java", "A java fundamental book", 10),
				new CourseModel(2L,"Pyhton", "A python fundamental book", 15)
		});

		Mockito.when(repo.findAll()).thenReturn(testdata);	/* when repo.findAll() is called, then test data */
		List<CourseModel> actual = cmsimpl.getAll();	

		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("CourseService::getById should return list of existing courses as CourseModel")
	void testGetById() throws Exception {
		// Testdata 1  checks for id 1
		Course testdata = new Course(1L, "Java", "Java fundamentals",20);
		Mockito.when(repo.existsById(1L)).thenReturn(true);
		Mockito.when(repo.findById(1L)).thenReturn(Optional.of(testdata));

		CourseModel expected = new CourseModel(1L, "Java", "Java fundamentals",20);

		CourseModel actual = cmsimpl.getById(1L);	

		assertEquals(expected, actual);


		// Testdata 2 checks for is 2

		Course testdata2 = new Course(2L, "Python", "Python fundamentals",20);
		Mockito.when(repo.existsById(2L)).thenReturn(true);
		Mockito.when(repo.findById(2L)).thenReturn(Optional.of(testdata2));

		CourseModel expected1 = new CourseModel(2L, "Python", "Python fundamentals",20);

		CourseModel actual1 = cmsimpl.getById(2L);	

		assertEquals(expected1, actual1);
	}


}