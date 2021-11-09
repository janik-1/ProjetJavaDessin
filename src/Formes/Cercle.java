package Formes;

public class Cercle implements Manipulable {
	private int rayon;
	private int posx;
	private int posy;

	public Cercle (int rayon, int posx, int posy) {
		this.posx = posx;
		this.posy = posy;
		this.rayon = rayon;
	}
	
	public String toString() {
		String s= "Je suis un cercle";
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

}
