package Formes;

public class Cercle extends Forme implements Manipulable {
	private double rayon;
	private Position centre;

	public Cercle (int rayon, int posx, int posy) {
		this.centre = new Position(posx, posy);
		this.rayon = rayon;
	}
	
	public String toString() {
		String s= "Je suis un cercle";
		s+= " Mon centre est situé (" + centre.getPosx() + "," + centre.getPosy() + ")";
		s+= " Mon périmètre est " +  this.calcAire();
		s+= " Mon aire est " + this.calcPerimetre();
		return s;
	}

	@Override
	public double calcAire() {
		double aire = Math.PI*this.rayon*this.rayon;
		return aire;
	}

	@Override
	public double calcPerimetre() {
		return 2*Math.PI*this.rayon;
	}

	@Override
	public void homothétie(double rapport, Position centreH) {
		this.centre.homothétie(rapport, centreH);
		this.rayon=Math.abs(this.rayon*rapport);
	}



	@Override
	public void translation(double vecteurx, double vecteury) {
		this.centre.translation(vecteurx, vecteury);
	}

	@Override
	public void rotation(Position centreR, double degre) {
		this.centre.rotation(centreR, degre);
	}

	@Override
	public void symetriecentrale(Position centreSym) {
		this.rotation(centreSym, 180);
	}

	@Override
	public void symetrieaxiale(Ligne axe) {
		this.centre.symetrieaxiale(axe);
	}

}
