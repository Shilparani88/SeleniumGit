package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login5 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://mpsconline.gov.in/candidate/login");
	
	Thread.sleep(2000);

	
	WebElement  username=driver.findElement(By.id("userName"));
	WebElement password=driver.findElement(By.id("password"));
	
	Thread.sleep(2000);
	
	  username.sendKeys("1234567899");
	password.sendKeys("1234567890");
	



}

}
