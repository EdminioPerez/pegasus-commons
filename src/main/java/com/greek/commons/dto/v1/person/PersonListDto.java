/* AssentSoftware (C)2021 */
package com.greek.commons.dto.v1.person;

import java.io.Serializable;
import lombok.Data;

@Data
public class PersonListDto implements Serializable {

    private static final long serialVersionUID = -5341388224130637901L;

    private Long id;
    private String name;
    private String lastName;
}
