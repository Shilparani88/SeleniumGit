package handleDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://omayo.blogspot.com/");
		
		WebElement singleSelected = driver.findElement(By.id("drop1"));
		Select select=new Select(singleSelected);
		System.out.println(select.isMultiple());
		
		WebElement multiSelected = driver.findElement(By.id("multiselect1"));
		Select select1=new Select(multiSelected);
		System.out.println(select1.isMultiple());
		
	}

}
