package com.greek.commons.dto;

import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;

import org.junit.Test;

import com.greek.commons.dto.v1.person.PersonDTO;
import com.greek.commons.dto.v1.person.PersonListDTO;
import com.greek.commons.dto.v1.simple.ImageDTO;
import com.greek.commons.dto.v1.simple.SimpleDTO;
import com.greek.commons.dto.v1.user.ClientDTO;
import com.greek.commons.dto.v1.user.SystemUserDTO;

public class DtosTest {

	@Test
	public void should_pass_all_pojo_tests() {
		// given
		final Class<PersonListDTO> personListDTO = PersonListDTO.class;
		final Class<PersonDTO> personDTO = PersonDTO.class;
		final Class<ImageDTO> imageDTO = ImageDTO.class;
		final Class<SimpleDTO> simpleDTO = SimpleDTO.class;
		final Class<ClientDTO> clientDTO = ClientDTO.class;
		final Class<SystemUserDTO> systemUserDTO = SystemUserDTO.class;

		// when

		// then
		assertPojoMethodsFor(personListDTO).areWellImplemented();
		assertPojoMethodsFor(personDTO).quickly().areWellImplemented();
//		assertPojoMethodsFor(imageDTO, exclude("filePath")).quickly().areWellImplemented();
//		assertPojoMethodsFor(simpleDTO, exclude("id")).quickly().areWellImplemented();
		assertPojoMethodsFor(clientDTO).quickly().areWellImplemented();
		assertPojoMethodsFor(systemUserDTO).areWellImplemented();
	}

}
