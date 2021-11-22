package Test;

import Formes.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class TestLigne extends TestCase{

	@Test
	public void testAffichage() {
		Ligne ligne = new Ligne(0, 1, 5, 3);
		assertEquals("Je suis une ligne, coordonnées Départ : (7.0,2.0) Fin : (6.0,5.0) et de longueur : 10.0",ligne.toString());
	}

}
