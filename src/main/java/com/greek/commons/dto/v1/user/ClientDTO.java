package com.greek.commons.dto.v1.user;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.gvt.core.domain.types.Identificable;
import com.gvt.core.domain.types.VersionableDTO;

import lombok.Data;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public class ClientDTO implements Identificable, VersionableDTO, Serializable {

	private static final long serialVersionUID = -1140876431082835376L;

	private Long id;
	private Long version;

	private String cedula;
	private String rif;
	private String razonSocial;
	private String telefono;
	private String email;
	private String direccion;
	private String cedulaRepresentanteLegal;
	private String nombresRepresentanteLegal;
	private String apellidosRepresentanteLegal;
	private String emailRepresentanteLegal;
	private String telefonoRepresentanteLegal;
	private String correoReferencia;
	private String observaciones;

	private Integer mesesPromocion;

	private Date fechaCancelacionSuscripcion;
	private Date fechaCorte;
	private Date fechaDesdePromocion;
	private Date fechaHastaPromocion;

	private short cantidadUsuariosIniciales;

	@Override
	public boolean isExternalDataSource() {
		return false;
	}

	@Override
	public void setExternalDataSource(boolean value) {

	}

}
