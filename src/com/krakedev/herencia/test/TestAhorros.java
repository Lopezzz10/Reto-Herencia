package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Hijo;
import com.krakedev.herencia.Padre;

public class TestAhorros {

	public static void main(String[] args) {
		Padre padre = new Padre(2,3);
		padre.ahorrar(100);
		System.out.println(padre);
		
		Hija hija = new Hija(3,4);
		hija.ahorrar(100);
		System.out.println("Total ahorrado: "+ hija.getTotalAhorrado());

		Hijo hijo = new Hijo(5,6,7);
		hijo.ahorrar(100);
		System.out.println("Total ahorrado: "+ hijo.getTotalAhorrado());
	}
}
