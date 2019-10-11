package fr.gtm.authentification;

import java.util.Scanner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.gtm.authentification.dao.LoginDAO;



public class LoginService {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String name = sc.nextLine();
		String name = "gaston";
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("authentification");
		LoginDAO dao = new LoginDAO(emf);
		

		
		dao.getUserByName(name).forEach(System.out::println);
		
		emf.close();
		
	}

}
