package training.testng;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void login() {
	Boolean	isBoolean = false;
	String logedInMassage = "Log In";
	
	Assert.assertTrue(isBoolean, "Login Fail");

	Assert.assertEquals("Log In", logedInMassage);
	}
}
