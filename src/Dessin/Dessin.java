package Dessin;

import java.util.LinkedHashSet;
import java.util.TreeSet;

import Formes.*;

public class Dessin {
	private LinkedHashSet<Image> Images;
	private int aire;
	
	public Dessin() {
		this.Images = new LinkedHashSet<Image>();
	}
	
	public Dessin(LinkedHashSet<Image> Images) {
		this.Images = Images;
	}
	
	public void addImage(Image image) {
		this.Images.add(image);
	}
	
	public void triImage() {
		TreeSet ArbreTri = new TreeSet(Images);
		LinkedHashSet<Image> TrieFormes = new LinkedHashSet<Image>(ArbreTri);
		this.Images = TrieFormes;
	}
	
	public void copieDessin(Dessin des) throws CloneNotSupportedException {
		for (Image img : des.getImages()) {
			Image copie = new Image();
			copie.copieImage(img);
			this.addImage(copie);
		}
	}
	
	public LinkedHashSet<Image> getImages(){
		return this.Images;
	}
	public String toString() {
		String s= "";
		int cpt = 1;
		for (Image image : Images) {
			s+= "Image " + cpt;
			cpt++;
			s+= image.toString() + System.lineSeparator();
		}
		return s;
	}
	
}
