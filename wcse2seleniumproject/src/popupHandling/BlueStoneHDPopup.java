package popupHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BlueStoneHDPopup {

	

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.bluestone.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[.='Allow']")).click();
	Thread.sleep(3000);
	
	//switch the control
	WebElement iframe = driver.findElement(By.id("fc_widget"));
	Thread.sleep(2000);
	WebElement chatbox=driver.findElement(By.xpath("//div[@id='chat-icon']"));
	chatbox.click();
	driver.switchTo().parentFrame();
	
	driver.findElement(By.xpath("//input[@id='chat-fc-name']")).sendKeys("panda");
	driver.findElement(By.xpath("//input[@id='chat-fc-email']")).sendKeys("panda@gmail.com");
	driver.findElement(By.xpath("//input[@id='chat-fc-phone']")).sendKeys("9876543210");
	driver.findElement(By.xpath("//span[.='X']")).sendKeys(args);
	
	driver.close();
	
	
	//driver.switchTo().frame(iframe);
	//WebElement iframeElement = driver.findElement(By.id("chat-icon"));
	//iframeElement.click();
	
	//Thread.sleep(2000);
	//driver.switchTo().defaultContent();
	//WebElement iframe1 = driver.findElement(By.id("fc_widget"));
	//driver.switchTo().frame(3);
	//driver.findElement(By.xpath("//span[.='X']")).click();
	
	
	
	
	

	}

}
