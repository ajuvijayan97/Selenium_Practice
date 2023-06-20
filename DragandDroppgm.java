package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDroppgm {
ChromeDriver driver;
	
	@BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
    }
	
	@BeforeMethod
	public void urlLoading() {
		driver.get("https://demoqa.com/droppable/");
	}
	
	@Test
	public void dragDrop() {
		
		WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(draggable, droppable).build().perform();
        String t = droppable.getText();
        if (t.equals("Dropped!")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
	}

}
