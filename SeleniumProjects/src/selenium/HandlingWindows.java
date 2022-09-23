package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.net.OlderWindowsVersionEphemeralPortDetector;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/pages/Window.html");

		String parentWindow = driver.getWindowHandle();
		
		WebElement homeButton = driver.findElement(By.id("home"));
		homeButton.click();
		
		Set<String> handles=  driver.getWindowHandles();
		
		
		for (String childWindow : handles) {
			
			driver.switchTo().window(childWindow);
			
		}
		WebElement editboxWindow = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		editboxWindow.click();
		
		driver.close();
		driver.switchTo().window(parentWindow);
		
		
		//Find the number of opened windows
		WebElement openMultiple = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		openMultiple.click();
		Thread.sleep(3000);
		int numberofWindows = driver.getWindowHandles().size();
		System.out.println("Number of Opened windows:"+numberofWindows);
		
		// close childwindows after dontcloseme button is clicked.
		WebElement dontCloseMe = driver.findElement(By.id("color"));
		dontCloseMe.click();
		Thread.sleep(3000);
		Set<String> newWindowHandles = driver.getWindowHandles();
		
		for(String allWindows : newWindowHandles){
			if(!allWindows.equals(parentWindow)){
				driver.switchTo().window(allWindows);
				driver.close();
			
				}
		
			}
		}
		
	}


