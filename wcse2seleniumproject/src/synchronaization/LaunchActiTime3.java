package synchronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchActiTime3 {
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://desktop-amt822b/login.do");
	
	//explicitly wait
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.titleContains("actiTIME - Login"));
	System.out.println("Login page title is verified!!");
	
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	
	wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
	System.out.println("Homepage title is verified!!");
	
	
	
	
	}
}
