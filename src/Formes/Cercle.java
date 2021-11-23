package Formes;

import java.text.DecimalFormat;

/**
 * Une classe qui représente un Cercle
 * @author Fardeen POOREEA et Janik JIANG
 *
 */

public class Cercle extends Forme{
	private double rayon; 
	private Position centre;
	
	/**
	 * Permet d'initialiser un cercle
	 * @param rayon
	 * @param posx
	 * @param posy
	 */
	public Cercle (int rayon, int posx, int posy) {
		this.centre = new Position(posx, posy);
		this.rayon = rayon;
		this.setAire(this.calcAire());
		this.setPerimetre(calcPerimetre());
		this.transformation= " ";
	}
	
	/**
	 * Retourne un String contenant les caractéristiques du cercle et une transformation (s'il y en a eu)
	 * @return s
	 */
	public String toString() {
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		String s= "Je suis un cercle {";
		s+= " Centre : (" + centre.getPosx() + "," + centre.getPosy() + "),";
		s+= " Périmetre :" + numberFormat.format(this.calcPerimetre()) + ",";
		s+= " Aire :" +  numberFormat.format(this.calcAire()) + ",";
		if (!this.transformation.equals(" "))
			s+= this.transformation;
		s+= " }";
		return s;
	}

	/**
	 * Permet de calcul l'aire d'un cercle
	 * @return aire
	 */
	public double calcAire() {
		double aire = Math.PI*this.rayon*this.rayon;
		return aire;
	}

	/**
	 * Permet de calculer le périmètre d'un cercle
	 * @return perimetre
	 */
	public double calcPerimetre() {
		double perimetre = 2*Math.PI*this.rayon;
		return perimetre;
	}

	/**
	 * Permet de faire l'homothétie d'un cercle par rapport à un centre
	 * @param rapport
	 * @param centreH
	 */
	public void homothétie(double rapport, Position centreH) {
		this.centre.homothétie(rapport, centreH);
		this.rayon=Math.abs(this.rayon*rapport);
		this.homothetietext(rapport, centreH);
	}


	/**
	 * Permet de faire la translation d'un cercle
	 * @param vecteurx
	 * @param vecteury
	 */
	@Override
	public void translation(double vecteurx, double vecteury) {
		this.centre.translation(vecteurx, vecteury);
		this.translationtext(vecteurx, vecteury);
	}

	
	/**
	 * Permet de faire la rotation d'un cercle par rapport à un centre
	 * @param centreR
	 * @param degre
	 */
	@Override
	public void rotation(Position centreR, double degre) {
		this.centre.rotation(centreR, degre);
		this.rotationtext(centreR, degre);
	}
	
	/**
	 * Permet de faire la symétrie centrale d'un cercle
	 * @param centreSym
	 */
	@Override
	public void symetriecentrale(Position centreSym) {
		this.rotation(centreSym, 180);
		this.symetriecentraletext(centreSym);
	}
	
	/**
	 * Permet de faire une symétrie axiale d'un cercle
	 * @param axe
	 */
	@Override
	public void symetrieaxiale(Ligne axe) {
		this.centre.symetrieaxiale(axe);
		this.symetrieaxialetext(axe);
	}

}
