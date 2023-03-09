package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxExtension {

	public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    Robot robot = new Robot();
    
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_L);
    robot.keyRelease(KeyEvent.VK_L);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_UP);
	robot.keyRelease(KeyEvent.VK_UP);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(2000);
	driver.findElement(By.id("preferences-body")).sendKeys("Extensions");
	
	driver.findElement(By.id("addonsButton")).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//button[@class='category' and (@title='Extensions')]")).click();
	
    driver.findElement(By.xpath("//button[@name='extension']")).click();
	
	
	
	
	
    
	}

}
