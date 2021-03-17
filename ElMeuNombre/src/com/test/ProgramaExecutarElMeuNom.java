package com.test;

public class ProgramaExecutarElMeuNom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElMeuNom nombre1 = new ElMeuNom (5);
		ElMeuNom nombre2 = new ElMeuNom (8);
		
		System.out.println("El nombre1 = " + nombre1.getNombre());
		System.out.println("El nombre2 = " + nombre2.getNombre());
		System.out.println("El nombre1 + nombre2 = " + nombre1.suma(nombre2).getNombre());
		System.out.println("El nombre1 - nombre2 = " + nombre1.resta(nombre2).getNombre());
		System.out.println("El nombre1 * nombre2 = " + nombre1.multi(nombre2).getNombre());
		System.out.println("El nombre1 / nombre2 = " + nombre1.divi(nombre2).getNombre());

	}

}
