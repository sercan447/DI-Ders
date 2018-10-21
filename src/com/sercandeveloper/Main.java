package com.sercandeveloper;

import com.sercandeveloper.models.Arac;
import com.sercandeveloper.models.Kamyon;
import com.sercandeveloper.models.Otobus;
import com.sercandeveloper.models.Taksi;

public class Main {

	public static void main(String[] args) {
		
		Taksi taksi = new Taksi();
		Otobus otobus = new Otobus();
		Kamyon kamyon = new Kamyon();
		
		Arac arac = new Arac();
		
		//arac.setArac(taksi);
		
		arac.Methodile(otobus);
		
		//arac.Kullan();

	}

}
