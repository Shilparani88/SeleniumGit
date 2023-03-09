package handleDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByValueMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.get("file:///C:/Users/HP/Desktop/Automation%20Data/webElement/dropdown2.html");
		driver.get("file:///C:/Users/HP/Desktop/Automation%20Data/webElement/multiselectDropdown.html");
		WebElement dropDownElement = driver.findElement(By.name("menu"));
		Select sel = new Select(dropDownElement);
		sel.selectByValue("v3");
		Thread.sleep(2000);
		sel.deselectByValue("v3");
		
		
		
	

}}
