package pkg1;

import java.util.List;

/*import org.junit.After;*/
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
/*import org.openqa.selenium.Keys;*/
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
	ChromeDriver driver;

	@Before
	public void setUp() {

		driver = new ChromeDriver();
	}

	@Test
	public void test1() {
		driver.get("https://www.amazon.in/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Links: " + links.size());
		
		for(WebElement ref : links) {
			String link = ref.getAttribute("href");
			String linktext = ref.getText();
			System.out.println(link+"-----"+linktext);
		}

	}

	
}
