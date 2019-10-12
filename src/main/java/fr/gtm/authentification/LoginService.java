package fr.gtm.authentification;

import java.util.Scanner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.gtm.authentification.dao.LoginDAO;



public class LoginService {
	public static void main(String[] args) {
//		dao.getAllNoms().forEach(System.out::println);
		
		System.out.println("Login?");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
//		String name = "gaston";
		
		System.out.println("pwd?");
		String pw = sc.nextLine();
//		String pw = "gastonpw";
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("authentification");
		LoginDAO dao = new LoginDAO(emf);
		

//		dao.getUserByName(name).forEach(System.out::println);
//		System.out.println(dao.getUserByName(name));
		
		
		if (dao.getUserPassword(pw).contains(name)) {//On vérifie qu'il y bien un pw correspondant au nom.
			System.out.println(name+" est maintenant connecté.");
		} else {
			System.out.println(" Login ou pwd incorrect.");
		}
		
		emf.close();
		
	}

}
