package com.designpattern.abstractfactory;

import com.designpattern.abstractfactory.model.Computer;

public class ComputerFactory {
	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}
}
