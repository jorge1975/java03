package com.senati.sumar;

public class Sumar {

	public int suma (int a, int b) {
		return a+b;
	}
	public double suma(double a, double b) {
		return a + b;
	}
	public String suma(String a, String b) {
		return a + " " + b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sumar s = new Sumar();
		System.out.println("Suma de enteros : " + s.suma(10, 20));
		System.out.println("Suma de enteros : " + s.suma(10.6, 20.5));
		System.out.println("Suma de enteros : " + s.suma("Juan", "De Dios"));
	}

}
