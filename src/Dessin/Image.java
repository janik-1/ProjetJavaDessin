package Dessin;

import java.util.LinkedHashSet;
import java.util.TreeSet;

import Formes.*;

/**
 * Une classe qui représente une image.
 * @author Fardeen POOREEA et Janik JIANG
 *
 */

public class Image implements Comparable<Image>, Cloneable{
	private LinkedHashSet<Forme> Formes;
	private int aire;
	private int perimetre;
	
	/**
	 * Initialise une image vide
	 */
	public Image() {
		this.Formes = new LinkedHashSet<Forme>();
	}
	
	/**
	 * Permet d'ajouter une forme à une image.
	 * @param forme
	 */
	public void addForme(Forme forme) {
		this.Formes.add(forme);
		this.calcAire();
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
		if(this.aire>im.aire)
			return 1;
		else if (this.aire==im.aire)
			return 0;
		else
			return -1;
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
	public void calcAire() {
		for (Forme forme : Formes) {
			this.aire+=forme.getAire();
		}
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
		String s = "";
		for (Forme Forme : Formes) {
			s+=Forme.toString();
			s+= System.lineSeparator();
		}
		return s;
	}
}
