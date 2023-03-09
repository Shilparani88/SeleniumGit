package assignment;

import java.time.Duration;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicates3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("file:///C:/Users/HP/Desktop/Automation%20Data/webElement/MultiselectedDuplicateDropdown.html");
        WebElement dropDownElement = driver.findElement(By.name("menu"));
        Select sel = new Select(dropDownElement);
        
        TreeSet<String> options = new TreeSet<>();
        for (WebElement option : sel.getOptions()) {
            options.add(option.getText());
        }
        
        for (String option : options) {
            System.out.println(option);
        }
        driver.quit();
    }
}
