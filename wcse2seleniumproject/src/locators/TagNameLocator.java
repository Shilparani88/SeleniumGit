package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/Automation%20Data/webElement/USERNAMETB.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("admin");
		
		driver.get("file:///C:/Users/HP/Desktop/Automation%20Data/webElement/PASSWORDTB.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.tagName("input")).sendKeys("Admin");
		
		
	}

}
