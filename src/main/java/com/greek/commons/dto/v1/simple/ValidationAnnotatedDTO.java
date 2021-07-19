package com.greek.commons.dto.v1.simple;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Data;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public class ValidationAnnotatedDTO implements Serializable {

	private static final long serialVersionUID = -942697419901293364L;

	@NotNull
	@Size(min = 5)
	private String name;

}
