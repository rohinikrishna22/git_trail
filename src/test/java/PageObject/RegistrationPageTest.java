package PageObject;

import org.testng.annotations.Test;

public class RegistrationPageTest {

@Test
  public void registerTest() {
   
	  RegistrationPage registration= new  RegistrationPage();
	  registration.register();
	  
	  
  }
}
