package com.greek.commons.dto.v1.simple;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ValidationAnnotatedDto implements Serializable {

	private static final long serialVersionUID = -942697419901293364L;

	@NotNull
	@Size(min = 5)
	private String name;

}
