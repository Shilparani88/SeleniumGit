package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeShorts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.youtube.com/shorts/H6zDONZEfZ4");
		
	    
		List <WebElement> shortsName = driver.findElements(By.xpath("//h2[@class='title style-scope ytd-reel-player-header-renderer'] "));
		List<WebElement> shortsChannelName = driver.findElements(By.xpath("//h2[@class='title style-scope ytd-reel-player-header-renderer']/ancestor::div[@class='overlay style-scope ytd-reel-video-renderer']/descendant::a[@class='yt-simple-endpoint style-scope yt-formatted-string']"));
		
		for(int i=0;i<=shortsName.size();i++)
		{
			String op = shortsName.get(i).getText();
			Thread.sleep(2000);
			
			for(int j=i;j<=i;j++)
			{
				String opt = shortsChannelName.get(j).getText();
				System.out.print(op+" :"+opt);
				Thread.sleep(2000);
			}
			System.out.println();
			   
		}

	}

}
