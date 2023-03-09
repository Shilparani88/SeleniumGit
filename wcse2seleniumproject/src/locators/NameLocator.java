package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/Automation%20Data/webElement/PASSWORDTB.html");
		Thread.sleep(2000);
		
		driver.findElement(By.name("usn")).sendKeys("admin123");
		Thread.sleep(2000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("admin123");
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys("admin@123");
		Thread.sleep(4000);
		driver.findElement(By.tagName("button")).click();
		
		
	}

}
