package Test;

import Formes.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class TestLigne extends TestCase{

	@Test
	public void testAffichage() {
		Ligne li = new Ligne(7,2,6,5);
		assertEquals(7.0,li.getDebut().getPosx());
		assertEquals(2.0, li.getDebut().getPosy());
		assertEquals(6.0, li.getFin().getPosx());
		assertEquals(5.0, li.getFin().getPosy());
		assertEquals(10.0,li.getLongueur());
		assertEquals("Je suis une ligne { Départ : (7.0,2.0), Fin : (6.0,5.0), Longueur : 10.0 }" ,li.toString());
	}
	
	public void testLignenotNull() {
		Ligne li = new Ligne(0,1,0,1);
		assertNotNull(li);
	}
	
	public void testPerimetre() {
		Ligne li = new Ligne(1,1,2,1);
		assertEquals(1.0, li.getPerimetre());		
	}
	
	public void testAire() {
		Ligne li = new Ligne(1,1,2,1);
		assertEquals(0.0, li.getAire());		
	}
	
	public void testHomothetie() {
		Ligne li = new Ligne(1,1,2,1);
		Position centreH = new Position(1,0);
		li.homothétie(2, centreH);
		assertEquals(1.0, li.getDebut().getPosx());
		assertEquals(2.0, li.getDebut().getPosy());
		assertEquals(3.0, li.getFin().getPosx());
		assertEquals(2.0, li.getFin().getPosy());
	}
	
	public void testRotation() {
		Ligne li = new Ligne(1,1,2,1);
		Position centreR = new Position(2,0);
		li.rotation(centreR, 360);
		assertEquals(1.0, li.getDebut().getPosx());
		assertEquals(1.0, li.getDebut().getPosy());
		assertEquals(2.0, li.getFin().getPosx());
		assertEquals(1.0, li.getFin().getPosy());
	}
	
	public void testTranslation() {
		Ligne li = new Ligne(1,1,2,1);
		li.translation(1, 1);
		assertEquals(2.0, li.getDebut().getPosx());
		assertEquals(2.0, li.getDebut().getPosy());
		assertEquals(3.0, li.getFin().getPosx());
		assertEquals(2.0, li.getFin().getPosy());
	}
	
	public void testSymetrieCentrale() {
		Ligne li = new Ligne(1,1,3,1);
		Position centreR = new Position(2,0);
		li.symetriecentrale(centreR);
		assertEquals(3.0, li.getDebut().getPosx());
		assertEquals(-1.0, li.getDebut().getPosy());
		assertEquals(1.0, li.getFin().getPosx());
		assertEquals(-1.0, li.getFin().getPosy());
	}
	
	public void testSymetrieAxiale() {
		Ligne li = new Ligne(1,1,3,1);
		Ligne axe = new Ligne(1,0,3,0);
		li.symetrieaxiale(axe);
		assertEquals(1.0, li.getDebut().getPosx());
		assertEquals(-1.0, li.getDebut().getPosy());
		assertEquals(3.0, li.getFin().getPosx());
		assertEquals(-1.0, li.getFin().getPosy());
	}

}
