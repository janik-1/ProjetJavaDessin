package Formes;

public class Polygone implements Manipulable {
	private int posx;
	private int poxy;
	private int nbsommet;
	private int longueur;
	private int lar;
	
	public Polygone (int posx, int posy, int nbso, int longu, int lar) {
		this.posx =  posx;
		this.poxy = posy;
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
	
	@Override
	public void homothétie(float rapport) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void translation(int axex, int axey) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void rotation(int centx, int centy, int degre) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void symetriecentrale(int centx, int centy) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void symetrieaxiale() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		String s= "Je suis un Polygone";
		return s;
	}
}
