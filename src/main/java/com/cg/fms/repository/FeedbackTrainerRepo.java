package com.cg.fms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.fms.entity.FeedbackTrainerEntity;

import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackTrainerRepo extends JpaRepository<FeedbackTrainerEntity , String> {

}
