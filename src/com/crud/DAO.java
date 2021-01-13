package com.crud;


import java.util.List;
import com.bean.Voiture;


public interface DAO {
	
	public void ajouter_Voiture(Voiture v);
	public void modifier_Voiture(int id, String nom, String matricule);
	public void supprimer_Voiture(Voiture v);
	public List<Voiture> AfficherVoitures();

}
