package assignment;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicates1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/HP/Desktop/Automation%20Data/webElement/MultiselectedDuplicateDropdown.html");
		WebElement dropDownElement = driver.findElement(By.name("menu"));
		Select sel = new Select(dropDownElement);
		
		HashSet<String> hs = new HashSet<String>();
		//get the list of webelement
		List<WebElement> allops = sel.getOptions();
		//read the list &get the text
		for(int i=0;i<allops.size();i++)
		{
			WebElement option = allops.get(i);
			String text = option.getText();
			
			//add the text to set so that duplicate won't be accepted and insertion order is won't be maintained
			hs.add(text);
		}
		
		//read the set
		for(String value:hs)
		{
			System.out.println(value);
		}
		

	}

}
