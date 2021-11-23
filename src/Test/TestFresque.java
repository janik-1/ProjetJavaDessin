package Test;

import Dessin.*;
import Formes.Cercle;
import Formes.Ligne;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFresque {

	@Test
	public void testnotNull() {
		Fresque fresque = new Fresque();
		assertNotNull(fresque);
	}
	
	@Test
	public void testAffichage() throws CloneNotSupportedException {
		Fresque fre = new Fresque();
		Dessin des = new Dessin();
		Dessin descopie = new Dessin();
		Image im = new Image();
		Cercle ce = new Cercle(5,1,2);
		Ligne li = new Ligne(7,2,6,5);
		im.addForme(li);
		im.addForme(ce);
		des.addImage(im);
		descopie.copieDessin(des);
		fre.addDessin(des);
		fre.addDessin(descopie);
		assertEquals("Contenu de la fresque : \r\n" + 
				"Dessin 1 : \r\n" + 
				"Image 1 : \r\n" + 
				"Je suis une ligne { Départ : (7.0,2.0), Fin : (6.0,5.0), Longueur : 10.0 Périmetre :10.00, Aire :.00, }\r\n" + 
				"Je suis un cercle { Centre : (1.0,2.0), Périmetre :31.42, Aire :78.54, }\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"Dessin 2 : \r\n" + 
				"Image 1 : \r\n" + 
				"Je suis une ligne { Départ : (7.0,2.0), Fin : (6.0,5.0), Longueur : 10.0 Périmetre :10.00, Aire :.00, }\r\n" + 
				"Je suis un cercle { Centre : (1.0,2.0), Périmetre :31.42, Aire :78.54, }\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"", fre.toString());
	}

}
