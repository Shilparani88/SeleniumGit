package qsp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.co.in/search?q=flipkart&sxsrf=AJOqlzXlotSdzCRwFZwZA_RJDrkYUYe2iA%3A1674376882937&ei=svbMY9btOIXw4-EPi-uG6Ao&gs_ssp=eJzj4tLP1TdILkqpqihQYDRgdGDw4kjLySzITiwqAQBm2Afs&oq=flip&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQARgDMgQIIxAnMgQIIxAnMgUIABCRAjIRCC4QgAQQsQMQgwEQxwEQ0QMyEAgAEIAEEBQQhwIQsQMQgwEyBAgAEEMyCgguEMcBENEDEEMyCggAELEDEIMBEEMyCwgAEIAEELEDEIMBMgQIABBDOgcIIxDqAhAnOg0IABCPARDqAhC0AhgBOg0ILhCPARDqAhC0AhgBOgUIABCABDoICAAQsQMQgwE6CgguEMcBEK8BEEM6EAguELEDEIMBEMcBENEDEEM6CwgAELEDEIMBEJECSgQIQRgASgQIRhgBUIoHWJ8MYJkiaAFwAXgAgAGeAYgBzQSSAQMwLjSYAQCgAQGwARTAAQHaAQYIARABGAo&sclient=gws-wiz-serp");
	}

}
