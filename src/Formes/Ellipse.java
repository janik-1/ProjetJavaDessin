package Formes;

import java.lang.*;

public class Ellipse extends Forme{
	private Position centre;
	private Ligne petitaxe;
	private Ligne grandaxe;

	public Ellipse(Position centre, Ligne grandaxe, Ligne petitaxe) {
		this.centre = centre;
		this.grandaxe = grandaxe;
		this.petitaxe = petitaxe;
		this.transformation= " ";

	}

	public String toString() {
		String s="";
		s+= "Je suis une ellipse { Centre : " + this.centre;
		if (!this.transformation.equals(" ")) {
			s+= "," + this.transformation;			
		}
		s+= " }";
		return s;
	}
	
	public double CalculDistance(Ligne l) {	
		double distance = Math.sqrt(Math.pow(l.getFin().getPosx() -  l.getDebut().getPosx(), 2))+
				Math.pow((l.getFin().getPosy()-l.getDebut().getPosy()),2);
	
		return distance;	
	}
	

	@Override
	public double calcAire() {
		double aire= Math.PI*CalculDistance(this.grandaxe)*CalculDistance(this.petitaxe);
		return aire; 
	}

	@Override
	public double calcPerimetre() {
		double peri = 2*Math.PI*Math.sqrt((CalculDistance(this.petitaxe)*CalculDistance(this.petitaxe)+CalculDistance(this.grandaxe)*CalculDistance(this.grandaxe))/2);
		return peri;
	}

	@Override
	public void rotation(Position centreR, double degre) {
		this.petitaxe.rotation(centreR, degre);
		this.grandaxe.rotation(centreR, degre);
		this.centre.rotation(centreR, degre);
		this.rotationtext(centreR, degre);
	}

	@Override
	public void symetriecentrale(Position centreSym) {
		this.centre.rotation(centreSym, 180);
		this.petitaxe.rotation(centreSym, 180);
		this.grandaxe.rotation(centreSym, 180);
		this.symetriecentraletext(centreSym);
	}

	@Override
	public void symetrieaxiale(Ligne axe) {
		this.petitaxe.symetrieaxiale(axe);
		this.grandaxe.symetrieaxiale(axe);
		this.centre.symetrieaxiale(axe);
		this.symetrieaxialetext(axe);
	}

	@Override
	public void homothétie(double rapport, Position centreH) { 
		this.petitaxe.homothétie(rapport, centreH);
		this.grandaxe.homothétie(rapport, centreH);
		this.centre.homothétie(rapport, centreH);
		this.homothetietext(rapport, centreH);
	}
	

	@Override
	public void translation(double vecteurx, double vecteury) {
		this.grandaxe.translation(vecteurx, vecteury);
		this.petitaxe.translation(vecteurx, vecteury);
		this.centre.translation(vecteurx, vecteury);
		this.translationtext(vecteurx, vecteury);
	}


}