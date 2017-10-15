package factory;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.designpatter.factory.ComputerFactory;
import com.designpatter.factory.model.Computer;

public class ComputerFactoryTests {

	@Test
	public void testPersonalComputer_create_byFactory(){
		String ram ="16 GB 333 Mhz";
		String hdd ="160 GB 7200 RPM";
		String cpu ="Intel Core 7";
		Computer personalComputer = ComputerFactory.getComputer("PC", ram, hdd, cpu);
		assertNotNull(personalComputer);
	}
}
