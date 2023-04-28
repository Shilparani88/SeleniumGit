package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupExecution {
	
  @Test(groups = "FUNCTIONAL")
  public void ftc1() {
	  Reporter.log("FTC1 is executed!!",true);
  }
  
  @Test(groups = "SMOKE")
  public void stc1()
  {
	  Reporter.log("STC1 is executed!!",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void itc1()
  {
	  Reporter.log("ITC1 is executed!!",true);
  }
  
  //-------------------------------------------------------------
  @Test(groups = "FUNCTIONAL")
  public void ftc2() {
	  Reporter.log("FTC2 is executed!!",true);
  }
  
  @Test(groups = "SMOKE")
  public void stc2()
  {
	  Reporter.log("STC2 is executed!!",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void itc2()
  {
	  Reporter.log("ITC2 is executed!!",true);
  }
  
  //----------------------------------------------------------------------
  @Test(groups = "FUNCTIONAL")
  public void ftc3() {
	  Reporter.log("FTC3 is executed!!",true);
  }
  
  @Test(groups = "SMOKE")
  public void stc3()
  {
	  Reporter.log("STC3 is executed!!",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void itc3()
  {
	  Reporter.log("ITC3 is executed!!",true);
  }
  //----------------------------------------------------------------------------
  @Test(groups = "FUNCTIONAL")
  public void ftc4() {
	  Reporter.log("FTC4 is executed!!",true);
  }
  
  @Test(groups = "SMOKE")
  public void stc4()
  {
	  Reporter.log("STC4 is executed!!",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void itc4()
  {
	  Reporter.log("ITC4 is executed!!",true);
  }
  
  //-----------------------------------------------------------------------------------
  @Test(groups = "FUNCTIONAL")
  public void ftc5() {
	  Reporter.log("FTC5 is executed!!",true);
  }
  
  @Test(groups = "SMOKE")
  public void stc5()
  {
	  Reporter.log("STC5 is executed!!",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void itc5()
  {
	  Reporter.log("ITC5 is executed!!",true);
  }
  //-----------------------------------------------------------------------------------------
  
  @Test(groups = "FUNCTIONAL")
  public void ftc6() {
	  Reporter.log("FTC6 is executed!!",true);
  }
  
  @Test(groups = "SMOKE")
  public void stc6()
  {
	  Reporter.log("STC6 is executed!!",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void itc6()
  {
	  Reporter.log("ITC6 is executed!!",true);
  }
}


