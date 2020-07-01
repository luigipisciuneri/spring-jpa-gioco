package it.dstech.formazione.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NegozioGiochi {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String titolo;
	private String classificazione_PEGI;
	private Double prezzo;
	@Enumerated(EnumType.STRING)
	private Categoria categoria;
	
	
	public NegozioGiochi() {
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getClassificazione_PEGI() {
		return classificazione_PEGI;
	}
	public void setClassificazione_PEGI(String classificazione_PEGI) {
		this.classificazione_PEGI = classificazione_PEGI;
	}
	public Double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	

}
