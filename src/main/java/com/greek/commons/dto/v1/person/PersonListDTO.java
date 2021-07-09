package com.greek.commons.dto.v1.person;

import java.io.Serializable;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Data;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public class PersonListDTO implements Serializable {

	private static final long serialVersionUID = -5341388224130637901L;

	private Long id;
	private String name;
	private String lastName;

}
