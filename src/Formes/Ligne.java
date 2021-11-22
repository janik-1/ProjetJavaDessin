package Formes;

public class Ligne extends Forme implements Manipulable{
	private Position debut;
	private Position fin;
	private double longueur;
	
	public Ligne(int debx, int deby, int finx, int finy, float longueur) {
		this.longueur = longueur;
		this.debut = new Position(debx, deby);
		this.fin = new Position(finx, finy);
	}
	
	public double calcAire() {
		return 0;
	}
	public double calcPerimetre() {
		return this.longueur;
	}
	
	public void homothétie(double rapport, Position centreH) { 
		this.debut.homothétie(rapport, centreH);
		this.fin.homothétie(rapport, centreH);
		this.longueur = this.longueur*rapport;
	}
	
	@Override
	public void translation(double vecteurx, double vecteury) {
		this.debut.translation(vecteurx, vecteury);
		this.fin.translation(vecteurx, vecteury);
	}
	@SuppressWarnings("unused")
	public void rotation(Position centreR, double degre) {
		this.debut.rotation(centreR, degre);
		this.fin.rotation(centreR, degre);
	}
	
	@Override
	public void symetriecentrale(Position centreSym) {
		this.rotation(centreSym, 180);
	}
	
	
	@Override
	public void symetrieaxiale(Ligne axe) {
		this.debut.symetrieaxiale(axe);
		this.fin.symetrieaxiale(axe);
	}
	
	public Position getDebut() {
		return this.debut;
	}
	
	public Position getFin() {
		return this.fin;
	}

	public String toString() {
		return "Je suis une ligne, ayant pour coordonnées du point de départ : " + this.debut + 
				"coordonnées du point de fin :" + this.fin + 
				"et de longueur :" + this.longueur
				
				; 
	}


}