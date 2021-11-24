package Test;

import Dessin.*;
import Formes.Cercle;
import Formes.Ligne;
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
		Dessin des = new Dessin();
		Image im = new Image();
		Cercle ce = new Cercle(5,1,2);
		Ligne li = new Ligne(7,2,6,5);
		im.addForme(li);
		im.addForme(ce);
		des.addImage(im);
		assertEquals("Dessin : {  Périmetre :41.42, Aire :78.54,\r\n" + 
				"Image { Périmetre :41.42, Aire :78.54,\r\n" + 
				"Je suis une ligne { Départ : (7.0,2.0), Fin : (6.0,5.0), Longueur : 10.0 Périmetre :10.00, Aire :.00, }\r\n" + 
				"Je suis un cercle { Centre : (1.0,2.0), Périmetre :31.42, Aire :78.54, }\r\n" + 
				"}\r\n" + 
				"}", des.toString());
	}
	
	@Test
	public void testAffichageImgs() {
		Dessin des = new Dessin();
		Image im = new Image();
		Image im2 = new Image();
		Cercle ce = new Cercle(5,1,2);
		Ligne li = new Ligne(7,2,6,5);
		Cercle ce2= new Cercle(6,5,5);
		im.addForme(li);
		im.addForme(ce);
		im2.addForme(ce2);
		im2.addForme(li);
		des.addImage(im2);
		des.addImage(im);
		assertEquals("Dessin : {  Périmetre :89.12, Aire :191.64,\r\n" + 
				"Image { Périmetre :47.70, Aire :113.10,\r\n" + 
				"Je suis un cercle { Centre : (5.0,5.0), Périmetre :37.70, Aire :113.10, }\r\n" + 
				"Je suis une ligne { Départ : (7.0,2.0), Fin : (6.0,5.0), Longueur : 10.0 Périmetre :10.00, Aire :.00, }\r\n" + 
				"}\r\n" + 
				"Image { Périmetre :41.42, Aire :78.54,\r\n" + 
				"Je suis une ligne { Départ : (7.0,2.0), Fin : (6.0,5.0), Longueur : 10.0 Périmetre :10.00, Aire :.00, }\r\n" + 
				"Je suis un cercle { Centre : (1.0,2.0), Périmetre :31.42, Aire :78.54, }\r\n" + 
				"}\r\n" + 
				"}", des.toString());
	}
	
	@Test
	public void testCopie() throws CloneNotSupportedException {
		Dessin des = new Dessin();
		Dessin copie= new Dessin();
		Image im = new Image();
		Cercle ce = new Cercle(5,1,2);
		Ligne li = new Ligne(7,2,6,5);
		im.addForme(li);
		im.addForme(ce);
		des.addImage(im);
		copie.copieDessin(des);
		assertEquals("Dessin : {  Périmetre :41.42, Aire :78.54,\r\n" + 
				"Image { Périmetre :41.42, Aire :78.54,\r\n" + 
				"Je suis une ligne { Départ : (7.0,2.0), Fin : (6.0,5.0), Longueur : 10.0 Périmetre :10.00, Aire :.00, }\r\n" + 
				"Je suis un cercle { Centre : (1.0,2.0), Périmetre :31.42, Aire :78.54, }\r\n" + 
				"}\r\n" + 
				"}", des.toString());
	}
	
	@Test
	public void testTri() {
		Dessin des = new Dessin();
		Image im = new Image();
		Image im2 = new Image();
		Cercle ce = new Cercle(5,1,2);
		Ligne li = new Ligne(7,2,6,5);
		Cercle ce2= new Cercle(6,5,5);
		im.addForme(li);
		im.addForme(ce);
		im2.addForme(ce2);
		im2.addForme(li);
		des.addImage(im2);
		des.addImage(im);
		des.triImage();
		assertEquals("Dessin : {  Périmetre :89.12, Aire :191.64,\r\n" + 
				"Image { Périmetre :41.42, Aire :78.54,\r\n" + 
				"Je suis une ligne { Départ : (7.0,2.0), Fin : (6.0,5.0), Longueur : 10.0 Périmetre :10.00, Aire :.00, }\r\n" + 
				"Je suis un cercle { Centre : (1.0,2.0), Périmetre :31.42, Aire :78.54, }\r\n" + 
				"}\r\n" + 
				"Image { Périmetre :47.70, Aire :113.10,\r\n" + 
				"Je suis un cercle { Centre : (5.0,5.0), Périmetre :37.70, Aire :113.10, }\r\n" + 
				"Je suis une ligne { Départ : (7.0,2.0), Fin : (6.0,5.0), Longueur : 10.0 Périmetre :10.00, Aire :.00, }\r\n" + 
				"}\r\n" + 
				"}" , des.toString());
	}
	
	@Test
	public void testDoublon() {
		Dessin des = new Dessin();
		Image im = new Image();
		Cercle ce = new Cercle(5,1,2);
		Ligne li = new Ligne(7,2,6,5);
		im.addForme(li);
		im.addForme(ce);
		des.addImage(im);
		des.addImage(im);
		assertEquals("Dessin : {  Périmetre :41.42, Aire :78.54,\r\n" + 
				"Image { Périmetre :41.42, Aire :78.54,\r\n" + 
				"Je suis une ligne { Départ : (7.0,2.0), Fin : (6.0,5.0), Longueur : 10.0 Périmetre :10.00, Aire :.00, }\r\n" + 
				"Je suis un cercle { Centre : (1.0,2.0), Périmetre :31.42, Aire :78.54, }\r\n" + 
				"}\r\n" + 
				"}", des.toString());
	}
	
}
