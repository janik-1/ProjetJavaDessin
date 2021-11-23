package Formes;

/**
 * Cette interface contient toutes les fonctions indispensable à une classe représentant une forme (Cercle, Ellipse, ...)
 * @author Fardeen POOREEA et Janik JIANG
 *
 */

public interface Manipulable {
	public double calcAire();
	public double calcPerimetre();
	public void homothétie(double rapport, Position centreH);
	public void translation(double vecteurx, double vecteury);
	public void rotation(Position centreR, double degre);
	public void symetriecentrale(Position centreSym);
	public void symetrieaxiale(Ligne axe) ;	
	public String toString();
}
