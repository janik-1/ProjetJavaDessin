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
	
	public int cmpX(Position centre) {
		if (this.posx < centre.getPosx())
			return 1;
		return -1;
	}
	
	public int cmpY(Position centre) {
		if (this.posy < centre.getPosy())
			return 1;
		return -1;
	}
	
	public void homoth�tie(double rapport, Position centreH) {
		this.setPosx(this.getPosx()*rapport*this.cmpX(centreH));
		this.setPosy(this.getPosy()*rapport*this.cmpY(centreH));
	}
	
	public void translation(double vecteurx, double vecteury) {
		this.posx = (vecteurx+this.posx);
		this.posy = (vecteury+this.posy);
	}
	
	public void rotation(Position centreR, double degre) {
		double distance = Math.sqrt(Math.pow(centreR.getPosx()-this.getPosx(), 2))+
				Math.pow((centreR.getPosy()-this.getPosy()),2);
		this.setPosx(distance*Math.cos(degre)+centreR.getPosx());
		this.setPosy(distance*Math.sin(degre)+centreR.getPosy());
	}
	
	public void symetriecentrale(Position centreSym) {
		this.rotation(centreSym, 180);
	}
	
	public void symetrieaxiale(Ligne axe) {
		if (axe.getDebut().getPosx() == axe.getFin().getPosx()) {
			this.setPosx(2*axe.getDebut().getPosx()-this.getPosx());
			// La position de Y reste inchang� lorsque on fait une sym�trie axiale avec une droite parall�le �
			// l'axe des ordonn�s.
			this.setPosy(this.getPosy()); 
		} else {
		double a = (axe.getFin().getPosy() - axe.getDebut().getPosy())/(axe.getFin().getPosx() - axe.getDebut().getPosx());
		double b = axe.getDebut().getPosy() - a*axe.getDebut().getPosx();
		
		// �quation de type ax+b la droite
		
		this.setPosx((1-Math.pow(a,2)*this.getPosx() + 2*a*this.getPosy()-2*a*b)/(1+Math.pow(a, 2)));
		this.setPosy((2*a*this.getPosx() - (1-Math.pow(a, 2))*this.getPosy()+2*b)/(1+Math.pow(a, 2)));
		}
	}
	
}
