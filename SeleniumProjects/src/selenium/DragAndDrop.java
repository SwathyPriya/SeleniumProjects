package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement From = driver.findElement(By.id("form:drag_content"));
		WebElement  To = driver.findElement(By.id("form:drop_content"));
		
		Actions act = new Actions(driver);
		//Below 2 lines of code does the same process of Drag and drop.
		act.clickAndHold(From).moveToElement(To).release(To).build().perform();
		//act.dragAndDrop(From, To).build().perform(); 

	}

}
