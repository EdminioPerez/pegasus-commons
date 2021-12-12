/* AssentSoftware (C)2021 */
package com.greek.commons.dto;

import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;

import com.greek.commons.dto.v1.person.PersonDto;
import com.greek.commons.dto.v1.person.PersonListDto;
import com.greek.commons.dto.v1.simple.ImageDto;
import com.greek.commons.dto.v1.simple.SimpleDto;
import com.greek.commons.dto.v1.user.ClientDto;
import com.greek.commons.dto.v1.user.SystemUserDto;
import org.junit.jupiter.api.Test;

public class DtosTest {

    @Test
    public void should_pass_all_pojo_tests() {
        // given
        final Class<PersonDto> personDto = PersonDto.class;
        final Class<PersonListDto> personListDto = PersonListDto.class;
        final Class<ImageDto> imageDto = ImageDto.class;
        final Class<SimpleDto> simpleDto = SimpleDto.class;
        final Class<ClientDto> clientDto = ClientDto.class;
        final Class<SystemUserDto> systemUserDto = SystemUserDto.class;

        // when

        // then
        assertPojoMethodsFor(personListDto).areWellImplemented();
        assertPojoMethodsFor(personDto).quickly().areWellImplemented();
        //		assertPojoMethodsFor(imageDto, exclude("filePath")).quickly().areWellImplemented();
        //		assertPojoMethodsFor(simpleDto, exclude("id")).quickly().areWellImplemented();
        assertPojoMethodsFor(clientDto).quickly().areWellImplemented();
        assertPojoMethodsFor(systemUserDto).areWellImplemented();
    }
}
