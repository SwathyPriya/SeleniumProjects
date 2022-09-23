package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
				
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/pages/frame.html");
		
		driver.switchTo().frame(0); //Switch to frame
		WebElement button1 = driver.findElement(By.id("Click"));
		button1.click();
		String text = driver.findElement(By.id("Click")).getText(); //gettext - obtains text from the button.
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");//Accessing nested frame.
		WebElement button2 = driver.findElement(By.id("Click1"));
		button2.click();
		
		driver.switchTo().defaultContent();//switches from Frame to default content.
		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe")); //Obtaining all frames in a list.
		int framecount = totalFrames.size();
		System.out.println(framecount);
		
		
		
		
		
	}

}
