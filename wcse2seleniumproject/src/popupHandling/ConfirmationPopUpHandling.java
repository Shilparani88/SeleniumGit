package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConfirmationPopUpHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/HP/Desktop/Automation%20Data/webElement/Confirmation%20popup.html");
		
		//generate alert popup
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//switch the control to alert popup
	    Thread.sleep(2000);
	    Alert al = driver.switchTo().alert();
	    
	    Thread.sleep(2000);
		al.getText();
		System.out.println(al.getText());
		
		//accept confirmation popup
	    Thread.sleep(2000);
	    al.accept();
	    
	    //dismiss confirmation popup
	    //Thread.sleep(2000);
	    //al.dismiss();
	    
	    
	 	

	}

}
