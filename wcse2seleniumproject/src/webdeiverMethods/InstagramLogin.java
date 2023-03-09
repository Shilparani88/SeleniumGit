package webdeiverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/login/?source=auth_switcher");
		Thread.sleep(2000);  //for synchronization we provide delay 25 sec for automation script
		driver.findElement(By.name("username")).sendKeys("User");
		driver.findElement(By.name("password")).sendKeys("User@123");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		
	}

}
