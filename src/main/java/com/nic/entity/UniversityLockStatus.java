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
@Table(name = "university_lock_status")
public class UniversityLockStatus implements Serializable {

    private static final long serialVersionUID = 7378972739683690535L;

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

	@Column(name = "regional_center")
	private Boolean regionalCenter;

	@Column(name = "list_of_faculty")
	private Boolean listOfFaculty;

	@Column(name = "list_of_department")
	private Boolean listOfDepartment;

	@Column(name = "regular_prog_through_faculty")
	private Boolean regularProgThroughFaculty;

	@Column(name = "regular_prog_through_department")
	private Boolean regularProgThroughDepartment;

	@Column(name = "regular_prog_other")
	private Boolean regularProgOther;

	@Column(name = "distance_prog_through_faculty")
	private Boolean distanceProgThroughFaculty;

	@Column(name = "distance_prog_through_department")
	private Boolean distanceProgThroughDepartment;

	@Column(name = "distance_prog_other")
	private Boolean distanceProgOther;

	@Column(name = "enroll_regular_prog_through_faculty")
	private Boolean enrollRegularProgThroughFaculty;

	@Column(name = "enroll_regular_prog_through_department")
	private Boolean enrollRegularProgThroughDepartment;

	@Column(name = "enroll_regular_prog_other")
	private Boolean enrollRegularProgOther;

	@Column(name = "enroll_distance_prog_through_faculty")
	private Boolean enrollDistanceProgThroughFaculty;

	@Column(name = "enroll_distance_prog_through_department")
	private Boolean enrollDistanceProgThroughDepartment;

	@Column(name = "enroll_distance_prog_other")
	private Boolean enrollDistanceProgOther;

	@Column(name = "enroll_distance_prog_regional_center_through_faculty")
	private Boolean enrollDistanceProgRegionalCenterThroughFaculty;

	@Column(name = "enroll_distance_prog_regional_center_through_department")
	private Boolean enrollDistanceProgRegionalCenterThroughDepartment;

	@Column(name = "enroll_distance_prog_regional_center_through_other")
	private Boolean enrollDistanceProgRegionalCenterThroughOther;

	@Column(name = "enroll_regular_foreign_student_through_faculty")
	private Boolean enrollRegularForeignStudentThroughFaculty;

	@Column(name = "enroll_regular_foreign_student_through_department")
	private Boolean enrollRegularForeignStudentThroughDepartment;

	@Column(name = "enroll_regular_foreign_student_through_other")
	private Boolean enrollRegularForeignStudentThroughOther;

	@Column(name = "enroll_distance_foreign_student_through_faculty")
	private Boolean enrollDistanceForeignStudentThroughFaculty;

	@Column(name = "enroll_distance_foreign_student_through_department")
	private Boolean enrollDistanceForeignStudentThroughDepartment;

	@Column(name = "enroll_distance_foreign_student_through_other")
	private Boolean enrollDistanceForeignStudentThroughOther;

	@Column(name = "enroll_foreign_student_count")
	private Boolean enrollForeignStudentCount;

	@Column(name = "exam_result_regular_through_faculty")
	private Boolean examResultRegularThroughFaculty;

	@Column(name = "exam_result_regular_through_department")
	private Boolean examResultRegularThroughDepartment;

	@Column(name = "exam_result_regular_through_other")
	private Boolean examResultRegularThroughOther;

	@Column(name = "exam_result_distance_through_faculty")
	private Boolean examResultDistanceThroughFaculty;

	@Column(name = "exam_result_distance_through_department")
	private Boolean examResultDistanceThroughDepartment;

	@Column(name = "exam_result_distance_through_other")
	private Boolean examResultDistanceThroughOther;

	@Column(name = "exam_result_private_external")
	private Boolean examResultPrivateExternal;

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

	@Column(name = "off_shore_center_college")
	private Boolean offShoreCenterCollege;

	@Column(name = "regulatory_info")
	private Boolean regulatoryInfo;

	@Column(name = "final_lock")
	private Boolean finalLock;

	@Column(name = "exam_result_public_external")
	private Boolean examResultPublicExternal;

	@Column(name = "distance_exam_result_regional_faculty")
	private Boolean distanceExamResultRegionalFaculty;

	@Column(name = "distance_exam_result_regional_department")
	private Boolean distanceExamResultRegionalDepartment;

	@Column(name = "distance_exam_result_regional_other")
	private Boolean distanceExamResultRegionalOther;


}
