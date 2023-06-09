package dataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActiTimeInvalidTestCase {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-amt822b/login.do");
		
		Flib flib = new Flib();
		int rc= flib.rowCount("./data/ActiTime.xlsx","invalidcreds" );
		
		for(int i=1;i<=rc;i++) {
			
		
				
		String invalidUsername = flib.readExcelData("./data/ActiTime.xlsx","invalidcreds",i, 0);
		String invalidPassword = flib.readExcelData("./data/ActiTime.xlsx","invalidcreds",1, 1);
		
		driver.findElement(By.name("username")).sendKeys(invalidUsername);
		driver.findElement(By.name("pwd")).sendKeys(invalidPassword);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();

		
		

	}

	}
}
