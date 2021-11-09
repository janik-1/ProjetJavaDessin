package Formes;

public class Ligne implements Manipulable{
	private Position debut;
	private Position fin;
	private float longueur;
	
	public Ligne(int debx, int deby, int finx, int finy, float longueur) {
		this.longueur = longueur;
		this.debut = new Position(debx, deby);
		this.fin = new Position(finx, finy);
	}
	
	public double calcAire() {
		return 0;
	}
	public double calcPerimetre() {
		return this.longueur;
	}
	
	@Override
	public void homothétie(float rapport) {
		this.longueur = this.longueur*rapport;
	}
	
	@Override
	public void translation(int axex, int axey) {
		this.posx = this.posx+axex;
		this.posy = this.posy+axey;
	}
	@Override
	public void rotation(int centx, int centy, int degre) {
		
	}
	@Override
	public void symetriecentrale(int centx, int centy) {
		
	}
	@Override
	public void symetrieaxiale() {
		// TODO Auto-generated method stub
		
	}

	public String toString() {
		return "Je suis une ligne";
	}


}
