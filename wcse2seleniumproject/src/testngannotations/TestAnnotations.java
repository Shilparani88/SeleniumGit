package testngannotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestAnnotations {
	@BeforeTest
	  public void beforeTest() {
		  Reporter.log("BeforeTest",true);
	}	 
	
	@BeforeMethod
	  public void beforeMethod() {
		  Reporter.log("BeforeMethod",true);
	 }
	 
	 
	 
	
	
 
  

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("AfterMethod",true);
  }
  

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("Beforeclass",true);
	  
  }
  
  
  @Test
  public void g() {
	  Reporter.log("second test",true);
	  	  
  }
  
  
  @Test
  public void h() {
  Reporter.log("Third test",true);
  }

  
  @AfterClass
  public void afterClass() {
	  Reporter.log("AfterClass",true);
  }
  

 


  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("BeforeSuit",true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("AfterSuite",true);
  }
  
  @Test
  public void f() {
	  Reporter.log("first test",true);
  }
  
  @AfterTest
  public void afterTest() {
	  Reporter.log("AfterTest",true);
  }


}
