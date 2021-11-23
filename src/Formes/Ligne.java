package Formes;

/**
 * Une classe qui représente une Ligne.
 * @author Fardeen POOREEA et Janik JIANG
 *
 */
public class Ligne extends Forme{
	private Position debut;
	private Position fin;
	private double longueur;
	
	/**
	 * Initialise une ligne et calcule son périmètre et son aire.
	 * @param debx
	 * @param deby
	 * @param finx
	 * @param finy
	 */
	public Ligne(int debx, int deby, int finx, int finy) {
		this.debut = new Position(debx, deby);
		this.fin = new Position(finx, finy);
		this.longueur = debut.CalculDistance(fin);
		this.calcAire();
		this.calcPerimetre();
		this.transformation= " ";
	}
	
	/**
	 * Permet de calculer l'aire d'une ligne
	 * @return 0 
	 */
	public double calcAire() {
		this.setAire(0);
		return 0;
	}
	/**
	 * Permet de calculer le périmètre d'une ligne.
	 * @return longueur
	 */
	public double calcPerimetre() {
		this.setPerimetre(longueur);
		return this.longueur;
	}
	
	
	/**
	 * Permet de faire l'homothétie d'une ligne par rapport à un centre
	 * @param rapport
	 * @param centreH
	 */
	public void homothétie(double rapport, Position centreH) { 
		this.debut.homothétie(rapport, centreH);
		this.fin.homothétie(rapport, centreH);
		this.longueur = this.longueur*rapport;
		this.homothetietext(rapport, centreH);
	}
	
	/**
	 * Permet de faire la translation d'une ligne.
	 * @param vecteurx
	 * @param vecteury
	 */
	@Override
	public void translation(double vecteurx, double vecteury) {
		this.debut.translation(vecteurx, vecteury);
		this.fin.translation(vecteurx, vecteury);
		this.translationtext(vecteurx, vecteury);
	}
	/**
	 * Permet de faire la rotation d'une ligne par rapport à un centre
	 * @param centreR
	 * @param degre
	 * 
	 */
	public void rotation(Position centreR, double degre) {
		this.debut.rotation(centreR, degre);
		this.fin.rotation(centreR, degre);
		this.rotationtext(centreR, degre);
	}
	/**
	 * Permet de faire la symétrie centrale d'une ligne par rapport à un centre 
	 * @param centreSym
	 */
	@Override
	public void symetriecentrale(Position centreSym) {
		this.rotation(centreSym, 180);
		this.symetriecentraletext(centreSym);

	}
	
	/**
	 * Permet de faire la symétrie axiale d'une ligne par rapport un axe de type Ligne
	 * @param axe
	 * 
	 */
	@Override
	public void symetrieaxiale(Ligne axe) {
		this.debut.symetrieaxiale(axe);
		this.fin.symetrieaxiale(axe);
		this.symetrieaxialetext(axe);
	}
	/**
	 * Permet de retourner les coordonnées du point de début de la ligne.
	 * @return debut 
	 */
	public Position getDebut() {
		return this.debut;
	}
	/**
	 * Permet de retourner les coordonnées du point de fin de la ligne.
	 * @return fin 
	 */
	public Position getFin() {
		return this.fin;
	}
	/**
	 * Permet de retourner la longueur de la ligne.
	 * @return longueur 
	 */
	public double getLongueur() {
		return this.longueur;
	}

	/**
	 * Retourne un String contenant les caractéristique de la ligne ainsi que la transformation (s'il y en a eu une)
	 * @return s 
	 */
	public String toString() {
		String s = "";
		s+= "Je suis une ligne { Départ : " + this.debut + 
				", Fin : " + this.fin + 
				", Longueur : " + this.longueur;
		if (!this.transformation.equals(" ")) {
			s+= this.transformation;			
		}
		s+= " }";
		return s;
	}


}