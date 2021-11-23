package Formes;

import java.text.DecimalFormat;

public class Cercle extends Forme{
	private double rayon;
	private Position centre;
	
	/*
	 * 
	 */
	public Cercle (int rayon, int posx, int posy) {
		this.centre = new Position(posx, posy);
		this.rayon = rayon;
		this.calcAire();
		this.calcPerimetre();
		this.transformation= " ";
	}
	
	public String toString() {
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		String s= "Je suis un cercle {";
		s+= " Centre : (" + centre.getPosx() + "," + centre.getPosy() + "),";
		s+= " Périmètre :" +  numberFormat.format(this.calcAire()) + ",";
		s+= " Aire :" + numberFormat.format(this.calcPerimetre());
		if (!this.transformation.equals(" "))
			s+= this.transformation;
		s+= " }";
		return s;
	}

	@Override
	public double calcAire() {
		double aire = Math.PI*this.rayon*this.rayon;
		this.setAire(aire);
		return aire;
	}

	@Override
	public double calcPerimetre() {
		double perimetre = 2*Math.PI*this.rayon;
		this.setPerimetre(perimetre);
		return 2*Math.PI*this.rayon;
	}

	@Override
	public void homothétie(double rapport, Position centreH) {
		this.centre.homothétie(rapport, centreH);
		this.rayon=Math.abs(this.rayon*rapport);
		this.homothetietext(rapport, centreH);
	}



	@Override
	public void translation(double vecteurx, double vecteury) {
		this.centre.translation(vecteurx, vecteury);
		this.translationtext(vecteurx, vecteury);
	}

	@Override
	public void rotation(Position centreR, double degre) {
		this.centre.rotation(centreR, degre);
		this.rotationtext(centreR, degre);
	}

	@Override
	public void symetriecentrale(Position centreSym) {
		this.rotation(centreSym, 180);
		this.symetriecentraletext(centreSym);
	}

	@Override
	public void symetrieaxiale(Ligne axe) {
		this.centre.symetrieaxiale(axe);
		this.symetrieaxialetext(axe);
	}

}
