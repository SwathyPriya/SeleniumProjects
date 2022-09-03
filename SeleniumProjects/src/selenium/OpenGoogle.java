package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//opening chrome and get google webpage

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");

		//For firefox browser
		//System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//driver.get("http://www.google.co.in");
		
		
	}

}
