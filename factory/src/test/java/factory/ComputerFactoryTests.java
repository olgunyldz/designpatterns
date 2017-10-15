package factory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.designpatter.factory.ComputerFactory;
import com.designpatter.factory.model.Computer;
import com.designpatter.factory.model.PersonalComputer;
import com.designpatter.factory.model.Server;

public class ComputerFactoryTests {

	@Test
	public void testPersonalComputer_create_byFactory() {
		String ram = "16 GB 333 Mhz";
		String hdd = "160 GB 7200 RPM";
		String cpu = "Intel Core 7 2.4 GHz";
		Computer personalComputer = ComputerFactory.getComputer("PC", ram, hdd, cpu);
		assertNotNull(personalComputer);
		assertEquals(PersonalComputer.class, personalComputer.getClass());
	}

	@Test
	public void testServer_create_byFactory() {
		String ram = "64 GB 333 Mhz";
		String hdd = "1.6 TB 10600 RPM";
		String cpu = "Intel Core 7 4 * 2.4 GHz";
		Computer server = ComputerFactory.getComputer("Server", ram, hdd, cpu);
		assertNotNull(server);

		assertEquals(Server.class, server.getClass());
	}

	@Test(expected = NoClassDefFoundError.class)
	public void testIndexOutOfBoundsException() {
		String ram = "64 GB 333 Mhz";
		String hdd = "1.6 TB 10600 RPM";
		String cpu = "Intel Core 7 4 * 2.4 GHz";
		ComputerFactory.getComputer("Test", ram, hdd, cpu);
		fail("Must throw exception");
	}
}
