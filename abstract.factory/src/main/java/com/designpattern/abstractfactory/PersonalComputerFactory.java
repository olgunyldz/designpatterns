package com.designpattern.abstractfactory;

import com.designpattern.abstractfactory.model.Computer;
import com.designpattern.abstractfactory.model.PersonalComputer;

public class PersonalComputerFactory implements ComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;

	public PersonalComputerFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		return new PersonalComputer(ram, hdd, cpu);
	}

}
