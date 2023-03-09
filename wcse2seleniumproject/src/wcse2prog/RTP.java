package wcse2prog;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RTP {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Select the required browser!!!");
		String browserValue =sc.next();
		if(browserValue.equals("chrome"))
	
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	}
	else if(browserValue.equals("edge"))
	{
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
	}
	
	else {
		System.out.println("Select valid browser");
	}
}



}
