package com.bahaa.AbstractArt;

public class Sculpture extends Art  {
	String material;

	@Override
	void viewArt() {
		// TODO Auto-generated method stub
        System.out.println("Sculpture: " + title);
        System.out.println("Author: " + authour);
        System.out.println("Description: " + description);
        System.out.println("Material: " + material);
        System.out.println("---------------------------");
	}

}
