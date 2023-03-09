package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromrdriver", "./drivers/chromdriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/downloads/");
		//using index
		WebElement js = driver.findElement(By.xpath("(//div[contains(@class,'card-header bg-transparent border-0 text-center py-0')]) [5]"));
		System.out.println(js.getCssValue("color"));
					
				
				
				
				
				
				
				

	}

}
