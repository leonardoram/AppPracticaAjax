package com.model;

public class Numeros {
	
	private double Suma;
	private double Numero1;
	private double Numero2;
	
	public void setNumero1(double numero1) {
		Numero1 = numero1;
	}

	public void setNumero2(double numero2) {
		Numero2 = numero2;
	}
	
	public void setSuma(double Suma) {
		
		this.Suma= Suma;
	}

	public double getSuma() {
		
		Suma=Numero1+Numero2;
		return Suma;
	}
	
	
}
