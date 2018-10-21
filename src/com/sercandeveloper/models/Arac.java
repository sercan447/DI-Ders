package com.sercandeveloper.models;

public class Arac {
	
	//Otobus otobus;
	//Kamyon kamyon;
	
	IArac arac;
	public Arac() {
		
	}
	public Arac(IArac arac) {
		
		this.arac = arac; 
		
		//kamyon = new Kamyon();
		//otobus = new Otobus();	
	}

	
	public void Kullan() {
		
		this.arac.Gaz();
		this.arac.Vites();
		this.arac.Fren();
		
		/*
		otobus.Gaz();
		otobus.Vites();
		otobus.Fren();
		*/
		
		/*
		kamyon.Gaz();
		kamyon.Vites();
		kamyon.Fren();
		*/
		
	}

	public void Methodile(IArac arac) {
		arac.Gaz();
		arac.Vites();
		arac.Fren();
		
	}

	public IArac getArac() {
		return arac;
	}


	public void setArac(IArac arac) {
		this.arac = arac;
	}
	
	
	
}
