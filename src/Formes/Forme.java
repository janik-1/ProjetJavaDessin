package Formes;

public abstract class Forme implements Manipulable, Comparable<Forme>, Cloneable{
	private double aire;
	private double perimetre;
	protected String transformation;
	
	
	public double getAire() {
		return aire;
	}
	public void setAire(double aire) {
		this.aire = aire;
	}
	public double getPerimetre() {
		return perimetre;
	}
	public void setPerimetre(double perimetre) {
		this.perimetre = perimetre;
	}
	
	public boolean plusGrand(Forme forme) {
		return (this.perimetre > forme.perimetre);
	}
	
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
	
	public Forme clone() throws CloneNotSupportedException {
		return (Forme)super.clone();
	}
	
	public void homothetietext(double rapport, Position centreH) {
		this.transformation+= "Homothétie de rapport " + rapport + ". ";
	}
	
	public void translationtext(double vecteurx, double vecteury) {
		this.transformation+= "Translation de vecteur " + vecteurx + "," + vecteury + ". ";
	}
	
	public void rotationtext(Position centreR, double degre) {
		this.transformation+= "Rotation de degre " + degre + ". ";
	}
	
	public void symetriecentraletext(Position centreSym) {
		this.transformation+= "Symetrie centrale de centre " + centreSym + ". ";
	}
	
	public void symetrieaxialetext(Ligne axe) {
		this.transformation+= "Symetrie axiale de l'axe" + ". ";
	}

}
