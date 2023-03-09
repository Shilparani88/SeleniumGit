package handleDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://omayo.blogspot.com/");
		
		//WebElement multiSelected = driver.findElement(By.id("multiselect1"));
		//Select select=new Select(multiSelected);
		//select.selectByVisibleText("Volvo");
		//select.selectByVisibleText("Hyundai");
		//select.selectByVisibleText("Audi");
		
		//List<WebElement> selectedOptions = select.getAllSelectedOptions();
		
		//for(WebElement selectedOption:selectedOptions )
		//{
			//System.out.println(selectedOption.getText());
		//}
		
		
		
		
		//2nd method
		WebElement multiSelected = driver.findElement(By.id("multiselect1"));
		Select select= new Select(multiSelected);
		for(int i=0;i<4;i++)
		  {
		  select.selectByIndex(i);
		  }
		  List<WebElement> selectedOptions1 = select.getAllSelectedOptions();
		  for(WebElement selectedOption:selectedOptions1 )
		  {
		  String options=selectedOption.getText();
		  System.out.println(options);
		  }
		 
		
			
		
	}
}

