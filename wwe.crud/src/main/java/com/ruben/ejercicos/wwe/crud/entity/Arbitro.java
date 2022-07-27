package com.ruben.ejercicos.wwe.crud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ARBITRO_TBL")
public class Arbitro {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String name;
    private String apellidos;
	private int edad;
	private boolean camisaRayas;	
	private int combates;
	private boolean comprado;
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isCamisaRayas() {
		return camisaRayas;
	}
	public void setCamisaRayas(boolean camisaRayas) {
		this.camisaRayas = camisaRayas;
	}
	public int getCombates() {
		return combates;
	}
	public void setCombates(int combates) {
		this.combates = combates;
	}
	public boolean isComprado() {
		return comprado;
	}
	public void setComprado(boolean comprado) {
		this.comprado = comprado;
	}
}