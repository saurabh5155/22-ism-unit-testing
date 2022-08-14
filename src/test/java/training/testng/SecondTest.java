package training.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SecondTest {
//	Alfabatically execution 
	@Test
	  public void testOne() {
		  System.out.println("Run.... First Test -> testOne()");
	  }
	  
	  @Test
	  public void testTwo() {
		  System.out.println("Run.... Second Test -> testTwo()");
	  }
	  
	  @Test
	  public void thirdThree() {
		  System.out.println("Run.... Third Test -> thirdThree()");
		  
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("Run.... Before Method ->beforeMethod()");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("Run..... After Method ->afterMethod()");
	  }
	  
}
