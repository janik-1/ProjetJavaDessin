package Formes;

public class Ligne extends Forme{
	private Position debut;
	private Position fin;
	private double longueur;
	
	public Ligne(int debx, int deby, int finx, int finy) {
		this.debut = new Position(debx, deby);
		this.fin = new Position(finx, finy);
		this.longueur = debut.CalculDistance(fin);
		this.calcAire();
		this.calcPerimetre();
		this.transformation= " ";
	}
	
	public double calcAire() {
		this.setAire(0);
		return 0;
	}
	public double calcPerimetre() {
		this.setPerimetre(longueur);
		return this.longueur;
	}
	
	public void homothétie(double rapport, Position centreH) { 
		this.debut.homothétie(rapport, centreH);
		this.fin.homothétie(rapport, centreH);
		this.longueur = this.longueur*rapport;
		this.homothetietext(rapport, centreH);
	}
	
	@Override
	public void translation(double vecteurx, double vecteury) {
		this.debut.translation(vecteurx, vecteury);
		this.fin.translation(vecteurx, vecteury);
		this.translationtext(vecteurx, vecteury);
	}

	public void rotation(Position centreR, double degre) {
		this.debut.rotation(centreR, degre);
		this.fin.rotation(centreR, degre);
		this.rotationtext(centreR, degre);
	}
	
	@Override
	public void symetriecentrale(Position centreSym) {
		this.rotation(centreSym, 180);
		this.symetriecentraletext(centreSym);

	}
	
	
	@Override
	public void symetrieaxiale(Ligne axe) {
		this.debut.symetrieaxiale(axe);
		this.fin.symetrieaxiale(axe);
		this.symetrieaxialetext(axe);
	}
	
	public Position getDebut() {
		return this.debut;
	}
	
	public Position getFin() {
		return this.fin;
	}
	
	public double getLongueur() {
		return this.longueur;
	}

	public String toString() {
		String s = "";
		s+= "Je suis une ligne { Départ : " + this.debut + 
				", Fin : " + this.fin + 
				", Longueur : " + this.longueur;
		if (!this.transformation.equals(" ")) {
			s+= this.transformation;			
		}
		s+= " }";
		return s;
	}


}