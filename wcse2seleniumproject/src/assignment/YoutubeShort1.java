package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeShort1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chrome", "./drivers.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='yt-spec-button-shape-next yt-spec-button-shape-next--text yt-spec-button-shape-next--mono yt-spec-button-shape-next--size-m yt-spec-button-shape-next--icon-only-default yt-spec-button-shape-next--workaround-icon-no-border-radius ']")).click();
		Thread.sleep(4000);
		
		List <WebElement> Shorts_Name = driver.findElements(By.xpath("//span[@class='style-scope ytd-rich-grid-slim-media']"));
		Thread.sleep(2000);
		List<WebElement> Shorts_View = driver.findElements(By.xpath("//span[@class='style-scope ytd-rich-grid-slim-media']/ancestor::a[@class='yt-simple-endpoint focus-on-expand style-scope ytd-rich-grid-slim-media']/descendant::span[@class='inline-metadata-item style-scope ytd-video-meta-block']"));
		Thread.sleep(2000);
		
		for(int i=0; i<Shorts_View.size(); i++)
		{
			 String name = Shorts_Name.get(i).getText();
			 
			 for(int j= i; j<=i; j++)
			 {
				String view = Shorts_View.get(j).getText();
				Thread.sleep(4000);
				System.out.print(name+" "+ view);
				
			
			 }
			
			System.out.println();
		}
		
	}




	}


