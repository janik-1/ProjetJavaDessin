package app;

import java.util.ArrayList;

import Dessin.*;
import Formes.*;

public class Appli {

	public static void main(String[] args) throws CloneNotSupportedException {
		//Création d'une fresque
		Fresque fre = new Fresque();
		//Création d'un dessin
		Dessin des = new Dessin();
		Dessin des2 = new Dessin();
		//Création d'une image
		Image img = new Image();
		Image im = new Image();
		Image im2 = new Image();
		
		//Création des formes
		//Création de ligne		
		Ligne li = new Ligne(7,2,6,5);
		Ligne li2 = new Ligne(10,2,11,5);
		
		//Création de cercles
		Cercle ce = new Cercle(5,1,2);
		Cercle ce1 = new Cercle(6,1,2);
		Cercle ce2 = new Cercle(7,1,2);
		
		//Création d'un polygone ici un triangle
		Ligne Tri1 = new Ligne(1,1,2,2);
		Ligne Tri2 = new Ligne(2,2,3,1);
		Ligne Tri3 = new Ligne(3,1,1,1);
		ArrayList<Ligne> LisTri = new ArrayList<Ligne>();
		LisTri.add(Tri1); LisTri.add(Tri2); LisTri.add(Tri3);
		Polygone Triangle = new Polygone(LisTri);
		
		//Création d'une ellipse
		Ligne Ell1= new Ligne(5,5,5,7);
		Ligne Ell2= new Ligne(4,6,6,6);
		Position Ellcentre = new Position(5, 6);
		Ellipse Ellipse = new Ellipse(Ellcentre, Ell2, Ell1);
		
		im.addForme(ce);
		im.addForme(li);
		ce2.homothétie(0.5, new Position(5, 4));
		
		im2.addForme(ce1);
		im2.addForme(ce2);
		//im2.triForme();
		des.addImage(im2);
		des.addImage(im);
		des.triImage();
		
		img.addForme(Ellipse);
		img.addForme(Triangle);
		img.triForme();
		des2.addImage(img);
		
		//System.out.println(des);
		fre.addDessin(des);
		fre.addDessin(des2);
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
