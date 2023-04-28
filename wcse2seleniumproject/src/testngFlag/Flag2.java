package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
  @Test(description = "This is use to search for database!!")
  public void search1() {
	  
	  Reporter.log("SQL search",true);
  }
}
