package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KickoffLoginPage {
FirefoxDriver driver;
	
	@BeforeTest
    public void setUp() {
        driver = new FirefoxDriver();
    }
	@BeforeMethod
    public void urlLoading() {
        driver.get("https://www.demo.guru99.com/V4/");
    }
	@Test
	public void loginSection() {
		WebElement userID =  driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
		userID.sendKeys("user1234");
		WebElement password = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
		password.sendKeys("GSg$@12");
		driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
		
	}
}
