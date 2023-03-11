package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandledDisabledWebElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/HP/Desktop/Automation%20Data/webElement/TEXTBOXdisable.html");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		
		 Thread.sleep(2000);
		jse.executeScript("document.getElementById('i1').value='shilparani' ");
		

	}
}


