package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Method2iphoneWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();

        String parentHandle = driver.getWindowHandle();
        
		
		Thread.sleep(2000);
		
		Set<String> allHandle = driver.getWindowHandles();
		
		for(String wh:allHandle)
		{
			if(!parentHandle.equals(wh))
			{
				driver.switchTo().window(wh);
				Thread.sleep(2000);
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
			else
			{
				
			}
		}
		
		
	}




	}


