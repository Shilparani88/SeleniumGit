package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppersstackDelivery {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://shoppersstack.com/");
		
		
	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		 wait.until(ExpectedConditions.elementToBeClickable(By.name("electronics"))).click();
		 
	    //driver.findElement(By.xpath("//a[@id='electronics']")).click();
		
		 driver.findElement(By.xpath("//div[@class='featuredProducts_cardBody__l4gLE']/descendant::img[@alt='APPLE 2021 Macbook Pro M1 Max']")).click();
		 driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("412412");
		 driver.findElement(By.xpath("//button[@name='Check']")).click();

	}

}
