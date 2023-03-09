package webdeiverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/HP/Desktop/Automation%20Data/webElement/RadioButton.html");
		
		WebElement RadioButton = driver.findElement(By.name("n4"));
		System.out.println(RadioButton);;
		RadioButton.click();
		Thread.sleep(2000);
		RadioButton.click();
		
		driver.navigate().to("http://desktop-amt822b/login.do");
		driver.manage().window().maximize();
		WebElement usn = driver.findElement(By.name("username"));
		usn.sendKeys("admin");
		
		WebElement pass = driver.findElement(By.name("pwd"));
		pass.sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		
		
		

		
	}

}
