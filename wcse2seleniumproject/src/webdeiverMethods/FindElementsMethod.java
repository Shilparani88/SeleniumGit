package webdeiverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.google.co.in/");
		
		driver.switchTo().activeElement().sendKeys("iphone");
		
		Thread.sleep(2000);
		
	List<WebElement> options = driver.findElements(By.xpath("//div[contains(@class,'pcTkSc')]"));
	
	for(WebElement opt: options)
	{
		String iphones = opt.getText();
		System.out.println(iphones);
		Thread.sleep(2000);
	}
	


	}

}
