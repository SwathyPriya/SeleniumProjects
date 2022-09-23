package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCalendars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://testleaf.herokuapp.com/pages/Calendar.html");
		
		//1.Clicking the textbox that prompts calendar
		WebElement calendar = driver.findElement(By.id("datepicker"));
		calendar.click();
		//calendar.sendKeys("10/10/2022"+Keys.ENTER);  Using Sendkeys class
		
		//2.clicking the next button to move to next month calendar
		WebElement nextButton = driver.findElement(By.xpath("//a[@title='Next']"));
		nextButton.click();
		
		//3.Selecting the 10th date
		WebElement date = driver.findElement(By.xpath("//a[contains(text(),10)]"));
		date.click();
							
		
	}

}
