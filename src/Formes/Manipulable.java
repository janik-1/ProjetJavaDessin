package Formes;

/**
 * Cette interface contient toutes les fonctions indispensable � une classe repr�sentant une forme (Cercle, Ellipse, ...)
 * @author Fardeen POOREEA et Janik JIANG
 *
 */

public interface Manipulable {
	public double calcAire();
	public double calcPerimetre();
	public void homoth�tie(double rapport, Position centreH);
	public void translation(double vecteurx, double vecteury);
	public void rotation(Position centreR, double degre);
	public void symetriecentrale(Position centreSym);
	public void symetrieaxiale(Ligne axe) ;	
	public String toString();
}
