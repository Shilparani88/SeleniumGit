package testngExecution;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestngClass3 extends BaseTest{
  @Test
  public void search3() {
	  
	  driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
  }
}
