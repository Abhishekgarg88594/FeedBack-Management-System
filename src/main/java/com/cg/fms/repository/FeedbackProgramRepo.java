
package com.cg.fms.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.cg.fms.entity.FeedbackProgramEntity;

@Repository
public interface FeedbackProgramRepo extends JpaRepository<FeedbackProgramEntity, String> {

}
