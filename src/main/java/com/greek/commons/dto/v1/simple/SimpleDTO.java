package com.greek.commons.dto.v1.simple;

import java.io.Serializable;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Data;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public class SimpleDTO implements Serializable {

	private static final long serialVersionUID = -7872870662803782075L;

	private final Long id = null;
	private String code;
	private String description;
	private Long version;

}
