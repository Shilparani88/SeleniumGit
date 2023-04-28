package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
  @Test(testName = "user should able to create an account")
  public void createAccount() {
	  
	  Reporter.log("Account Created Successfully!!",true);
  }
}
