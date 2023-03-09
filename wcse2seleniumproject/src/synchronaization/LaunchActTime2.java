package synchronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchActTime2 {
public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-amt822b/login.do");
		String LoginPageActualTitle = driver.getTitle();
		
		if(LoginPageActualTitle.equals("actiTIME - Login"))
		{
			System.out.println("Test is passed Login page verified!!");
		}
		else
		{
			System.out.println("Test is failed login page not verified!!");
		}
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		
		String HomePageActualTitle = driver.getTitle();
		if(HomePageActualTitle.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("Test is passed Homepage verified!!");
		}
		else
		{
			System.out.println("Test is failed Homepage not verified!!");
		}
		
		
	}




}
