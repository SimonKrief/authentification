package fr.gtm.authentification;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestLoginDAO.class, TestLoginService.class })
public class AllTests {

}
