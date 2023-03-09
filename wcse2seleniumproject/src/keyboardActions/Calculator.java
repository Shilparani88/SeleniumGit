package keyboardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.mathway.com/BasicMath");
		
		//access method of keyboard create object of robot class
		Robot robot = new Robot();
		
		//choose cylinder option
		driver.findElement(By.xpath("//input[@value='Accept']")).click();
		
		driver.findElement(By.xpath("//div[@id='editor-tester_frame']")).click();
		
		driver.findElement(By.xpath("//div[@data-id='cylinder' and(@data-popup='1')]")).click();
		
		//enter first number
		robot.keyPress(KeyEvent.VK_9);
		robot.keyRelease(KeyEvent.VK_9);
		
		//enter downkey for type second number
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		//enter second number
		robot.keyPress(KeyEvent.VK_5);
		robot.keyRelease(KeyEvent.VK_5);
		
		//press enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//choose option present within popup
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		//press enter for final result
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
	}

}
