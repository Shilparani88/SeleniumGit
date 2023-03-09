package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shopersstack2 {
	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("https://shoppersstack.com/");
	
	
	WebElement sky = driver.findElement(By.xpath("//div[@class='featuredProducts_cardBody__MDlEh']/descendant::img[@alt='Women Printed Cotton Blend Anarkali Kurta With Attached Dupatta']"));
	sky.click();
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("412412");
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
	
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Check']"))).click();
  //driver.findElement(By.xpath("//button[text()='Check']")).click();
   


	
	
	
	

}
}

