package Dessin;

/**
 * Une classe qui représente un dessin.
 * @author Fardeen POOREEA et Janik JIANG
 *
 */
import java.util.LinkedHashSet;
import java.util.TreeSet;

import Formes.*;

public class Dessin {
	private LinkedHashSet<Image> Images;
	private int aire;
	
	/**
	 * Initialise un dessin vide
	 */
	public Dessin() {
		this.Images = new LinkedHashSet<Image>();
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
		String s= "";
		int cpt = 1;
		for (Image image : Images) {
			s+= "Image " + cpt + " : " + System.lineSeparator();
			cpt++;
			s+= image.toString() + System.lineSeparator();
		}
		return s;
	}
	
}
