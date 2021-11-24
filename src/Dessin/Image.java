package Dessin;

import java.text.DecimalFormat;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import Formes.*;

/**
 * Une classe qui représente une image.
 * @author Fardeen POOREEA et Janik JIANG
 *
 */

public class Image implements Comparable<Image>, Cloneable, Manipulable{
	private LinkedHashSet<Forme> Formes;
	private double aire;
	private double perimetre;
	
	/**
	 * Initialise une image vide
	 */
	public Image() {
		this.Formes = new LinkedHashSet<Forme>();
		aire=0;
		perimetre=0;
	}
	
	/**
	 * Permet d'ajouter une forme à une image.
	 * @param forme
	 */
	public void addForme(Forme forme) {
		this.Formes.add(forme);
		this.calcAire();
		this.calcPerimetre();
	}
	
	/**
	 * Permet de comparer l'aire de deux images
	 * @param im
	 * @return 0 si les aires des deux images sont égales
	 * @return 1 si l'aire de cette image est plus grande
	 * @return -1 sinon
	 * 
	 */
	public int compareTo(Image im) {
		if(this.aire>im.aire) {
			return 1;
		}
		else if (this.aire==im.aire) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
	
	/**
	 * Permet de trie les formes d'une image selon leur périmètre
	 */
	public void triForme() {
		TreeSet ArbreTrie = new TreeSet(Formes);
		LinkedHashSet<Forme> TrieFormes = new LinkedHashSet<Forme>(ArbreTrie);
		this.Formes = TrieFormes;
		//System.out.println(myTreeSet);
	}
	
	/**
	 * Permet de copier une image
	 * @param img
	 * @throws CloneNotSupportedException
	 */
	public void copieImage(Image img) throws CloneNotSupportedException {
		for (Forme forme : img.getFormes()) {
			this.addForme(forme.clone());
		}
	}
	
	/**
	 * Permet de calculer l'aire d'une image
	 */	
	public double calcAire() {
		double dummy = 0;
		for (Forme forme : Formes) {
			dummy+=forme.getAire();
		}
		this.aire=dummy;
		return dummy;
	}
	
	/*
	 * @return une image
	 */
	public LinkedHashSet<Forme> getFormes() {
		return Formes;
	}
	
	/**
	 * Remplace une image par une autre image
	 * @param formes
	 */
	public void setFormes(LinkedHashSet<Forme> formes) {
		Formes = formes;
	}
	
	/**
	 * Permet d'afficher une image
	 * @return s 
	 */
	public String toString() {
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		String s = "Image {";
		s+= " Périmetre :" + numberFormat.format(this.calcPerimetre()) + ",";
		s+= " Aire :" +  numberFormat.format(this.calcAire()) + ",";
		s+= System.lineSeparator(); 
		for (Forme Forme : Formes) {
			s+=Forme.toString();
			s+= System.lineSeparator();
		}
		s+="}";
		return s;
	}

	/*
	 * calcul le perimetre et le set
	 */
	public double calcPerimetre() {
		double dummy=0;
		for (Forme forme : Formes) {
			dummy+=forme.getPerimetre();
		}
		this.perimetre=dummy;
		return dummy;
	}

	
	/*
	 * Effectue une homothétie sur l'image
	 */
	public void homothétie(double rapport, Position centreH) {
		for (Forme forme : Formes) {
			forme.homothétie(rapport, centreH);
		}
	}

	/*
	 * Effectue une translation sur l'image
	 */
	public void translation(double vecteurx, double vecteury) {
		for (Forme forme : Formes) {
			forme.translation(vecteurx, vecteury);
		}
	}

	/*
	 * Effectue une rotation sur l'image
	 */
	public void rotation(Position centreR, double degre) {
		for (Forme forme : Formes) {
			forme.rotation(centreR, degre);
		}
	}

	/*
	 * Effectue une symetrie centrale sur l'image
	 */
	public void symetriecentrale(Position centreSym) {
		for (Forme forme : Formes) {
			forme.symetriecentrale(centreSym);
		}
	}

	/*
	 * Effectue une symetrie axiale sur l'image
	 */
	public void symetrieaxiale(Ligne axe) {
		for (Forme forme : Formes) {
			forme.symetrieaxiale(axe);
		}
	}
	
	public double getAire(){
		return this.aire;
	}
	
	public double getPerimetre() {
		return this.perimetre;
	}
}
