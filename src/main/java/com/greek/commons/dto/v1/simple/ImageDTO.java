package com.greek.commons.dto.v1.simple;

import java.io.Serializable;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Data;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public class ImageDTO implements Serializable {

	private static final long serialVersionUID = -7872870662803782075L;

	private final String filePath;

}
