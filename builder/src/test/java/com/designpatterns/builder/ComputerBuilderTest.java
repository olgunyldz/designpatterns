package com.designpatterns.builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ComputerBuilderTest {

	@Test
	public void test_createComputer_via_builder() {
		Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
		assertEquals(comp.getHDD(), "500 GB");
		assertEquals(comp.isBluetoothEnabled(), true);
		assertEquals(comp.isGraphicsCardEnabled(), true);
	}
}
