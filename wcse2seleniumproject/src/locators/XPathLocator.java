package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocator {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nike.com/sg/member/profile/login?continueUrl=https://www.nike.com/sg/?cp=76060516106_aff_qKqcOVHts48&ranMID=41134&ranEAID=qKqcOVHts48&ranSiteID=qKqcOVHts48-tL2Tphxa.yPxWDzSY3bBoQ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[placeholder='Email address']")).sendKeys("shilpa@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[placeholder='Password']")).sendKeys("pass123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[value='SIGN IN']")).click();
	}

}
