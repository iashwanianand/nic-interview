package com.nic.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nic.entity.UniversityLockStatus;

@Repository
public interface UniversityLockStatusRepo extends JpaRepository<UniversityLockStatus, Integer> {

	@Query("FROM UniversityLockStatus WHERE aisheCode = :aisheCode AND surveyYear = :surveyYear")
	UniversityLockStatus findByAisheCodeAndSurveyYear(String aisheCode, Integer surveyYear);
}
