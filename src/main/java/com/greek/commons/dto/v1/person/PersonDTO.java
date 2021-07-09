package com.greek.commons.dto.v1.person;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.greek.commons.annotations.ExtendedEmailValidator;
import com.gvt.core.domain.types.Identificable;
import com.gvt.core.domain.types.VersionableDTO;

import lombok.Data;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public class PersonDTO implements Identificable, VersionableDTO, Serializable {

	private static final long serialVersionUID = -8293952137314357678L;

	private Long id;

	@Size(max = 16)
	private String code;

	@NotNull
	@Size(max = 64)
	private String name;

	@NotNull
	@Size(max = 64)
	private String lastName;

	@NotNull
	private Long identityDocumentTypeId;

	@NotNull
	@Size(max = 64)
	private String identityDocument;

	@Size(max = 64)
	private String sanitaryDocument;

	@NotNull
	@Size(max = 32)
	private String mobilePhone;

	@Size(max = 32)
	private String homePhone;

	@ExtendedEmailValidator
	@Size(max = 64)
	private String email;

	@NotNull
	private String addressLine1;
	private String addressLine2;

	private Long provinceId;
	private Long municipalityId;
	@NotNull
	private Long postalCodeId;

	@Past
	private LocalDate birthDate;

	@Min(0)
	private Float age;

	private String url1FileName;

	private Long sexId;
	private Long bloodGroupId;
	private Long countryBirthId;

	private Long version;

	@Override
	public boolean isExternalDataSource() {
		return false;
	}

	@Override
	public void setExternalDataSource(boolean value) {

	}

}
