package Dessin;

import java.util.ArrayList;

/**
 * Une classe qui représente une fresque.
 * @author Fardeen POOREEA et Janik JIANG
 *
 */
public class Fresque {
	private ArrayList<Dessin> Dessins;
	
	/**
	 * Initialise une fresque vide.
	 */
	public Fresque() {
		this.Dessins = new ArrayList<Dessin>();
	}
	
	/**
	 * Remplace une fresque par une autre
	 * @param Dessins
	 */
	public Fresque(ArrayList<Dessin> Dessins) {
		this.Dessins = Dessins;
	}
	
	/**
	 * Permet de retourner la fresque
	 * @return la fresque
	 */
	public ArrayList<Dessin> getDessins() {
		return Dessins;
	}
	
	/**
	 * Affecte une fresque à une autre fresque 
	 * @param dessins
	 */
	public void setDessins(ArrayList<Dessin> dessins) {
		Dessins = dessins;
	}
	
	/**
	 * Permet d'afficher une fresque
	 * @return s
	 */
	public String toString() {
		String s= "";
		int cpt = 1;
		for (Dessin dessin : Dessins) {
			s+= "Dessin" + cpt + " : " + System.lineSeparator();
			cpt++;
			s+= dessin.toString() + System.lineSeparator();
		}
		return s;
	}
}
