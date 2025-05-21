package com.bahaa.AbstractArt;

public class Painting extends Art {
	String PaintType;

	@Override
	void viewArt() {
		// TODO Auto-generated method stub
        System.out.println("Painting: " + title);
        System.out.println("Author: " + authour);
        System.out.println("Description: " + description);
        System.out.println("Paint Type: " + PaintType);
        System.out.println("---------------------------");
	}
	

}
