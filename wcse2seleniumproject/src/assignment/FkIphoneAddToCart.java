package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FkIphoneAddToCart {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(co);
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		
	    driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		//new child window
		driver.findElement(By.xpath("//div[.='APPLE iPhone 14 (Starlight, 128 GB)']")).click();
		
		//get handles of the window
		String mainWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> iterator = allWindowHandles.iterator();
		
		//here we check
		while (iterator.hasNext()) {
			String FkIphoneAddToCart = iterator.next();
			if(!mainWindowHandle.equalsIgnoreCase(FkIphoneAddToCart)) {
				driver.switchTo().window(FkIphoneAddToCart);
				driver.findElement(By.xpath("//div[@class='_2C41yO']/ancestor::li [@id='swatch-1-color']")).click();
				Thread.sleep(2000);
			    driver.findElement(By.id("pincodeInputId")).sendKeys("412105");
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("//div[.='Remove']")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ']")).click();
				
				
			}
		}
		Thread.sleep(2000);
		
		
		//driver.findElement(By.xpath("//div[@class='_2C41yO']/ancestor::li [@id='swatch-1-color']")).click();
		//Thread.sleep(2000);
	    //driver.findElement(By.id("pincodeInputId")).sendKeys("416002");
		//Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("pincodeInputId")).sendKeys("416002");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
//		
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
//		
//		driver.findElement(By.xpath("//div[.='Remove']")).click();
//		
//		driver.findElement(By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ']")).click();
		
		
	}

}
