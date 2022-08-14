package training.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsserts {

	@Test
	public void softAssert() {
		String firstName = "Saurabh";
		String lastName = "Patel";
		String email = "s.a.patel@gmail.com";
		String password = "sau123";
		int moNumber = 9737;
		
		SoftAssert sf = new SoftAssert();
		
		sf.assertEquals("Mohit", firstName);
		sf.assertEquals("Patel", lastName);
		sf.assertEquals("s.a.patel@gmail.com", email);
		sf.assertEquals("sau123", password);
		sf.assertEquals(9898, moNumber);
		sf.assertAll();
	}
}
