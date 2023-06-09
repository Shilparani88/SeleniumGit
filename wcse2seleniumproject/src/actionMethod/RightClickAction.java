package actionMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/downloads/");
		
		WebElement target = driver.findElement(By.xpath("//h1[.='Downloads']"));
		Actions act = new Actions(driver);
		//to perform right click
		act.contextClick(target).perform();
		for(int i=0;i<3;i++)
		{
			act.clickAndHold(target).perform();
		}
		

	}

}
