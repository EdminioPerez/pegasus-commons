/* AssentSoftware (C)2021 */
package com.greek.commons.dto.v1.user;

import com.gvt.core.domain.types.Identificable;
import com.gvt.core.domain.types.VersionableDto;
import java.io.Serializable;
import lombok.Data;

@Data
public class SystemUserDto implements Identificable, VersionableDto, Serializable {

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
    public void setExternalDataSource(boolean value) {}
}
