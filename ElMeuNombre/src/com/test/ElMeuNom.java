package com.test;

public class ElMeuNom {
	private int nombre;
	public ElMeuNom (int nombreRebut) {

		this.nombre = nombreRebut;

	}
	public int getNombre() {
		return nombre;
	}
	public ElMeuNom suma(ElMeuNom unAltre) {
		return new ElMeuNom(this.nombre + unAltre.nombre);
	}
	public ElMeuNom resta(ElMeuNom unAltre) {
		return new ElMeuNom(this.nombre - unAltre.nombre);
	}
	public ElMeuNom multi(ElMeuNom unAltre) {
		return new ElMeuNom(this.nombre * unAltre.nombre);
	}
	public ElMeuNom divi(ElMeuNom unAltre) {
		return new ElMeuNom(this.nombre / unAltre.nombre);
	}

}
