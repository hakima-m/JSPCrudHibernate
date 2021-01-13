
package com.gestion;

import com.crud.DAO;
import com.bean.Voiture;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.Query;


@SuppressWarnings("deprecation")
public class gestionDAO implements DAO {
	
	@Override
	public void ajouter_Voiture(Voiture v) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(v);
		transaction.commit();
		session.close();		
	}
	
	public void modifier_Voiture(int id, String nom, String matricule) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Voiture vr = (Voiture) session.load(Voiture.class, id);
		vr.setNom(nom);
		vr.setMatricule(matricule);
		session.update(vr);
		transaction.commit();
		session.close();			
	}
	
	public void supprimer_Voiture(Voiture v) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();		
		session.delete(v);
        transaction.commit();
		session.close();	

	}
	
	public List<Voiture> AfficherVoitures(){		
		List<Voiture> voitureList = new ArrayList<Voiture>();
		Session session = HibernateUtil.getSessionFactory().openSession();		
		String qr = "FROM Voiture"; //Entity name
		Query<Voiture> query = session.createQuery(qr);
		voitureList = query.list();
		return voitureList;
	}	

}
