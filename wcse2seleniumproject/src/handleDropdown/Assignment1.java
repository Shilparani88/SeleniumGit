package handleDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://omayo.blogspot.com/");
		
		
		WebElement multiSelected = driver.findElement(By.id("multiselect1"));
		Select select1=new Select(multiSelected);
		
		//without using selection method select the option from dropdown
		List<WebElement> allops =select1.getOptions();
		for(WebElement options:allops )
		{
			if(options.getText().equals("Audi"));
			{
				options.click();
				break;
			}
		}
		
		

	}

}
