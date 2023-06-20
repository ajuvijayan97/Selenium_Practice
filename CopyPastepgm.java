package testngpkg;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CopyPastepgm {
ChromeDriver driver;
	
	@BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
    }
	
	@BeforeMethod
	public void urlLoading() {
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void copyPaste() {
		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		WebElement reddifMailId = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		firstName.sendKeys("Prajeesh");
		Actions actions = new Actions(driver);
		actions.keyDown(firstName,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		actions.keyDown(firstName,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		actions.keyDown(reddifMailId,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		actions.perform();
		
	}

}
