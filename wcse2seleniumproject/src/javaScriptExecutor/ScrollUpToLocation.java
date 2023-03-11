package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollUpToLocation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://en.wikipedia.org/wiki/Kashmir");
		WebElement download = driver.findElement(By.xpath("//div[@class='thumb']/descendant::div[@style='margin:44.5px auto;']"));
		Point Loc = download.getLocation();
		int xaxis = Loc.getX();
		int yaxis = Loc.getY();
		System.out.println(xaxis+" "+yaxis);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//scrolldown
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,7189)");
		
		//scrollup
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-7189)");

}
}
