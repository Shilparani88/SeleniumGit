package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login3 {
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nptellogin.com/");
		
		Thread.sleep(2000);
		
		driver.get("https://swayamopenid.b2clogin.com/swayamopenid.onmicrosoft.com/B2C_1_swayam2/oauth2/v2.0/authorize?response_type=code&client_id=019220f4-2ec0-41c2-a727-529f1b54bb06&redirect_uri=https%3A%2F%2Fswayam.gov.in%2Fwso_ok&scope=https%3A%2F%2Fswayamopenid.onmicrosoft.com%2Fapi%2Fuser_impersonation+offline_access+openid&state=eNb5O5ksdmHZzvZFv7Nz06erVI7oUr&access_type=authorization_code");
		WebElement  username=driver.findElement(By.id("logonIdentifier"));
		WebElement password=driver.findElement(By.id("password"));
		
		Thread.sleep(2000);
		
		  username.sendKeys("shilpa");
		password.sendKeys("1234567890");
		
	}

}
