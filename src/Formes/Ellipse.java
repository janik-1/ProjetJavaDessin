package Formes;

import java.lang.*;

public class Ellipse implements Manipulable{
	private Position centre;
	private int petitaxe;
	private int grandaxe;

	public Ellipse(Position centre, int grandaxe, int petitaxe) {
		this.centre = centre;
		this.grandaxe = grandaxe;
		this.petitaxe = petitaxe;
	}

	public String toString() {
		return "Je suis une ellipse";
	}

	@Override
	public double calcAire() {
		double aire= Math.PI*this.grandaxe*this.petitaxe;
		return aire; 
	}

	@Override
	public double calcPerimetre() {
		double peri = 2*Math.PI*Math.sqrt((this.petitaxe*this.petitaxe+this.grandaxe*this.grandaxe)/2);
		return peri;
	}

	@Override
	public void rotation(Position centreR, double degre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void symetriecentrale(Position centreSym) {
		this.rotation(centreSym, 180);
	}

	@Override
	public void symetrieaxiale(Ligne axe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void homothétie(double rapport, Position centreH) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void translation(double vecteurx, double vecteury) {
		// TODO Auto-generated method stub
		
	}

	
	

}
