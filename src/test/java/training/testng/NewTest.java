package training.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class NewTest {
  @Test
  public void firstTest() {
	  System.out.println("Run.... First Test -> firstTest()");
  }
  
  @Test
  public void secondTest() {
	  System.out.println("Run.... Second Test -> secondTest()");
  }
  
  @Test
  public void thirdTest() {
	  System.out.println("Run.... Third Test -> thirdTest()");
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Run.... Before Method ->beforeMethod()");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Run..... After Method ->afterMethod()");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Run..... Before Class ->beforeClass()");
  }
  
  @AfterClass
  public void afterClass() {
	  System.out.println("Run..... After Class ->afterClass()");
  }

}
