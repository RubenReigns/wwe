package com.ruben.ejercicos.wwe.crud.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "COMBATE_TBL")
public class Combate {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	private String name;
	@ManyToOne(targetEntity=Luchador.class,fetch=FetchType.EAGER)
	private Luchador luchador1;
	@ManyToOne(targetEntity=Luchador.class, fetch=FetchType.EAGER)
	private Luchador luchador2;
	@ManyToOne(targetEntity=Arbitro.class,  fetch=FetchType.EAGER)
	private Arbitro arbitro;	
	
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
	public Luchador getLuchador1() {
		return luchador1;
	}
	public void setLuchador1(Luchador luchador1) {
		this.luchador1 = luchador1;
	}
	public Luchador getLuchador2() {
		return luchador2;
	}
	public void setLuchador2(Luchador luchador2) {
		this.luchador2 = luchador2;
	}
	public Arbitro getArbitro() {
		return arbitro;
	}
	public void setArbitro(Arbitro arbitro) {
		this.arbitro = arbitro;
	}
}
