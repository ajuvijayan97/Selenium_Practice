package testngpkg;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonWindowHandler {
     WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
     }

    @Test
    public void addToCartTest() throws InterruptedException {
        driver.get("https://www.amazon.in/");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile phones");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        driver.findElement(By.xpath("//img[@alt='OnePlus Nord CE 3 Lite 5G (Pastel Lime, 8GB RAM, 128GB Storage)']")).click();

        String originalHandle = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                driver.switchTo().window(handle);
            }
        }

        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        Thread.sleep(3000);
        driver.close();
    }

    
}
