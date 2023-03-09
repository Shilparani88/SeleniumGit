package actionMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		WebElement target = driver.findElement(By.xpath("//a[contains(text(),'Watch Jewellery ')]"));
		
		//to perform Mouse action create object of action class
		Actions act = new Actions(driver);
		
		//To perform mouse action using only perform method
		act.moveToElement(target).perform();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[contains(text(),'Band')]")).click();
		 
		//To perform mouse action using build and perform method
		 //act.moveToElement(target).build().perform();
			//Thread.sleep(2000);
			 //driver.findElement(By.xpath("//a[contains(text(),'Band')]")).click();
			
		

	}

}
