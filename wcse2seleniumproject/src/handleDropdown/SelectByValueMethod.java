package handleDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValueMethod {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(" http://desktop-amt822b/user/submit_tt.do");
			
			WebElement userNameTB = driver.findElement(By.xpath("//input[@name='username']"));
			userNameTB.sendKeys("admin");
			WebElement passWordTB = driver.findElement(By.xpath("//input[@name='pwd']"));
			passWordTB.sendKeys("manager");
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			
			WebElement dropDownElement = driver.findElement(By.xpath("//select[@name='usersSelector.selectedUser']"));
			dropDownElement.click();
	Select select = new Select (dropDownElement);
	Thread.sleep(2000);
	select.selectByVisibleText("Gurav, Rutu (Manager)");
	select.selectByValue("2");
	
			

	}

}
