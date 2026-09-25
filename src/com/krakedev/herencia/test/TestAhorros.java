package com.krakedev.herencia.test;

import com.krakedev.herencia.Padre;
import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Hijo;

public class TestAhorros {

	public static void main(String[] args) {

		Padre padre = new Padre("Carlos", 2, 3);
		padre.ahorrar(100);
		System.out.println(padre);

		Hija hija = new Hija("Maria", 3, 4);
		hija.ahorrar(100);
		System.out.println("Total ahorrado de la hija: "+ hija.getTotalAhorrado());

		Hijo hijo = new Hijo("Juan", 5, 6, 7);
		hijo.ahorrar(100);
		System.out.println("Total ahorrado del hijo: "+ hijo.getTotalAhorrado());

	}

}