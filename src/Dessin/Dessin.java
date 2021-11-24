package Dessin;

import java.text.DecimalFormat;
/**
 * Une classe qui représente un dessin.
 * @author Fardeen POOREEA et Janik JIANG
 *
 */
import java.util.LinkedHashSet;
import java.util.TreeSet;

import Formes.*;

public class Dessin implements Manipulable{
	private LinkedHashSet<Image> Images;
	private double aire;
	private double perimetre;
	
	/**
	 * Initialise un dessin vide
	 */
	public Dessin() {
		this.Images = new LinkedHashSet<Image>();
		aire=0;
		perimetre=0;
	}
	
	/**
	 * Remplace un dessin par un autre dessin
	 * @param Images
	 */
	public Dessin(LinkedHashSet<Image> Images) {
		this.Images = Images;
	}
	
	/**
	 * Ajout d'une image dans le Dessin
	 * @param image
	 */
	public void addImage(Image image) {
		this.Images.add(image);
		this.calcAire();
		this.calcPerimetre();
	}
	
	/**
	 * Permet de trier les images d'un dessin selon leur périmètre
	 */
	public void triImage() {
		TreeSet ArbreTri = new TreeSet(Images);
		LinkedHashSet<Image> TrieFormes = new LinkedHashSet<Image>(ArbreTri);
		this.Images = TrieFormes;
	}
	
	/**
	 * Permet de copier un dessin
	 * @param des 
	 * @throws CloneNotSupportedException
	 */
	public void copieDessin(Dessin des) throws CloneNotSupportedException {
		for (Image img : des.getImages()) {
			Image copie = new Image();
			copie.copieImage(img);
			this.addImage(copie);
		}
	}
	
	/**
	 * @return un dessin
	 */
	public LinkedHashSet<Image> getImages(){
		return this.Images;
	}
	
	
	/**
	 * Permet d'afficher le dessin
	 * @return string  
	 */
	public String toString() {
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		String s= "Dessin : { ";
		s+= " Périmetre :" + numberFormat.format(this.calcPerimetre()) + ",";
		s+= " Aire :" +  numberFormat.format(this.calcAire()) + ",";
		s+= System.lineSeparator(); 
		for (Image image : Images) {
			s+= image.toString() + System.lineSeparator();
		}
		s+= "}";
		return s;
	}
	
	/*
	 * Calcule l'aire et le set
	 */
	public double calcAire() {
		double aire =0;
		for (Image image : Images) {
			aire+=image.getAire();
		}
		this.aire = aire;
		return aire;
	}
	
	/*
	 * Calcule le perimetre et le set
	 */
	public double calcPerimetre() {
		double perim =0;
		for (Image image : Images) {
			perim+=image.getPerimetre();
		}
		this.perimetre = perim;
		return perim;
	}
	
	/*
	 * Effectue une homothétie sur le dessin
	 */
	public void homothétie(double rapport, Position centreH) {
		for (Image image : Images) {
			image.homothétie(rapport, centreH);
		}
	}

	/*
	 * Effectue une translation sur le dessin
	 */
	public void translation(double vecteurx, double vecteury) {
		for (Image image : Images) {
			image.translation(vecteurx, vecteury);
		}
	}

	/*
	 * Effectue une rotation sur le dessin
	 */
	public void rotation(Position centreR, double degre) {
		for (Image image : Images) {
			image.rotation(centreR, degre);
		}
	}

	/*
	 * Effectue une symetrie centrale sur le dessin
	 */
	public void symetriecentrale(Position centreSym) {
		for (Image image : Images) {
			image.symetriecentrale(centreSym);
		}
	}

	/*
	 * Effectue une symetrie axiale sur le dessin
	 */
	public void symetrieaxiale(Ligne axe) {
		for (Image image : Images) {
			image.symetrieaxiale(axe);
		}
	}
	
}
