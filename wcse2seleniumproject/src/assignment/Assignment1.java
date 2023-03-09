package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1 {
	// browser Operation
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// Maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(4000);

		// set size of browser
		Dimension targetSize = new Dimension(300, 450);
		driver.manage().window().setSize(targetSize);

		// set position of browser
		Thread.sleep(4000);
		Point targetPosition = new Point(150, 450);
		driver.manage().window().setPosition(targetPosition);

	}

}
