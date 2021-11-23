package Formes;

public class Position {
	private double posx;
	private double posy;
	
	public Position (double posx, double posy) {
		this.posx = posx;
		this.posy = posy;
	}

	public double getPosx() {
		return posx;
	}

	public void setPosx(double posx) {
		this.posx = posx;
	}

	public double getPosy() {
		return posy;
	}

	public void setPosy(double posy) {
		this.posy = posy;
	}
	
	public double CalculDistance(Position Point) {	
		double distance = Math.sqrt(Math.pow(Point.getPosx() -  this.getPosx(), 2))+
				Math.pow((Point.getPosy()-this.getPosy()),2);	
		return distance;
	}
	
	public void homothétie(double rapport, Position centreH) {
		this.setPosx(this.getPosx()*rapport);
		this.setPosy(this.getPosy()*rapport);
	}
	
	public void translation(double vecteurx, double vecteury) {
		this.posx = (vecteurx+this.posx);
		this.posy = (vecteury+this.posy);
	}
	
	public void rotation(Position centreR, double degre) {
	    double angle = degre * Math.PI/180;
		double xM = this.posx - centreR.getPosx();
	    double yM = this.posy - centreR.getPosy();
	    this.setPosx(Math.round(xM * Math.cos(angle)+yM*Math.sin(angle) + centreR.getPosx()));
	    this.setPosy(Math.round((-xM)*Math.sin(angle)+yM*Math.cos(angle)+centreR.getPosy()));
//		double distance = Math.sqrt(Math.pow(centreR.getPosx()-this.getPosx(), 2))+
//				Math.pow((centreR.getPosy()-this.getPosy()),2);
//		this.setPosx(distance*Math.cos(degre)+centreR.getPosx());
//		this.setPosy(distance*Math.sin(degre)+centreR.getPosy());
	}
	
	public void symetriecentrale(Position centreSym) {
		this.rotation(centreSym, 180);
	}
	
	public void symetrieaxiale(Ligne axe) {
		if (axe.getDebut().getPosx() == axe.getFin().getPosx()) {
			this.setPosx(2*axe.getDebut().getPosx()-this.getPosx());
			// La position de Y reste inchangé lorsque on fait une symétrie axiale avec une droite parallèle à
			// l'axe des ordonnés.
			this.setPosy(this.getPosy()); 
		} else {
		double a = (axe.getFin().getPosy() - axe.getDebut().getPosy())/(axe.getFin().getPosx() - axe.getDebut().getPosx());
		double b = axe.getDebut().getPosy() - a*axe.getDebut().getPosx();
		
		// équation de type ax+b la droite
		
		this.setPosx((1-Math.pow(a,2)*this.getPosx() + 2*a*this.getPosy()-2*a*b)/(1+Math.pow(a, 2)));
		this.setPosy((2*a*this.getPosx() - (1-Math.pow(a, 2))*this.getPosy()+2*b)/(1+Math.pow(a, 2)));
		}
	}
	
	public String toString() {
		String s = new String();
		s+="("+ this.posx + "," + this.posy + ")";
		return s;
	}
}
