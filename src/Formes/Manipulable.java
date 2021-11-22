package Formes;

public interface Manipulable {
	public double calcAire();
	public double calcPerimetre();
	public void homothétie(double rapport, Position centreH);
	public void translation(double vecteurx, double vecteury);
	public void rotation(Position centreR, double degre);
	public void symetriecentrale(Position centreSym);
	public void symetrieaxiale(Ligne axe) ;	
	public String toString();
}
