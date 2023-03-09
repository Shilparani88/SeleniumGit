package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath6 {

	

	public static void main(String[] args)  throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Laptop");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='Core i5']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//div[.='Brand' and (@class='_2gmUFU _3V8rao')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='HP']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//div[.='Operating System' and (@class='_2gmUFU _3V8rao')]")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='Windows 11']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='4★ & above']")).click();
        Thread.sleep(2000);
        
        String priceOfLaptop =driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
        
		System.out.println(priceOfLaptop);
        driver.quit();
        
 

        
	}

}
