package com.greek.commons.dto.v1.simple;

import java.io.Serializable;

import lombok.Data;

@Data
public class SimpleDto implements Serializable {

	private static final long serialVersionUID = -7872870662803782075L;

	private Long id;
	private String code;
	private String description;
	private Long version;

}
