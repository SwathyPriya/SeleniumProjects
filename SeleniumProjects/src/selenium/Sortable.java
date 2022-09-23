package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/sortable/");
		
		driver.switchTo().frame(0);
		////*[@id="sortable"]/li[1]
		//*[@id="sortable"]/li[1]
		List<WebElement> elements= driver.findElements(By.xpath("//*[@id='sortable']/li"));
		int size = elements.size();
		System.out.println("Size is "+size);
		
		WebElement fromElement = elements.get(6);
		WebElement toElement = elements.get(0);
		
		
		Actions act= new Actions(driver);
		
		/*act.clickAndHold(fromElement);
		act.moveToElement(toElement);
		act.release(toElement);
		act.build().perform();*/
		
		
		act.dragAndDrop(fromElement, toElement).build().perform();
		
		
	}

}
