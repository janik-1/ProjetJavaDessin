package Test;

import Dessin.*;
import junit.framework.TestCase;

import org.junit.jupiter.api.Test;

class TestDessin extends TestCase{

	@Test
	public void testnotnull() {
		Dessin dessin = new Dessin();
		assertNotNull(dessin);
	}

	@Test
	public void testAffichage() {
		
	}
}
