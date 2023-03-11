package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollRight {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//scrollright
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(500,0)");
		
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(500,0)");
		
		
		//scrollUp
	//Thread.sleep(2000);
		//jse.executeScript("window.scrollBy(0,-500)");

	}
}
