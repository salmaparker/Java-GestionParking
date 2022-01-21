/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author dell
 */
public class Place {
     private int id;
	private int numero;
	private String etat;
	private String type;
	private int idsection;
        
        public Place(int id, int numero, String etat, String type, int idsection) {
		super();
		this.id = id;
		this.numero = numero;
		this.etat = etat;
		this.type = type;
		this.idsection = idsection;
	}


	public Place(int numero, String etat, String type, int idsection){
		super();
		this.numero = numero;
		this.etat = etat;
		this.type = type;
		this.idsection = idsection;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String isEtat() {
		return etat;
	}


	public void setEtat(String etat) {
		this.etat = etat;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getidSection() {
		return idsection;
	}


	public void setidSection(int section) {
		this.idsection = section;
	}


	@Override
	public String toString() {
		return "  section=" + idsection;
	}


    
}
