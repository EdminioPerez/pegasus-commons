/* AssentSoftware (C)2021 */
package com.greek.commons.dto.v1.simple;

import java.io.Serializable;
import lombok.Data;

@Data
public class ImageDto implements Serializable {

    private static final long serialVersionUID = -7872870662803782075L;

    private final String filePath;
}
