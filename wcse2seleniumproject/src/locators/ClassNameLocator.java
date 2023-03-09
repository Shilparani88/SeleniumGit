package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	driver.findElement(By.name("q")).sendKeys("ross geller",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.className("lNPNe")).click();
	Thread.sleep(2000);
	
	driver.get("https://www.google.co.in/");
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("joey tribbiani",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.className("lNPNe")).click();
	Thread.sleep(2000);
	
	
	driver.get("https://www.google.co.in/");
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("Chandler Bing",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.className("lNPNe")).click();
	Thread.sleep(2000);
	
	driver.get("https://www.google.co.in/");
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("Monica Geller",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.className("lNPNe")).click();
	Thread.sleep(2000);
	
	driver.get("https://www.google.co.in/");
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("Phoebe Buffay",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.className("lNPNe")).click();
	Thread.sleep(2000);
	driver.quit();
	
	
	
	
	
	
}
}
