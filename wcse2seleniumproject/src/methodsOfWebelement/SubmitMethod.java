package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {
//if web element is having('type=submit' & tag name =Button )at that time only we can use 
	public static void main(String[] args) {
		System.setProperty("webdriver.chromrdriver", "./drivers/chromdriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.submit();

	}

}
