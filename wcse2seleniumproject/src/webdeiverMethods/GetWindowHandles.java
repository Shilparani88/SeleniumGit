package webdeiverMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetWindowHandles {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				FirefoxDriver driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("http://omayo.blogspot.com/");
				String parantHandle = driver.getWindowHandle();
				System.out.println("This is the address of paraent window:" + parantHandle);
				driver.findElement(By.linkText("Open a popup window")).click();
				
				Set<String> allHandles = driver.getWindowHandles();
				for(String wh:allHandles)
				{
					System.out.println("This is the address of all windows:" + wh);
				}
				

			}


	}


