package com.greek.commons.dto.v1.user;

import java.io.Serializable;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.gvt.core.domain.types.Identificable;
import com.gvt.core.domain.types.VersionableDTO;

import lombok.Data;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public class SystemUserDTO implements Identificable, VersionableDTO, Serializable {

	private static final long serialVersionUID = -6229937870090738715L;

	private Long id;
	private Long version;

	private String idValidation;
	private String cedula;
	private String nombres;
	private String apellidos;
	private String telefono;
	private String email;
	private String direccion;
	private String contrasena;
	private String nombreProfesion;
	private String nombreDistintivoPersona;
	private String observaciones;

	private Long idProfesion;
	private Long idDistintivoPersona;

	@Override
	public boolean isExternalDataSource() {
		return false;
	}

	@Override
	public void setExternalDataSource(boolean value) {

	}
}
