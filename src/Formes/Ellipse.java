package Formes;

import java.lang.*;

public class Ellipse implements Manipulable{
	private int posx;
	private int posy;
	private int petitaxe;
	private int grandaxe;

	public Ellipse(int posx, int posy, int grandaxe, int petitaxe) {
		this.posx = posx;
		this.posy = posy;
		this.grandaxe = grandaxe;
		this.petitaxe = petitaxe;
	}

	public String toString() {
		return "Je suis une ellipse";
	}

	@Override
	public double calcAire() {
		double aire= Math.PI*this.grandaxe*this.petitaxe;
		return aire; 
	}

	@Override
	public double calcPerimetre() {
		double peri = 2*Math.PI*Math.sqrt((this.petitaxe*this.petitaxe+this.grandaxe*this.grandaxe)/2);
		return peri;
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
