package Formes;

import java.lang.*;

/**
 * Une classe qui représente une ellipse
 * @author Fardeen POOREEA et Janik JIANG
 *
 */

public class Ellipse extends Forme{
	private Position centre;
	private Ligne petitaxe;
	private Ligne grandaxe;
	
	/**
	 * Initialise une ellipse
	 * @param centre
	 * @param grandaxe
	 * @param petitaxe
	 */
	public Ellipse(Position centre, Ligne grandaxe, Ligne petitaxe) {
		this.centre = centre;
		this.grandaxe = grandaxe;
		this.petitaxe = petitaxe;
		this.transformation= " ";

	}
	/**
	 * Retourne un String contenant les propriétés d'une ellipse et transformation (s'il y en a eu)
	 * @return s 
	 */
	public String toString() {
		String s="";
		s+= "Je suis une ellipse { Centre : " + this.centre;
		if (!this.transformation.equals(" ")) {
			s+= "," + this.transformation;			
		}
		s+= " }";
		return s;
	}
	
	/**
	 * Permet de calculer la longueur d'une ligne (la distance entre deux points)
	 * @param l
	 * @return
	 */
	public double CalculDistance(Ligne l) {	
		double distance = Math.sqrt(Math.pow(l.getFin().getPosx() -  l.getDebut().getPosx(), 2))+
				Math.pow((l.getFin().getPosy()-l.getDebut().getPosy()),2);
	
		return distance;	
	}
	
	
	/**
	 * Permet de calculer l'aire d'une ellipse 
	 * @return aire 
	 */
	@Override
	public double calcAire() {
		double aire= Math.PI*CalculDistance(this.grandaxe)*CalculDistance(this.petitaxe);
		return aire; 
	}
	
	/**
	 * Permet de calculer une périmètre 
	 * @return peri
	 */
	@Override
	public double calcPerimetre() {
		double peri = 2*Math.PI*Math.sqrt((CalculDistance(this.petitaxe)*CalculDistance(this.petitaxe)+CalculDistance(this.grandaxe)*CalculDistance(this.grandaxe))/2);
		return peri;
	}
	
	
	/**
	 * Permet de faire la rotation d'une ellipse par rapport à un centre
	 * @param Position centreR
	 * @param degre
	 */
	
	@Override
	public void rotation(Position centreR, double degre) {
		this.petitaxe.rotation(centreR, degre);
		this.grandaxe.rotation(centreR, degre);
		this.centre.rotation(centreR, degre);
		this.rotationtext(centreR, degre);
	}

	/**
	 * Permet de faire la symétrie centrale d'une ellipse
	 * @param Position centreSym
	 */
	@Override
	public void symetriecentrale(Position centreSym) {
		this.centre.rotation(centreSym, 180);
		this.petitaxe.rotation(centreSym, 180);
		this.grandaxe.rotation(centreSym, 180);
		this.symetriecentraletext(centreSym);
	}
	
	/**
	 * Permet de faire la symétrie axiale d'une ellipse
	 * @param Ligne axe
	 */
	@Override
	public void symetrieaxiale(Ligne axe) {
		this.petitaxe.symetrieaxiale(axe);
		this.grandaxe.symetrieaxiale(axe);
		this.centre.symetrieaxiale(axe);
		this.symetrieaxialetext(axe);
	}

	
	/**
	 * Permet de faire l'homothétie d'une ellipse par rapport à un centre
	 * @param rapport
	 * @param Position centreH
	 */
	@Override
	public void homothétie(double rapport, Position centreH) { 
		this.petitaxe.homothétie(rapport, centreH);
		this.grandaxe.homothétie(rapport, centreH);
		this.centre.homothétie(rapport, centreH);
		this.homothetietext(rapport, centreH);
	}
	

	/**
	 * Permet de faire la translation d'une ellipse
	 * @param vecteurx
	 * @param vecteury
	 */
	@Override
	public void translation(double vecteurx, double vecteury) {
		this.grandaxe.translation(vecteurx, vecteury);
		this.petitaxe.translation(vecteurx, vecteury);
		this.centre.translation(vecteurx, vecteury);
		this.translationtext(vecteurx, vecteury);
	}


}