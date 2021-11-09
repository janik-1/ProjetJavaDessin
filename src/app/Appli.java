package app;

import Dessin.*;
import Formes.*;

public class Appli {

	public static void main(String[] args) {
		Cercle ce = new Cercle(5,1,2);
		Ellipse el = new Ellipse(1,2,5,3);
		Ligne li = new Ligne(7, 2, 6);
		Polygone pol = new Polygone(5,9,4,3,5);
		System.out.println(ce);
		System.out.println(el);
		System.out.println(li);
		System.out.println(pol);
	}

}
