package com.krakedev.herencia;

public class Hija extends Padre {
	
	public Hija(String nombre, int virtudes, int defectos) {
		super(nombre, virtudes, defectos);
	}
	
	public void escucharBadBunny() {
		System.out.println("Escuchando esta musica horrible");
	}

	@Override
	public String toString() {
		return "Nombre: " + getNombre() + " Defectos: "+ getDefectos()+" Virtudes:  "+ getVirtudes();
	}
	
}