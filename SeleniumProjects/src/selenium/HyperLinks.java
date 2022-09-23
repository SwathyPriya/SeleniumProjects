package selenium;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://testleaf.herokuapp.com/pages/Link.html");//Navigate
		
		WebElement homePage= driver.findElement(By.linkText("Go to Home Page"));
		homePage.click();
		
		driver.navigate().back();
		//Find the page without clicking the link using href attribute
		WebElement whereTo = driver.findElement(By.partialLinkText("Find where"));
		String where = whereTo.getAttribute("href");
		System.out.println("The link directs to "+where);
		
		//Find Link is broken or not.
		WebElement brokenLink = driver.findElement(By.linkText("Verify am I broken?"));
		brokenLink.click();
		
		
		String title = driver.getTitle();
		if(title.contains("404")) {
			System.out.println("Link is broken");
		}
		
		driver.navigate().back();
		WebElement homePage1= driver.findElement(By.linkText("Go to Home Page"));
		homePage1.click();
		
		driver.navigate().back();
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		int linksCount = totalLinks.size();
		System.out.println("Total Links "+linksCount);
		
		
		
		
		
		

	}

}
