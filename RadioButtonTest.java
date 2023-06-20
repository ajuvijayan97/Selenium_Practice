package pkg1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonTest {
	ChromeDriver driver;
	
	@Before
	public void setUp() {
        
        driver = new ChromeDriver();
        driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
    }
	
	@Test
	public void testRadioButtonSelected() {
		//WebElement radioButton = driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[24]/td[3]"));
		WebElement radioButton = driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[24]/td[3]/input[1]"));
		boolean selected = radioButton.isSelected();
		
		if (selected) {
            System.out.println("Pass: Radio button is selected");
        } 
		else {
            System.out.println("Fail: Radio button is not selected");
        }
		
		
	}

}
