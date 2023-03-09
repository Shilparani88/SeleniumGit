package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			
			driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&mobileBrowserWeblabTreatment=C&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%2F%3F_encoding%3DUTF8%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26gclid%3DCjwKCAiAuOieBhAIEiwAgjCvcooojxJqLb0PRseAF-H-lzW39i0LLxEi3WBsgXlMfnxvVGBb5VmP2BoCTfoQAvD_BwE%26hvadid%3D398134035836%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007788%26hvnetw%3Dg%26hvpone%3D%26hvpos%3D%26hvptwo%3D%26hvqmt%3Db%26hvrand%3D4756404608006550149%26hvtargid%3Dkwd-294882733100%26hydadcr%3D24542_1971411%26ie%3DUTF8%26index%3Daps%26keywords%3Dlogin%2520amazon%2520account%26ref%3Dpd_sl_2cwzc6x246_b%26tag%3Dgooginhydr1-21%26ref_%3Dnav_ya_signin&prevRID=9PEQ25A1J1BF8XHH7CWD&openid.assoc_handle=inflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	        driver.findElement(By.id("ap_customer_name")).sendKeys("user");
	        Thread.sleep(2000);
	        driver.findElement(By.id("ap_phone_number")).sendKeys("1234567890");
	        driver.findElement(By.id("ap_password")).sendKeys("user123");
	        driver.findElement(By.id("continue")).click();
		}

	}



