package com.nic.dto;

import java.io.Serializable;
import java.util.List;

import com.nic.util.Constants;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class LockDTO implements Serializable {

	private static final long serialVersionUID = 4842734155106948172L;

	@NotBlank(message = Constants.INSTITUTION_VALIDATION)
	@Size(min = 1, max = 1, message = Constants.INSTITUTION_VALIDATION)
	private String institutionType;

	@NotBlank(message = Constants.AISCHE_CODE_VALIDATION)
	private String aisheCode;

	@Positive(message = Constants.SURVEY_YEAR_POSITIVE_VALIDATION)
	private int surveyYear;

	@NotNull(message = Constants.STATUS_VALIDATION)
	private Boolean status;

	@NotNull(message = Constants.CONSTANT_NULL_VALIDATION)
	@Size(min = 1, message = Constants.CONSTANT_ELEMENT_VALIDATION)
	private List<@NotBlank(message = Constants.CONSTANT_BLANK_VALIDATION) String> constant;

}
