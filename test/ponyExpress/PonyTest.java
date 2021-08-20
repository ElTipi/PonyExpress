package ponyExpress;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PonyTest {

	PonyExpress pony1;
	
	@Test
	public void noEsNulo() {
		pony1 = new PonyExpress();
		assertNotNull(pony1);
	}

	@Test
	void pony1Test() {
		pony1 = new PonyExpress();
		assertEquals(1, pony1.caballos(new int[] { 18, 15 }));
	}

	@Test
	void pony2Test() {
		pony1 = new PonyExpress();
		assertEquals(2, pony1.caballos(new int[] { 43, 23, 40, 13 }));
	}
	
	@Test
	void para3CaballosATest() {
		pony1 = new PonyExpress();
		assertEquals(3, pony1.caballos(new int[] { 33, 8, 16, 47, 30, 30, 46 }));
	}
	
	@Test
	void para3CaballosBTest() {
		pony1 = new PonyExpress();
		assertEquals(3, pony1.caballos(new int[] { 51, 51, 51 }));
	}
	
	@Test
	void para4CaballosTest() {
		pony1 = new PonyExpress();
		assertEquals(4, pony1.caballos(new int[] { 6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49 }));
	}

	@Test
	void para8CaballosTest() {
		pony1 = new PonyExpress();
		assertEquals(8, pony1.caballos(new int[] { 49, 40, 18, 37, 29, 17, 47, 23, 8, 28, 8, 6, 24, 6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49 }));
	}
}
