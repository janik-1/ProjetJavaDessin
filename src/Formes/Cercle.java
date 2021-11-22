package Formes;

public class Cercle extends Forme implements Manipulable {
	private double rayon;
	private Position centre;
	private String transformation;

	public Cercle (int rayon, int posx, int posy) {
		this.centre = new Position(posx, posy);
		this.rayon = rayon;
	}
	
	public String toString() {
		String s= "Je suis un cercle";
		s+= " Mon centre est situ� (" + centre.getPosx() + "," + centre.getPosy() + ")";
		s+= " Mon p�rim�tre est " +  this.calcAire();
		s+= " Mon aire est " + this.calcPerimetre();
		s+= this.transformation;
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
	public void homoth�tie(double rapport, Position centreH) {
		this.centre.homoth�tie(rapport, centreH);
		this.rayon=Math.abs(this.rayon*rapport);
		this.transformation+= "Je suis une homoth�tie de rapport " + rapport + ". ";
	}



	@Override
	public void translation(double vecteurx, double vecteury) {
		this.centre.translation(vecteurx, vecteury);
		this.transformation+= "Je suis la translation de vecteur " + vecteurx + "," + vecteury + ". ";
	}

	@Override
	public void rotation(Position centreR, double degre) {
		this.centre.rotation(centreR, degre);
		this.transformation+= "Je suis la rotation de degre " + degre + ". ";
	}

	@Override
	public void symetriecentrale(Position centreSym) {
		this.rotation(centreSym, 180);
		this.transformation+= "Je suis la symetrie centrale de centre " + centreSym + ". ";
	}

	@Override
	public void symetrieaxiale(Ligne axe) {
		this.centre.symetrieaxiale(axe);
		this.transformation+= "Je suis la symetrie axiale de l'axe" + ". ";

	}

}
