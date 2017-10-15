package com.designpattern.abstractfactory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.designpattern.abstractfactory.model.Computer;
import com.designpattern.abstractfactory.model.PersonalComputer;
import com.designpattern.abstractfactory.model.Server;

public class ComputerFactoryTest {

	@Test
	public void testCreate_PersonalComputer_viaFactory(){
		ComputerAbstractFactory personalComputerFactory = new  PersonalComputerFactory("2 GB","500 GB","2.4 GHz");
		Computer personalComputer = ComputerFactory.getComputer(personalComputerFactory);
		assertEquals(PersonalComputer.class, personalComputer.getClass());
	}
	
	@Test
	public void testCreate_Server_viaFactory(){
		ComputerAbstractFactory serverFactory = new  ServerFactory("2 GB","500 GB","2.4 GHz");
		Computer serverComputer = ComputerFactory.getComputer(serverFactory);
		assertEquals(Server.class, serverComputer.getClass());
		
	}
}
