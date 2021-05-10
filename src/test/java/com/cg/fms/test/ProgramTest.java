package com.cg.fms.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
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

import com.cg.fms.entity.Program;
import com.cg.fms.model.ProgramModel;
import com.cg.fms.repository.ProgramRepo;
import com.cg.fms.service.ProgramMaintenanceService;

@ExtendWith(MockitoExtension.class)
public class ProgramTest {

	//	@Mock
	//	private ProgramRepo repo;
	//	
	//	@InjectMocks		/* injecting package repository marked as @Mock into package service implementation */
	//	private  ProgramMaintenanceService pmsimpl;
	//	
	//	
	//	@Test
	//	@DisplayName("ProgramService::getAll should return list of existing programs as ProgramModel List")
	//	void testGetAll() {
	//
	//		List<ProgramModel> testdata = Arrays.asList(new ProgramModel[] {
	//				new ProgramModel(1L,LocalDate.parse("2021-02-20"),LocalDate.parse("2021-03-20"),101L,"f01"),
	//				new ProgramModel(2L,LocalDate.parse("2021-04-20"),LocalDate.parse("2021-06-12"), 102L, "f02")
	//			});
	//
	//		List<ProgramModel> expected = Arrays.asList(new ProgramModel[] {
	//				new ProgramModel(1L,LocalDate.parse("2021-02-20"),LocalDate.parse("2021-03-20"),101L,"f01"),
	//				new ProgramModel(2L,LocalDate.parse("2021-04-20"),LocalDate.parse("2021-06-12"), 102L, "f02")
	//			});
	//		
	//		Mockito.when(repo.findAll()).thenReturn(testdata);	/* when repo.findAll() is called, then test data */
	//		
	//		List<ProgramModel> actual = pmsimpl.getAll();	
	//		
	//		assertEquals(expected, actual);
	//	}
	//	
	//	@Test
	//	@DisplayName("ProgramService::getById should return existing program as ProgramModel")
	//	public void testGetById() throws Exception {
	//		
	//		ProgramModel testdata = new ProgramModel(1L,LocalDate.parse("2021-02-20"),LocalDate.parse("2021-03-20"),101L,"f01");
	//		Mockito.when(repo.existsById(1L)).thenReturn(true);
	//		Mockito.when(repo.findById(1L)).thenReturn(Optional.of(testdata));
	//		
	//		ProgramModel expected = new ProgramModel(1L,LocalDate.parse("2021-02-20"),LocalDate.parse("2021-03-20"), 101L,"f01");
	//		
	//		ProgramModel actual = pmsimpl.getById(1L);	
	//		
	//		assertEquals(expected, actual);
	//	}
	//	
	//	@SuppressWarnings("unchecked")
	//	@Test
	//	@DisplayName("ProgramService::getAllByDate should return existing program datewise as ProgramModel List")
	//	void testGetAllByDate() {
	//		
	//		List<ProgramModel> testdata = Arrays.asList(new ProgramModel[] {
	//				new ProgramModel(1L,LocalDate.parse("2021-02-20"),LocalDate.parse("2021-03-20"), null, null),
	//				new ProgramModel(3L,LocalDate.parse("2021-02-20"),LocalDate.parse("2021-05-20"), null, null),
	//				new ProgramModel(4L,LocalDate.parse("2021-02-20"),LocalDate.parse("2021-04-01"), null, null)
	//			});
	//		
	//		List<ProgramModel> expected = Arrays.asList(new ProgramModel[] {
	//				new ProgramModel(1L,LocalDate.parse("2021-02-20"),LocalDate.parse("2021-03-20"), null, null),
	//				new ProgramModel(3L,LocalDate.parse("2021-02-20"),LocalDate.parse("2021-05-20"), null, null),
	//				new ProgramModel(4L,LocalDate.parse("2021-02-20"),LocalDate.parse("2021-04-01"), null, null)
	//			});
	//		
	//		Mockito.when(repo.findAllByDate(LocalDate.parse("2021-02-20"))).thenReturn(testdata);	/* when repo.findAll() is called, then test data */
	//		
	//		List<ProgramModel> actual = pmsimpl.findAllByDate(LocalDate.parse("2021-02-20"));	
	//		
	//		assertEquals(expected, actual);
	//	}
}
