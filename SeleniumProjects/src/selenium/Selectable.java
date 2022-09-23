package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demoSite/practice/selectable/serialize.html");
		
		List <WebElement> selectable = driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		
		int listSize = selectable.size();
		System.out.println(listSize);
		
		Actions actions = new Actions(driver); //Actions class handles keyboard/mouse events.
		actions.keyDown(Keys.CONTROL)
		.click(selectable.get(0))
		.click(selectable.get(1))
		.click(selectable.get(2)).build().perform();
		
		
		
		/*Above line of code can be written similar to below lines of code too
		actions.clickAndHold(selectable.get(0));
		actions.clickAndHold(selectable.get(1));
		actions.clickAndHold(selectable.get(2));*/
		
		
		
		
	}

}
