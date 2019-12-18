package com.senati.sumar;

public class AppSumar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sumar s = new Sumar();
		System.out.println("Suma de enteros : " + s.suma(10, 20));
		System.out.println("Suma de enteros : " + s.suma(10.6, 20.5));
		System.out.println("Suma de enteros : " + s.suma("Juan", "De Dios"));
	}

}
