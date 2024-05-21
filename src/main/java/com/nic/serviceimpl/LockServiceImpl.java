package com.nic.serviceimpl;

import java.lang.reflect.Field;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.nic.dto.LockDTO;
import com.nic.entity.CollegeLockStatus;
import com.nic.entity.StandaloneLockStatus;
import com.nic.entity.UniversityLockStatus;
import com.nic.repo.CollegeLockStatusRepo;
import com.nic.repo.StandaloneLockStatusRepo;
import com.nic.repo.UniversityLockStatusRepo;
import com.nic.service.LockService;
import com.nic.util.Constants;

@Service
public class LockServiceImpl implements LockService {

	@Autowired
	private CollegeLockStatusRepo collegeLockStatusRepo;

	@Autowired
	private StandaloneLockStatusRepo standaloneLockStatusRepo;

	@Autowired
	private UniversityLockStatusRepo universityLockStatusRepo;

	@Override
	public ResponseEntity<?> lock(LockDTO dto) {
		var instType = dto.getInstitutionType();
		var aisheCode = dto.getAisheCode();
		var surveyYear = dto.getSurveyYear();
		var status = dto.getStatus();
		var constant = dto.getConstant();

		if (instType.equalsIgnoreCase(Constants.COLLEGE)) {
			CollegeLockStatus entity = collegeLockStatusRepo.findByAisheCodeAndSurveyYear(aisheCode, surveyYear);
			if (entity == null) {
				entity = new CollegeLockStatus();
				entity.setSurveyYear(surveyYear);
				entity.setAisheCode(aisheCode);
			}
			try {
				setFields(constant, status, entity);
			} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Constants.CONSTANT_INVALID_VALIDATION);
			}
			CollegeLockStatus savedEntity = collegeLockStatusRepo.save(entity);
			if (savedEntity != null) {
				return ResponseEntity.status(HttpStatus.CREATED).body(Constants.CREATED_SUCCESSFULLY);
			} else {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Constants.SOMETHING_WENT_WRONG);
			}
		} else if (instType.equalsIgnoreCase(Constants.UNIVERSITY)) {
			UniversityLockStatus entity = universityLockStatusRepo.findByAisheCodeAndSurveyYear(aisheCode, surveyYear);
			if (entity == null) {
				entity = new UniversityLockStatus();
				entity.setSurveyYear(surveyYear);
				entity.setAisheCode(aisheCode);
			}
			try {
				setFields(constant, status, entity);
			} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Constants.CONSTANT_INVALID_VALIDATION);
			}
			UniversityLockStatus savedEntity = universityLockStatusRepo.save(entity);
			if (savedEntity != null) {
				return ResponseEntity.status(HttpStatus.CREATED).body(Constants.CREATED_SUCCESSFULLY);
			} else {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Constants.SOMETHING_WENT_WRONG);
			}
		} else if (instType.equalsIgnoreCase(Constants.STAND_ALONE)) {
			StandaloneLockStatus entity = standaloneLockStatusRepo.findByAisheCodeAndSurveyYear(aisheCode, surveyYear);
			if (entity == null) {
				entity = new StandaloneLockStatus();
				entity.setSurveyYear(surveyYear);
				entity.setAisheCode(aisheCode);
			}
			try {
				setFields(constant, status, entity);
			} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Constants.CONSTANT_INVALID_VALIDATION);
			}
			StandaloneLockStatus savedEntity = standaloneLockStatusRepo.save(entity);
			if (savedEntity != null) {
				return ResponseEntity.status(HttpStatus.CREATED).body(Constants.CREATED_SUCCESSFULLY);
			} else {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Constants.SOMETHING_WENT_WRONG);
			}
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Constants.INSTITUTION_VALIDATION);
		}
	}

	public static void setFields(List<String> constants, boolean value, Object entity)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Class<?> entityClass = entity.getClass();
		for (String constant : constants) {

			Field field = entityClass.getDeclaredField(constant);
			field.setAccessible(true);
			field.set(entity, value);

		}
	}

}
