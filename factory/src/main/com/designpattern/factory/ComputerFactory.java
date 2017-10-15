package com.designpattern.factory;

import com.designpattern.factory.model.Computer;
import com.designpattern.factory.model.PersonalComputer;
import com.designpattern.factory.model.Server;

public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		if ("PC".equalsIgnoreCase(type))
			return new PersonalComputer(ram, hdd, cpu);
		else if ("Server".equalsIgnoreCase(type))
			return new Server(ram, hdd, cpu);

		throw new NoClassDefFoundError();
	}
}
