package Formes;

public abstract class Forme implements Manipulable, Comparable<Forme>, Cloneable{
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
	
}
