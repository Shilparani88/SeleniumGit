package testNG;


import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
	
		  @Test
		  public void arithmaticOperation() {
			  
			  int a=6;
			  int b=0;
			  int res=a/b;	  
			  Reporter.log("methoid name is arithmaticOperation"+res,true);
		  }
		  
		  @Test
		  public void ao2()
		  {
			  Reporter.log("method name is ao2",true);
		  }
		  @Test
		  public void ao3()
		  {
			  Reporter.log("method name is ao3",true);
		  }

}
