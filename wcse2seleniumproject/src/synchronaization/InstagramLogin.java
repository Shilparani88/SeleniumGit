package synchronaization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		//Thread.sleep(2000); //use for avoid synchronization
		
		driver.findElement(By.name("username")).sendKeys("user");
		driver.findElement(By.name("password")).sendKeys("pass@123");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		
		

	}

}
