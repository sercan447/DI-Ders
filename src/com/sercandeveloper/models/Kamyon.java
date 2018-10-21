package com.sercandeveloper.models;

public class Kamyon implements IArac {

	public Kamyon() {
		
	}
	

	@Override
	public void Gaz() {
		System.out.println(" KAMYON GAZA BASILIYOR.");
	}
	
	@Override
	public void Fren() {
		System.out.println(" KAMYON FRENE BASILIYOR.");
	}
	
	 @Override
	public void Vites() {
		System.out.println(" KAMYON VITES ATILIYOR..");
	}
	

}
