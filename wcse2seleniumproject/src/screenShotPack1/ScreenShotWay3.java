package screenShotPack1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShotWay3 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Way3 upcast the browser specific classes 
		
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/doodles/international-womens-day-2023");
		
		File  src= driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/ssWay4.jpg");
		
		Files.copy(src, dest);
		
		
		

	}

}
