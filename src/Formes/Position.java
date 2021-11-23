package Formes;

/**
 * Une classe qui repr�sente une position (ou d'un point).
 * @author Fardeen POOREEA et Janik JIANG
 *
 */
public class Position {
	private double posx;
	private double posy;
	
	/**
	 * Initialise un point (ou Position)
	 * @param posx
	 * @param posy
	 */
	public Position (double posx, double posy) {
		this.posx = posx;
		this.posy = posy;
	}
	
	/**
	 * Retourne la coordonn�e x d'un point.
	 * @return posx
	 */
	public double getPosx() {
		return posx;
	}
	/**
	 * Modifie la coordonn�e x d'un point.
	 * @param posx
	 */
	public void setPosx(double posx) {
		this.posx = posx;
	}
	/**
	 * Retourne la coordonn�e y d'un point
	 * @return
	 */
	public double getPosy() {
		return posy;
	}
	/**
	 * Modifie la coordonn�e y d'un point.
	 * @param posy
	 */
	public void setPosy(double posy) {
		this.posy = posy;
	}
	
	/**
	 * Calcule la distance entre deux points.
	 * @param Point
	 * @return
	 */
	public double CalculDistance(Position Point) {	
		double distance = Math.sqrt(Math.pow(Point.getPosx() -  this.getPosx(), 2))+
				Math.pow((Point.getPosy()-this.getPosy()),2);	
		return distance;
	}
	
	/**
	 * Permet de faire l'homoth�tie d'un point par rapport � un centre.
	 * @param rapport
	 * @param centreH
	 */
	public void homoth�tie(double rapport, Position centreH) {
		this.setPosx(((this.getPosx()-centreH.getPosx())*rapport) + centreH.getPosx());
		this.setPosy(rapport*(this.getPosy()-centreH.getPosy()) + centreH.getPosy());
	}
	
	/**
	 * Permet de faire la translation d'un point.
	 * @param vecteurx
	 * @param vecteury
	 */
	public void translation(double vecteurx, double vecteury) {
		this.posx = (vecteurx+this.posx);
		this.posy = (vecteury+this.posy);
	}
	
	/**
	 * Permet de faire la rotation d'un point par rapport � un centre.
	 * @param centreR
	 * @param degre
	 */
	public void rotation(Position centreR, double degre) {
	    double angle = degre * Math.PI/180;
		double xM = this.posx - centreR.getPosx();
	    double yM = this.posy - centreR.getPosy();
	    this.setPosx(Math.round(xM * Math.cos(angle)+yM*Math.sin(angle) + centreR.getPosx()));
	    this.setPosy(Math.round((-xM)*Math.sin(angle)+yM*Math.cos(angle)+centreR.getPosy()));

	}
	
	/**
	 * Permet de faire la sym�trie centrale d'un point par rapport � un centre.
	 * @param centreSym
	 */
	public void symetriecentrale(Position centreSym) {
		this.rotation(centreSym, 180);
	}
	
	/**
	 * Permet de faire la sym�trie axiale d'un point par rapport � un axe (qui est une Ligne).
	 * @param Ligne axe
	 */
	public void symetrieaxiale(Ligne axe) {
		posy = this.getPosy();
		if (axe.getDebut().getPosx() == axe.getFin().getPosx()) {
			this.setPosx(2*axe.getDebut().getPosx()-this.getPosx());
			// La position de Y reste inchang� lorsque on fait une sym�trie axiale avec une droite parall�le �
			// l'axe des ordonn�s.
			this.setPosy(this.getPosy()); 
		} else {
		double a = (axe.getFin().getPosy() - axe.getDebut().getPosy())/(axe.getFin().getPosx() - axe.getDebut().getPosx());

		double b = axe.getDebut().getPosy() - a*axe.getDebut().getPosx();
		
		double posix =  (((1-Math.pow(a,2))*this.getPosx()) + (2*a*this.getPosy()) - (2*a*b))/(1+Math.pow(a, 2));
		double posiy = ((2*a*this.getPosx()) - ((1-Math.pow(a, 2))*this.getPosy())+(2*b))/(1+Math.pow(a, 2));
		// �quation de type ax+b la droite

		this.setPosx(posix);
		
		this.setPosy(posiy);
		
		}
		
	}
	/**
	 * Retourne un string contenant les coordonn�es d'un point.
	 * @return s
	 */
	public String toString() {
		String s = new String();
		s+="("+ this.posx + "," + this.posy + ")";
		return s;
	}
}
