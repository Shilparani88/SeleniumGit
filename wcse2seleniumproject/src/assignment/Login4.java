package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login4 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.icicidirect.com/customer/login");
		
		Thread.sleep(2000);
		
		
		WebElement  username=driver.findElement(By.id("txtu"));
		WebElement password=driver.findElement(By.id("txtp"));
		
		Thread.sleep(2000);
		
		  username.sendKeys("shilpa");
		password.sendKeys("1234567890");
		
	

	}

}
