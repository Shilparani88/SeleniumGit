package actionMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-amt822b/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Settings']/following-sibling::img")).click();
		 WebElement target = driver.findElement(By.partialLinkText("Logo & Color Scheme"));

		 Actions act = new Actions(driver);
		 //mousehover action
		 act.moveToElement(target).perform();
		 target.click();

		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();

		 WebElement target2 = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		 //doubleclick
		 act.doubleClick(target2).perform();


		

	}

}
