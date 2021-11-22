package app;

import Dessin.*;
import Formes.*;

public class Appli {

	public static void main(String[] args) throws CloneNotSupportedException {
		Cercle ce = new Cercle(5,1,2);
		Cercle ce1 = new Cercle(6,1,2);
		Cercle ce2 = new Cercle(7,1,2);
		//Ellipse el = new Ellipse(1,2,5,3);
		Ligne li = new Ligne(7,2,6,5,6);
		Polygone pol = new Polygone(5,9,4,3,5);
		Image im = new Image();
		//im.addForme(pol);
		im.addForme(ce);
		im.addForme(li);
		im.addForme(ce1);
		im.addForme(ce2);
		im.addForme(ce2);
		Image im2 = new Image();
		im2.copieImage(im);
		System.out.println(im);
		im.triForme();
		System.out.println(im);
		System.out.println(im2);
//		System.out.println(ce);
//		System.out.println(el);
//		System.out.println(li);
//		System.out.println(pol);
	}

}
