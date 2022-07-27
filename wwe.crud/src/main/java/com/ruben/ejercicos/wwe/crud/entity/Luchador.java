package com.ruben.ejercicos.wwe.crud.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LUCHADOR_TBL")
public class Luchador {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String name;
	private String apellidos;
	private String apodo;
	private int edad;
	private String remate;
	private boolean campeon;	
	private int peleasGanadas;
	private int mainEventWrestleMania;
	private int media; 
	
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
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getRemate() {
		return remate;
	}
	public void setRemate(String remate) {
		this.remate = remate;
	}
	public boolean isCampeon() {
		return campeon;
	}
	public void setCampeon(boolean campeon) {
		this.campeon = campeon;
	}
	public int getPeleasGanadas() {
		return peleasGanadas;
	}
	public void setPeleasGanadas(int peleasGanadas) {
		this.peleasGanadas = peleasGanadas;
	}
	public int getMainEventWrestleMania() {
		return mainEventWrestleMania;
	}
	public void setMainEventWrestleMania(int mainEventWrestleMania) {
		this.mainEventWrestleMania = mainEventWrestleMania;
	}
	public int getMedia() {
		return media;
	}
	public void setMedia(int media) {
		this.media = media;
	}
}