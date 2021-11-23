package Dessin;

import java.util.LinkedHashSet;
import java.util.TreeSet;

import Formes.*;

public class Image implements Comparable<Image>, Cloneable{
	private LinkedHashSet<Forme> Formes;
	private int aire;
	private int perimetre;
	
	public Image() {
		this.Formes = new LinkedHashSet<Forme>();
	}
	
	public void addForme(Forme forme) {
		this.Formes.add(forme);
		this.calcAire();
	}
	
	public int compareTo(Image im) {
		if(this.aire>im.aire)
			return 1;
		else if (this.aire==im.aire)
			return 0;
		else
			return -1;
	}
	
	public void triForme() {
		TreeSet ArbreTrie = new TreeSet(Formes);
		LinkedHashSet<Forme> TrieFormes = new LinkedHashSet<Forme>(ArbreTrie);
		this.Formes = TrieFormes;
		//System.out.println(myTreeSet);
	}
	
	public void copieImage(Image img) throws CloneNotSupportedException {
		for (Forme forme : img.getFormes()) {
			this.addForme(forme.clone());
		}
	}
	
	public void calcAire() {
		for (Forme forme : Formes) {
			this.aire+=forme.getAire();
		}
	}
	
	public LinkedHashSet<Forme> getFormes() {
		return Formes;
	}

	public void setFormes(LinkedHashSet<Forme> formes) {
		Formes = formes;
	}
	
	public String toString() {
		String s = "";
		for (Forme Forme : Formes) {
			s+=Forme.toString();
			s+= System.lineSeparator();
		}
		return s;
	}
}
