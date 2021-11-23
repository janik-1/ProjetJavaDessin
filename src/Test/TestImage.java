package Test;

import Dessin.*;
import Formes.*;
import junit.framework.TestCase;


import org.junit.jupiter.api.Test;

class TestImage extends TestCase{

	@Test
	public void testnotNull() {
		Image img = new Image();
		assertNotNull(img);
	}
	
	@Test
	public void testAffichage() {
		Image img = new Image();
		Cercle ce = new Cercle(2,4,1);
		Ligne li = new Ligne(7,2,6,5);
		img.addForme(ce);
		img.addForme(li);
		assertEquals("Je suis un cercle { Centre : (4.0,1.0), Périmetre :12.57, Aire :12.57, }\r\n" + 
				"Je suis une ligne { Départ : (7.0,2.0), Fin : (6.0,5.0), Longueur : 10.0 Périmetre :10.00, Aire :.00, }\r\n" + 
				"", img.toString());
	}
	
	@Test
	public void testTri() {
		Image img = new Image();
		Cercle ce = new Cercle(2,4,1);
		Ligne li = new Ligne(7,2,6,5);
		img.addForme(ce);
		img.addForme(li);
		img.triForme();
		assertEquals( "Je suis une ligne { Départ : (7.0,2.0), Fin : (6.0,5.0), Longueur : 10.0 Périmetre :10.00, Aire :.00, }\r\n" + 
				"Je suis un cercle { Centre : (4.0,1.0), Périmetre :12.57, Aire :12.57, }\r\n" + 
				"", img.toString());
	}
	
	@Test
	public void testDoublon() {
		Image img = new Image();
		Ligne li = new Ligne(7,2,6,5);
		img.addForme(li);
		img.addForme(li);
		assertEquals("Je suis une ligne { Départ : (7.0,2.0), Fin : (6.0,5.0), Longueur : 10.0 Périmetre :10.00, Aire :.00, }\r\n" 
					, img.toString());
	}

}
