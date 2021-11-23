package app;

import Dessin.*;
import Formes.*;

public class Appli {

	public static void main(String[] args) throws CloneNotSupportedException {
		Cercle ce = new Cercle(5,1,2);
		Cercle ce1 = new Cercle(6,1,2);
		Cercle ce2 = new Cercle(7,1,2);
		//Ellipse el = new Ellipse(1,2,5,3);
		Ligne li2 = new Ligne(10,2,11,5);
		Ligne li = new Ligne(7,2,6,5);
		//Polygone pol = new Polygone(5,9,4,3,5);
		Image im = new Image();
		//im.addForme(pol);
		im.addForme(ce);
		im.addForme(li);
		im.addForme(ce1);
		im.addForme(ce2);
		ce2.homothétie(54, new Position(5, 4));
		//im.addForme(ce2);
		Dessin des = new Dessin();
		Dessin des2 = new Dessin();
		des.addImage(im);
		//System.out.println(des);
		des2.copieDessin(des);
		//System.out.println(des2);
		Image im2 = new Image();
		im2.copieImage(im);
		//im2.triForme();
		im.addForme(li2);
		des.addImage(im2);
		des2.addImage(im2);
		des.triImage();
		System.out.println(des);
		System.out.println(des2);
		
		Ligne ali = new Ligne(1,1,2,1);
		Position centreH = new Position(2,0);
		System.out.println(ali);
		ali.rotation(centreH, 360);
		System.out.println(ali);
		ali.homothétie(2, centreH);
		System.out.println(ali);
		
//		System.out.println(im);
//		im.triForme();
//		System.out.println(im);
//		System.out.println(im2);
//		System.out.println(ce);
//		System.out.println(el);
//		System.out.println(li);
//		System.out.println(pol);
	}

}
