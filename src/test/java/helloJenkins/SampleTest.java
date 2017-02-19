package helloJenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleTest {

	@Test
	public void simpleTest() {
		Integer a = 1;
		Integer b = 2;
		assertTrue(a + b == 3);
	}

	/*@Test
	public void simpleFailTest() {
		Integer a = 1;
		Integer b = 1;
		assertTrue(a + b == 3);
	}*/
}
