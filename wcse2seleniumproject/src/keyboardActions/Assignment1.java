package keyboardActions;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.selenium.dev/");
		 
		
		 		
				WebElement target = driver.findElement(By.xpath("//h4[@class='h3 mb-3 selenium-ide' and (text()='Selenium IDE')]"));
				Actions act= new Actions(driver);
				Thread.sleep(2000);
				
				for(int i=0;i<3;i++)
				{
					act.clickAndHold(target).perform();
				}
				
				Robot robot= new Robot();
				driver.findElement(By.xpath("//span[text()='Search']")).click();
				Thread.sleep(2000);
				
				
				WebElement sb = driver.findElement(By.xpath("//input[@id='docsearch-input']"));
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_C);
				
				Thread.sleep(2000);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyRelease(KeyEvent.VK_C);
				
				Thread.sleep(2000);
				sb.clear();
				sb.click();
				
				
				Thread.sleep(2000);
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyRelease(KeyEvent.VK_V);
				
			    Thread.sleep(2000);
			    robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				
				
				
				
				
				
				
				

	}

	
}
