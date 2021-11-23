package app;

import Dessin.*;
import Formes.*;

public class Appli {

	public static void main(String[] args) throws CloneNotSupportedException {
		//Création d'une fresque
		Fresque fre = new Fresque();
		
		//Création d'un dessin
		Dessin des = new Dessin();
		
		//Création de formes
		Cercle ce = new Cercle(5,1,2);
		Cercle ce1 = new Cercle(6,1,2);
		Cercle ce2 = new Cercle(7,1,2);
		//Ellipse el = new Ellipse(1,2,5,3);
		Ligne li2 = new Ligne(10,2,11,5);
		Ligne li = new Ligne(7,2,6,5);
		//Polygone pol = new Polygone(5,9,4,3,5);
		Image im = new Image();
		Image im2 = new Image();
		//im.addForme(pol);
		im.addForme(ce);
		im.addForme(li);
		im.addForme(ce1);
		im.addForme(ce2);
		ce2.homothétie(54, new Position(5, 4));
		
		des.addImage(im);
		
		im2.copieImage(im);
		im.addForme(li2);
		im2.triForme();
		des.addImage(im2);
		des.triImage();
		fre.addDessin(des);
		System.out.println(fre);
		
		
		System.out.println("Toute les transformation à partir d'une ligne : ");
		Ligne ali = new Ligne(1,1,2,1);
		Position centreH = new Position(2,0);
		Ligne axe = new Ligne(0,0,1,1);
		System.out.println(ali);
		ali.rotation(centreH, 360);
		System.out.println(ali);
		ali.homothétie(2, centreH);
		System.out.println(ali);
		ali.translation(1, 1);
		System.out.println(ali);
		ali.symetriecentrale(centreH);
		System.out.println(ali);
		ali.symetrieaxiale(axe);
		System.out.println(ali);
	}

}
