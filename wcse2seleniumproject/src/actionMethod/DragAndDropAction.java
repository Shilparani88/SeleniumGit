package actionMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement src = driver.findElement(By.xpath("//a[.=' BANK ']"));
		WebElement target = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::div[@id='shoppingCart1']"));
		
        Actions act = new Actions(driver);
        act.dragAndDrop(src, target).perform();
        
        
	}

}
