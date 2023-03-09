package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeShortsViews {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//div[@id='button-container']")).click();
		
		List <WebElement> shortsTitle = driver.findElements(By.xpath("//span[@id='video-title']"));
		List<WebElement> shortsViews = driver.findElements(By.xpath("//h2[@class='title style-scope ytd-reel-player-header-renderer']/ancestor::div[@class='overlay style-scope ytd-reel-video-renderer']/descendant::a[@class='yt-simple-endpoint style-scope yt-formatted-string']"));
		
		
		
		
		
		

	}
}
