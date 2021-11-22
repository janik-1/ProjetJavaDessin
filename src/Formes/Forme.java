package Formes;

public abstract class Forme implements Manipulable{
	private double aire;
	private double perimetre;
	
	
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
	
	
}
