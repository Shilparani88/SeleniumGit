package javaScriptExecutor;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddArgumentMethodForExceptionHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//using when io exception( connection Failed Exception in chrome driver)
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		Thread.sleep(2000);
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.co.in/");
		

	}

}
