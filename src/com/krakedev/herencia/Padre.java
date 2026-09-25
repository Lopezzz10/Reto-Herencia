package com.krakedev.herencia;

public class Padre {
	private int defectos;
	private int virtudes;
	private double totalAhorrado;
	private String nombre;
	
//	@Override
//	public String toString() {
//		return "Padre [defectos=" + defectos + ", virtudes=" + virtudes + "]";
//	}
	
//	public Padre () {
//		System.out.println("Soy el constructor vacio del padre");
//	}
	
	public Padre(String nombre, int virtudes, int defectos) {
		this.nombre = nombre;
		this.defectos = defectos;
		this.virtudes =  virtudes;
	}
	
	public int getDefectos() {
		return defectos;
	}
	public void setDefectos(int defectos) {
		this.defectos = defectos;
	}
	public int getVirtudes() {
		return virtudes;
	}
	public void setVirtudes(int virtudes) {
		this.virtudes = virtudes;
	}
	public double getTotalAhorrado() {
		return totalAhorrado;
	}
	public void setTotalAhorrado(double totalAhorrado) {
		this.totalAhorrado = totalAhorrado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void imprimir() {
		System.out.println("virtudes:"+ virtudes);
		System.out.println("defectos:"+ defectos);
	}
	public void guardarSecreto() {
		System.out.println("Esto no se hereda");
	}
	
	@Override //Ayuda a revisar que el metodo esta bien al momento de sobreescribir
	public String toString() {
		return "Nombre: " + nombre + " Defectos: " + defectos + " Virtudes: " + virtudes + " TotalAhorrado: " + totalAhorrado;
	}
	
	public void ahorrar(double monto) {
		totalAhorrado += monto;
	}
}