package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login1 {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.axisdirect.in/");
		WebElement username=driver.findElement(By.id("LoginUserForm_user_name"));
		WebElement password=driver.findElement(By.id("LoginUserForm_password"));
		Thread.sleep(2000);
		username.sendKeys("shilparani");
		password.sendKeys("shilp123");
		
		
		
	}

}
