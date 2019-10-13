package fr.gtm.authentification;

import static org.junit.Assert.*;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.gtm.authentification.dao.LoginDAO;

public class TestLoginDAO {
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
	public void test() {
		LoginDAO dao = new LoginDAO(emf);
		assertNotNull(dao);
	}

	@Test
	public void testGetAllNoms() {
		LoginDAO dao = new LoginDAO(emf);
		assertEquals(4, dao.getAllNoms().size());
	}
	
	@Test
	public void testGetAllRoles() {
		LoginDAO dao = new LoginDAO(emf);
		assertEquals(3, dao.getAllRoles().size());
	}

}
