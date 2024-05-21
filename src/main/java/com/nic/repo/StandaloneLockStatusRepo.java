package com.nic.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nic.entity.StandaloneLockStatus;

@Repository
public interface StandaloneLockStatusRepo extends JpaRepository<StandaloneLockStatus, Integer> {

	@Query("FROM StandaloneLockStatus WHERE aisheCode = :aisheCode AND surveyYear = :surveyYear")
	StandaloneLockStatus findByAisheCodeAndSurveyYear(String aisheCode, Integer surveyYear);

}
