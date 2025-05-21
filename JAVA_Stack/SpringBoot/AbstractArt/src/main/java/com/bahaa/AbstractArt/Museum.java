package com.bahaa.AbstractArt;

import java.util.ArrayList;

public class Museum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Painting monaliza = new Painting(); 
		monaliza.title = "The Monaliza";
		monaliza.authour = "Michelangilo";
		monaliza.description = "famous painting";
		monaliza.PaintType = "Oil";
		Painting StaryNight = new Painting();
		StaryNight.title = "The Night stars";
		StaryNight.authour = "Da vinci";
		StaryNight.description = "blue famous painting";
		StaryNight.PaintType = "Oil";
		Painting TheCreationOfAdam = new Painting();
		TheCreationOfAdam.title = "The Creation";
		TheCreationOfAdam.authour = "Michelangilo";
		TheCreationOfAdam.description = "famous painting";
		TheCreationOfAdam.PaintType = "Oil";
		Sculpture VenusDeMilo = new Sculpture();
		VenusDeMilo.title = "VenusDeMilo";
		VenusDeMilo.authour = "dont know";
		VenusDeMilo.description = "amazing";
		VenusDeMilo.material = "stone";
		Sculpture David = new Sculpture();
		David.title = "David";
		David.authour = "dont know";
		David.description = "big";
		David.material = "quartz";

		ArrayList<Art> museum = new ArrayList<>();
        museum.add(monaliza);
        museum.add(StaryNight);
        museum.add(TheCreationOfAdam);
        museum.add(VenusDeMilo);
        museum.add(David);
        for (Art art : museum) {
            art.viewArt();
        }

	}

}
