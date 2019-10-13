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
	

//	public List<String> getUserByName(String name) {
//		EntityManager em = getEntityManagerFactory().createEntityManager();
//		List<String> user= em.createNamedQuery("User.byName",String.class).getResultList();
//		em.clear();
//		return user;
//	}

//	public String getUserByName(String name) {
//		EntityManager em = getEntityManagerFactory().createEntityManager();
//		String nomDb= em.createNamedQuery("User.byName",String.class).getSingleResult();
//		em.clear();
//		return nomDb;
//	}

	/*********************
	 * OBTENIR LA LISTE DES USER PAR PWD
	 ********************************/
//	public List<User> getUserPassword(String password){
//		return getUserInfo("User.byPassword","password", password.toUpperCase());
//	}
//	
//	private List<User> getUserInfo(String namedQuery,String paramName, String paramValue){
//		EntityManager em = getEntityManagerFactory().createEntityManager();
//		List<User> users = em.createNamedQuery(namedQuery,User.class)
//									.setParameter(paramName, paramValue)
//									.getResultList();
//		em.close();
//		return users;
//	}

	public String getUserPassword(String password) {
		return getUserInfo("User.byPassword", "password", password.toUpperCase());
	}

	private String getUserInfo(String namedQuery, String paramName, String paramValue) {
		EntityManager em = getEntityManagerFactory().createEntityManager();
		List<User> users = em.createNamedQuery(namedQuery, User.class).setParameter(paramName, paramValue)
				.getResultList();
		em.close();
		return users.toString();
	}

	/************************ OBTENIR TOUT LES NOMS ****************************/
	public List<String> getAllNoms() {
		return getListString("Nom.all");
	}

	public List<String> getAllRoles() {
		return getListString("Role.all");
	}
	
	
	private List<String> getListString(String namedQuery) {
		EntityManager em = getEntityManagerFactory().createEntityManager();
		List<String> liste = em.createNamedQuery(namedQuery, String.class).getResultList();
		em.close();
		return liste;
	}

	public EntityManagerFactory getEntityManagerFactory() {
		return emf;
	}

	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}

}
