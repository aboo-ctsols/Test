package com.example1;
import java.awt.*;

public class Car {
	//Datatypes
	//int -> Integer 1,2,3 
	//double -> decimal 32.1, 31.3
	//Color ->awt library
	//boolean -> 0,1 True or False
	int averageMilesPerGallon;
	String licensePlate;
	Color paintColor;
	boolean areTaillightsWorking;
	
	public Car(int inputAvgMPG, 
			String inputLicensePlate, 
			Color inputPaintColor,
			boolean inputAreTaillightsWorking) {
		this.averageMilesPerGallon = inputAvgMPG;
		this.licensePlate = inputLicensePlate;
		this.paintColor = inputPaintColor;
		this.areTaillightsWorking = inputAreTaillightsWorking;		
	}
	public void changePaintColor(Color newPaintColor) {
		this.paintColor= newPaintColor;
	}
}
