package Formes;

import java.util.ArrayList;

/**
 * Une classe qui représente un Polygone.
 * @author Fardeen POOREEA et Janik JIANG
 *
 */
public class Polygone extends Forme {
	
	private ArrayList <Ligne> ligne;
	private int nbsommet;
	
	/**
	 * Initialise un Polygone.
	 * @param p
	 */
	public Polygone (ArrayList <Ligne> p) {
		this.ligne = new ArrayList<Ligne>();
		this.ligne = p ;
		this.nbsommet = this.ligne.size();
		this.transformation= " ";
	}
	
	@Override
	/**
	 * Permet de calculer l'aire d'un polygone.
	 * @return aire
	 */
	public double calcAire() {	
		double aire = 0;
		
		// plus tard 
		
		return aire;			 
	}
	
	/**
	 * Permet de calculer la longueur d'une ligne.
	 * @param l
	 * @return
	 */
	public double CalculDistance(Ligne l) {		
		
			double distance = Math.sqrt(Math.pow(l.getFin().getPosx() -  l.getDebut().getPosx(), 2))+
					Math.pow((l.getFin().getPosy()-l.getDebut().getPosy()),2);
		
			return distance;		
			
		}
	
	/**
	 * Permet de calculer le périmètre d'un polygone.
	 * @return perim
	 */
	@Override
	public double calcPerimetre() {
		double perim = 0;
		
			for (Ligne l : ligne) {
				perim = perim + l.getDebut().CalculDistance(l.getFin());
			}
		
		return perim;
	}
	
	/**
	 * Permet de faire l'homothétie d'un polygone par rapport à un centre
	 * @param rapport
	 * @param centreH
	 */
	@Override
	public void homothétie(double rapport, Position centreH) {
		
		for (Ligne l : ligne) {
			l.getDebut().homothétie(rapport, centreH);
			l.getFin().homothétie(rapport, centreH);
		}
		this.homothetietext(rapport, centreH);
		
	}
	/**
	 * Permet de faire la translation d'un polygone.
	 * @param vecteurx
	 * @param vecteury
	 */
	@Override
	public void translation(double vecteurx, double vecteury) {
		for (Ligne l : ligne) {
			l.getDebut().translation(vecteurx, vecteury);
			l.getFin().translation(vecteurx, vecteury);
		}
		this.translationtext(vecteurx, vecteury);
	}

	/**
	 * Permet de faire la rotation d'un polygone par rapport à un centre
	 * @param degre
	 * @param centreR
	 */
	@Override
	public void rotation(Position centreR, double degre) {
		for (Ligne l : ligne) {
			l.getDebut().rotation(centreR, degre);
			l.getFin().rotation(centreR, degre);
		}
		this.rotationtext(centreR, degre);
	}

	/**
	 * Permet de faire la symétrie centrale d'un polygone par rapport à un centre
	 * @param centreH
	 */
	@Override
	public void symetriecentrale(Position centreSym) {
		for (Ligne l : ligne) {
			l.getDebut().rotation(centreSym,180);
			l.getFin().rotation(centreSym, 180);
		}
		this.symetriecentraletext(centreSym);
	}
	
	/**
	 * Permet de faire la symétrie axiale d'un polygone par rapport à une ligne.
	 * @param axe
	 */
	@Override
	public void symetrieaxiale(Ligne axe) {
		for (Ligne l : ligne) {
			l.getDebut().symetrieaxiale(axe);
			l.getFin().symetrieaxiale(axe);
		}
		this.symetrieaxialetext(axe);
	}
	
	/**
	 * Retourne un String contenant les caractéristique du polygone et transformation (s'il y en a eu)
	 * @return s
	 */
	public String toString() {
		String s= "Je suis un Polygone {"
				+ "Nombre sommet : " + this.nbsommet;
		if (!this.transformation.equals(" ")) {
			s+= ", " + this.transformation;			
		}
		s+= " }";
		return s;
	}

}