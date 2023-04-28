package testngannotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;

public class GoogleLaunchTest extends BaseTest {
  @Test
  public void googletest() {
	  
	  driver.switchTo().activeElement().sendKeys("japan",Keys.ENTER);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver.switchTo().activeElement().sendKeys("India",Keys.ENTER);
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.switchTo().activeElement().sendKeys("Australia",Keys.ENTER);
  }

}
