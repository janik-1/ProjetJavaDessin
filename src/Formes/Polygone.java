package Formes;

import java.util.ArrayList;

public class Polygone extends Forme {
	
	private ArrayList <Ligne> ligne;
	private int nbsommet;
	
	public Polygone (ArrayList <Ligne> p) {
		
		this.ligne = new ArrayList<Ligne>();
		this.ligne = p ;
		this.nbsommet = this.ligne.size();
		
	}
	
	@Override
	public double calcAire() {	
		double aire = 0;
		
		// plus tard 
		
		return aire;			 
	}
	
	
public double CalculDistance(Ligne l) {		
	
		double distance = Math.sqrt(Math.pow(l.getFin().getPosx() -  l.getDebut().getPosx(), 2))+
				Math.pow((l.getFin().getPosy()-l.getDebut().getPosy()),2);
	
		return distance;		
		
	}
	

	@Override
	public double calcPerimetre() {
		double perim = 0;
		
			for (Ligne l : ligne) {
				perim = perim + l.getDebut().CalculDistance(l.getFin());
			}
		
		return perim;
	}
	
	
	@Override
	public void homothétie(double rapport, Position centreH) {
		
		for (Ligne l : ligne) {
			l.getDebut().homothétie(rapport, centreH);
			l.getFin().homothétie(rapport, centreH);
		}
	
		
	}

	@Override
	public void translation(double vecteurx, double vecteury) {
		for (Ligne l : ligne) {
			l.getDebut().translation(vecteurx, vecteury);
			l.getFin().translation(vecteurx, vecteury);
		}
	}

	@Override
	public void rotation(Position centreR, double degre) {
		for (Ligne l : ligne) {
			l.getDebut().rotation(centreR, degre);
			l.getFin().rotation(centreR, degre);
		}
		
	}

	@Override
	public void symetriecentrale(Position centreSym) {
		for (Ligne l : ligne) {
			l.getDebut().rotation(centreSym,180);
			l.getFin().rotation(centreSym, 180);
		}
	}
	
	
	@Override
	public void symetrieaxiale(Ligne axe) {
		for (Ligne l : ligne) {
			l.getDebut().symetrieaxiale(axe);
			l.getFin().symetrieaxiale(axe);
		}
		
	}
	
	public String toString() {
		String s= "Je suis un Polygone ayant pour côtés :" +	this.ligne
				+ "et avec un nombre de sommet de :" + this.nbsommet;
		return s;
	}

}