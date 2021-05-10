package com.cg.fms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.fms.entity.Program;

@Repository
public interface ProgramRepo extends JpaRepository<Program, Long> {


}
