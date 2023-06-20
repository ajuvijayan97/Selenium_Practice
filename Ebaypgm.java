package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebaypgm {
ChromeDriver driver;
	
	@BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
    }
	
	@BeforeMethod
	public void urlLoading() {
		driver.get("https://www.ebay.com/");
	}
	
	@Test
	public void electronics() {
		Actions action = new Actions(driver);
        WebElement electronics = driver.findElement(By.xpath("//*[@id='mainContent']/div[1]/ul/li[3]/a"));
        action.moveToElement(electronics);
        action.perform();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Computers and tablets')]")));
        WebElement subcategory = driver.findElement(By.xpath("//a[contains(text(),'Computers and tablets')]"));
        action.moveToElement(subcategory);
        action.click().perform();
        driver.quit();
	}
}
