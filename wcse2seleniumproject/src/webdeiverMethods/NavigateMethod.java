package webdeiverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
         WebDriver driver =new ChromeDriver();
  		driver.manage().window().maximize();
  		Thread.sleep(2000);
  		driver.navigate().to("https://www.google.com");
  		Thread.sleep(2000);
  		driver.navigate().back();
  		Thread.sleep(2000);
  		driver.navigate().forward();
  		Thread.sleep(2000);
  		driver.navigate().refresh();
  		
  		
         
	}

}
