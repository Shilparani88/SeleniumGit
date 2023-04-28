package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
  @Test(priority = 1)
  public void login() {
	  Reporter.log("Logged in!!",true);
  }
  
  @Test(priority = 2)
  public void createUser()
  {
	  Reporter.log("User Created!!",true);
  }
  
  @Test(priority = 3)
  public void logOut()
  {
	  Reporter.log("Logged out!",true);
  }
}
