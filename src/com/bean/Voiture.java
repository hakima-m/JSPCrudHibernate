package com.bean;

import java.io.Serializable;
import javax.persistence.Entity;
/*permet de connecter cette classe voiture
� une instance dans la BD qui s'appelle voiture
*/
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity /*pour d�finir l'entit�*/

public class Voiture implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)/*pour dire que l'id est une variable qui va etre g�n�rer*/
	
	
	int id;
	String nom;
	String matricule;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	
	
}
