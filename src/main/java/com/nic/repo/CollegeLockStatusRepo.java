package com.nic.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nic.entity.CollegeLockStatus;

@Repository
public interface CollegeLockStatusRepo extends JpaRepository<CollegeLockStatus, Integer> {

	@Query("FROM CollegeLockStatus WHERE aisheCode = :aisheCode AND surveyYear = :surveyYear")
	CollegeLockStatus findByAisheCodeAndSurveyYear(String aisheCode, Integer surveyYear);

}
