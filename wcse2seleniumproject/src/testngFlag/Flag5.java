package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
	
  @Test(invocationCount = 10)
  public void ftc() {
	  Reporter.log("FTC is executing!!",true);
  }
}
