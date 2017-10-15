package com.designpattern.abstractfactory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.designpattern.abstractfactory.model.Computer;
import com.designpattern.abstractfactory.model.PersonalComputer;

public class PersonalComputerFactoryTest {

	@Test
	public void testCreate_PersonalComputer_instance(){
		PersonalComputerFactory  personalComputerFactory = new PersonalComputerFactory("2 GB","500 GB","2.4 GHz");
		Computer personalComputer = personalComputerFactory.createComputer();
		assertEquals(personalComputer.getClass(), PersonalComputer.class);
	}
}
