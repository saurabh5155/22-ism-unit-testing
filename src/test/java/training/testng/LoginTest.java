package training.testng;


import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void login() {
	Boolean	isBoolean = true;
	String logedInMassage = "Log In";
	
	Assert.assertTrue(isBoolean, "Login Fail");

	Assert.assertEquals("Log In", logedInMassage);
	}
}
