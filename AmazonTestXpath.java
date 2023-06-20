package pkg1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTestXpath {
    ChromeDriver driver;

    @Before
    public void setUp() {
        
        driver = new ChromeDriver();
    }

    @Test
    public void test1() {
    	
    	driver.get("path");
    	
        driver.findElement(By.xpath("/html/body/input[1]")).click();
        Alert a = driver.switchTo().alert();
        String text = a.getText();
        System.out.println(text);
        
        if(text.equalsIgnoreCase("Alert Box")) {
        	System.out.println("Pass");
        }else {
        	System.out.println("Fail");
        }
        	
        a.accept();
        driver.findElement(By.name("firstname")).sendKeys("Prajeesh");
        driver.findElement(By.name("lastname")).sendKeys("Prabhakar");
        driver.findElement(By.xpath("/html/body/input[4]")).click();
    }

	/*
	 * @After public void teardown() { driver.quit();
	 * 
	 * }
	 */
}
	
