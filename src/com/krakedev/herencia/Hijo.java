package com.krakedev.herencia;

public class Hijo extends Padre {

	private int juguetes;

	public Hijo(String nombre, int virtudes, int defectos, int juguetes) {
		super(nombre, virtudes, defectos);
		this.juguetes = juguetes;
	}

	@Override
	public void ahorrar(double monto) {
		setTotalAhorrado(getTotalAhorrado()+monto*0.5);
	}

	@Override
	public String toString() {
		return "Nombre: " + getNombre() + " Defectos: " + getDefectos() + " Virtudes: " + getVirtudes() + " Juguetes: " + juguetes;
	}

	public int getJuguetes() {
		return juguetes;
	}

	public void setJuguetes(int juguetes) {
		this.juguetes = juguetes;
	}

}