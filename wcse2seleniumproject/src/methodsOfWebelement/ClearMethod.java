package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-amt822b/login.do");
		
		WebElement userNameTB = driver.findElement(By.xpath("//input[@name='username']"));
		userNameTB.sendKeys("admin");
		WebElement passWordTB = driver.findElement(By.xpath("//input[@name='pwd']"));
		passWordTB.sendKeys("manager");
		
		Thread.sleep(2000);
		userNameTB.clear();
		Thread.sleep(2000);
		passWordTB.clear();
		
		
		
		//driver.findElement(By.xpath("//button[.=' Login ']")).click();
		


	}

}
