package testngpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Uploadpgm {
    ChromeDriver driver;

    @BeforeTest
    public void setUp() {
        
        driver = new ChromeDriver();
    }

    @Test
    public void urlLoading() throws AWTException {
        driver.get("https://www.ilovepdf.com/excel_to_pdf");
        driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
        
        fileUpload("F:\\test.xlsx");
        
        driver.findElement(By.xpath("//span[@id='processTaskTextBtn']")).click();
    }

    public void fileUpload(String filePath) throws AWTException {
        StringSelection stringSelection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        
        Robot robot = new Robot();  
        
        robot.delay(5000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

         
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(2000); 
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

   
}
