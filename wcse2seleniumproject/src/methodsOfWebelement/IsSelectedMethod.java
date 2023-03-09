package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
//used for checkbox and radiobutton
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromrdriver", "./drivers/chromdriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-amt822b/login.do");
		WebElement verify = driver.findElement(By.name("remember"));
		
		boolean status = verify.isSelected();
		System.out.println(status);
		Thread.sleep(2000);
		verify.click();
		boolean status2 = verify.isSelected();
		System.out.println(status2);

	}

}
