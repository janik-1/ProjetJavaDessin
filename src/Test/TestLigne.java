package Test;

import Formes.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class TestLigne extends TestCase{

	@Test
	public void testAffichage() {
		Ligne li = new Ligne(7,2,6,5);
		//assertEquals(2,2);
		assertEquals("Je suis une ligne, coordonnées Départ : (7.0,2.0) Fin : (6.0,5.0) et de longueur : 10.0" ,li.toString());
	}
	
	public void testnotNull() {
		Ligne li = new Ligne(0,1,0,1);
		assertNotNull(li);
		
	}

}
