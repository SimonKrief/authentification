package fr.gtm.authentification;

import static org.junit.Assert.*;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.gtm.authentification.dao.LoginDAO;

public class TestLoginService extends LoginService {
	private static EntityManagerFactory emf = null;

	@BeforeClass
	public static void before() {
		emf = Persistence.createEntityManagerFactory("authentification");
	}

	@AfterClass
	public static void after() {
		emf.close();
	}

	@Test
	public void testLogin() {
		String name = "gaston";
		String pw = "gastonpw";

		LoginDAO dao = new LoginDAO(emf);
		assertTrue(dao.getUserPassword(pw).contains(name));
	}

}
