package Formes;

/**
 * Une classe abstraite qui représente une forme et qui implémente une interface contenant les fonctions indispensable à une forme.
 * @author Fardeen POOREEA et Janik JIANG
 *
 */
public abstract class Forme implements Manipulable, Comparable<Forme>, Cloneable{
	private double aire;
	private double perimetre;
	protected String transformation;
	
	/**
	 * Retourne l'aire d'une forme
	 * @return aire
	 */
	public double getAire() {
		return aire;
	}
	/**
	 * Modifie l'aire d'une forme
	 * @param aire
	 */
	public void setAire(double aire) {
		this.aire = aire;
	}
	/**
	 * Retourne le périmètre d'une forme
	 * @return perimetre
	 */
	public double getPerimetre() {
		return perimetre;
	}
	/**
	 * Modifie le périmètre d'une forme
	 * @param perimetre
	 */
	public void setPerimetre(double perimetre) {
		this.perimetre = perimetre;
	}
	
	/**
	 * Compare deux périmètres correspondant chacune à une forme.
	 * @param forme
	 * @return 
	 */
	public int compareTo(Forme forme) {
		if(this.perimetre>forme.perimetre) {
			return 1;
		}
		else if(this.perimetre==forme.perimetre) {
			return 0;
		}
		else 
			return -1;
	}
	
	/**
	 * Retourne le clone d'une forme
	 * @return le clone de la forme
	 */
	public Forme clone() throws CloneNotSupportedException {
		return (Forme)super.clone();
	}
	
	/**
	 * Permet d'afficher une homothetie sous forme textuelle.
	 * @param rapport
	 * @param centreH
	 */
	public void homothetietext(double rapport, Position centreH) {
		this.transformation+= "Homothétie de rapport " + rapport + ". ";
	}
	/**
	 * Permet d'afficher une translation sous forme textuelle.
	 * @param vecteurx
	 * @param vecteury
	 */
	public void translationtext(double vecteurx, double vecteury) {
		this.transformation+= "Translation de vecteur " + vecteurx + "," + vecteury + ". ";
	}
	/**
	 * Permet d'afficher une rotation sous forme textuelle.
	 * @param centreR
	 * @param degre
	 */
	public void rotationtext(Position centreR, double degre) {
		this.transformation+= "Rotation de degre " + degre + ". ";
	}
	/**
	 * Permet d'afficher une symétrie centrale sous forme textuelle.
	 * @param centreSym
	 */
	public void symetriecentraletext(Position centreSym) {
		this.transformation+= "Symetrie centrale de centre " + centreSym + ". ";
	}
	/**
	 * Permet d'afficher une symétrie axiale sous forme textuelle.
	 * @param axe
	 */
	public void symetrieaxialetext(Ligne axe) {
		this.transformation+= "Symetrie axiale de l'axe" + ". ";
	}

}
