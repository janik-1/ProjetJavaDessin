package Dessin;

import java.util.ArrayList;

import Formes.Manipulable;

public class Image {
	private ArrayList<Manipulable> Formes;
	
	public Image() {
		this.Formes = new ArrayList<Manipulable>();
	}
	
	public void addForme(Manipulable forme) {
		this.Formes.add(forme);
	}
	
	public String toString() {
		String s = "";
		for (Manipulable manipulable : Formes) {
			s+=manipulable.toString();
			s+= System.lineSeparator();
		}
		return s;
	}
}
