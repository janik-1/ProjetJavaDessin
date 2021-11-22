package Test;

import Formes.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class TestLigne extends TestCase{

	@Test
	public void testAffichage() {
		Ligne ligne = new Ligne(0, 1, 5, 3);
		//assertEquals(2,2);
		assertEquals("Je suis une ligne",ligne.toString());
	}

}
