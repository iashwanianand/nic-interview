package com.nic.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "college_lock_status")
public class CollegeLockStatus implements Serializable {

	private static final long serialVersionUID = -939754884199400839L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "aishe_code", nullable = false)
	private String aisheCode;

	@Column(name = "survey_year", nullable = false)
	private Integer surveyYear;

	@Column(name = "basic_detail")
	private Boolean basicDetail;

	@Column(name = "address")
	private Boolean address;

	@Column(name = "econtact")
	private Boolean econtact;

	@Column(name = "vernacular_name")
	private Boolean vernacularName;

	@Column(name = "alternate_name")
	private Boolean alternateName;

	@Column(name = "list_of_department")
	private Boolean listOfDepartment;

	@Column(name = "list_of_faculty")
	private Boolean listOfFaculty;

	@Column(name = "regular_prog_through_department")
	private Boolean regularProgThroughDepartment;

	@Column(name = "regular_prog_other")
	private Boolean regularProgOther;

	@Column(name = "enroll_regular_prog_through_department")
	private Boolean enrollRegularProgThroughDepartment;

	@Column(name = "enroll_regular_prog_other")
	private Boolean enrollRegularProgOther;

	@Column(name = "enroll_regular_foreign_student_through_department")
	private Boolean enrollRegularForeignStudentThroughDepartment;

	@Column(name = "enroll_regular_foreign_student_through_other")
	private Boolean enrollRegularForeignStudentThroughOther;

	@Column(name = "exam_result_regular_through_department")
	private Boolean examResultRegularThroughDepartment;

	@Column(name = "exam_result_regular_through_other")
	private Boolean examResultRegularThroughOther;

	@Column(name = "placement_details")
	private Boolean placementDetails;

	@Column(name = "teaching_staff")
	private Boolean teachingStaff;

	@Column(name = "teaching_staff_econtact")
	private Boolean teachingStaffEcontact;

	@Column(name = "teaching_staff_vernacular_name")
	private Boolean teachingStaffVernacularName;

	@Column(name = "teaching_staff_sanctioned_strength")
	private Boolean teachingStaffSanctionedStrength;

	@Column(name = "non_teaching_staff_detail")
	private Boolean nonTeachingStaffDetail;

	@Column(name = "financial_info_income")
	private Boolean financialInfoIncome;

	@Column(name = "financial_info_expenditure")
	private Boolean financialInfoExpenditure;

	@Column(name = "infra")
	private Boolean infra;

	@Column(name = "scholarship")
	private Boolean scholarship;

	@Column(name = "fellowship")
	private Boolean fellowship;

	@Column(name = "education_loan")
	private Boolean educationLoan;

	@Column(name = "accreditation")
	private Boolean accreditation;

	@Column(name = "final_lock")
	private Boolean finalLock;

	@Column(name = "booleanfellowship")
	private Boolean booleanfellowship;

}
