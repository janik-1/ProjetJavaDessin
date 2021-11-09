package Formes;

public interface Manipulable {
	public double calcAire();
	public double calcPerimetre();
	public void homothétie(float rapport);
	public void translation(int axex, int axey);
	public void rotation(int centx, int centy, int degre);
	public void symetriecentrale(int centx, int centy);
	public void symetrieaxiale();	
}
