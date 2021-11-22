package Dessin;

import java.util.ArrayList;
import java.util.HashSet;

import Formes.Manipulable;

public class Image {
	private HashSet<Manipulable> Formes;
	
	public Image() {
		this.Formes = new HashSet<Manipulable>();
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
