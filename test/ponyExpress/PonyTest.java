package ponyExpress;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PonyTest {

	PonyExpress pony1;
	
	@Before
	public void setUp() throws Exception {
		pony1 = new PonyExpress();
	
	}
	@Test
	public void noEsNulo() {
		assertNotNull(pony1);
	}
	

	@Test
	public void con1CaballoTest() {
		assertEquals(1, pony1.caballos(new int[] {18, 15}));
	}

	@Test
	public void con2caballosTest() {
		assertEquals(2, pony1.caballos(new int[] {43, 23, 40, 13}));
	}
	
	@Test
	public void con3caballosTest() {
		assertEquals(3, pony1.caballos(new int[] {33, 8, 16, 47, 30, 30, 46}));
		assertEquals(3, pony1.caballos(new int[] {51, 51, 51}));
	}
	
	@Test
	public void con4caballosTest() {
		assertEquals(4, pony1.caballos(new int[] {6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49}));
	}
	
}
