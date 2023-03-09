package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shine.com/registration/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'id_name')]")).sendKeys("Rutuja");;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'id_email')]")).sendKeys("rutu@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'id_cell_phone')]")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'cls_animation')]")).sendKeys("pass234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@id,'registerButton')] ")).click();
		Thread.sleep(2000);


	}

}
