package Dessin;

import java.util.ArrayList;

public class Fresque {
	private ArrayList<Dessin> Dessins;
	
	public Fresque() {
		this.Dessins = new ArrayList<Dessin>();
	}
	
	public Fresque(ArrayList<Dessin> Dessins) {
		this.Dessins = Dessins;
	}

	public ArrayList<Dessin> getDessins() {
		return Dessins;
	}

	public void setDessins(ArrayList<Dessin> dessins) {
		Dessins = dessins;
	}
	
	public String toString() {
		String s= "";
		int cpt = 1;
		for (Dessin dessin : Dessins) {
			s+= "Dessin" + cpt;
			cpt++;
			s+= dessin.toString() + System.lineSeparator();
		}
		return s;
	}
}
