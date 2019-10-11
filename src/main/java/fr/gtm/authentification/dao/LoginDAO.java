package fr.gtm.authentification.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import fr.gtm.authentification.entities.User;


public class LoginDAO {
		private EntityManagerFactory emf;
	public LoginDAO(EntityManagerFactory emf) {
		this.emf = emf;
	}
	
	public List<String> getUserByName(String name) {
		EntityManager em = getEmf().createEntityManager();
		List<String> user= em.createNamedQuery("User.byName",String.class).getResultList();
		em.clear();
		return user;
	}
	public User getUserByName(String name) {
		EntityManager em = getEmf().createEntityManager();
		User user= em.createNamedQuery("User.byName",String.class).getSingleResult();
		em.clear();
		return user;
	}
	

	public EntityManagerFactory getEmf() {
		return emf;
	}

	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}

}
