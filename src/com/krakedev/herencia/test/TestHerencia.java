package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;

public class TestHerencia {

	public static void main(String[] args) {
		Hija hija = new Hija("Maria", 5, 2);
		hija.setVirtudes(5);
		hija.setDefectos(2);
		hija.imprimir();
	}
}