package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDownloadButton {

	public static void main(String[] args) throws InterruptedException, AWTException {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.selenium.dev/downloads/");
		 
		 
		 
		 WebElement download = driver.findElement(By.xpath("//h1[text()='Downloads']"));
		 Actions act= new Actions(driver);
	     Thread.sleep(2000);
		 act.contextClick(download).perform();
		
		 Robot robot = new Robot();
		 for(int i=0;i<10;i++)
			{     
			      Thread.sleep(2000);
			     robot.keyPress(KeyEvent.VK_DOWN);
				
			}
		     
		 Thread.sleep(2000);
		 robot.keyRelease(KeyEvent.VK_DOWN);
		 //robot.keyPress(KeyEvent.VK_UP);
		 //robot.keyRelease(KeyEvent.VK_UP);
		 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
