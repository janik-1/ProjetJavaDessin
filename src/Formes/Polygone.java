package Formes;

public class Polygone extends Forme implements Manipulable {
	private Position centre;
	private int nbsommet;
	private int longueur;
	private int lar;
	
	public Polygone (int posx, int posy, int nbso, int longu, int lar) {

		this.nbsommet = nbso;
		this.longueur = longu;
		this.lar = lar;
	}
	
	@Override
	public double calcAire() {
		return this.longueur*this.lar;
	}
	@Override
	public double calcPerimetre() {
		return this.longueur*2+this.lar*2;
	}
	
	public String toString() {
		String s= "Je suis un Polygone";
		return s;
	}

	@Override
	public void homothétie(double rapport, Position centreH) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void translation(double vecteurx, double vecteury) {
		
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
}
