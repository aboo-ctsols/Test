package com.example1;

import java.awt.Color;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Car CarA= new Car(25, "VGZ2334", Color.RED, false);
		Car CarB= new Car(28, "VGZ5668", Color.BLACK, true);
		
		System.out.println("Licence Number of CarA "+ CarA.licensePlate);
		System.out.println("Licence Number of CarB "+CarB.licensePlate);
		
		System.out.println("Color of CarA before changing color: "+ CarA.paintColor.toString());
		CarA.changePaintColor(Color.CYAN);
		System.out.println("Color of CarA after changing color: "+ CarA.paintColor.toString());

	}
}
