package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTextbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		
		WebElement emailBox = driver.findElement(By.id("email"));
		emailBox.sendKeys("examplemail@gmail.com");
		
		WebElement appendBox= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		appendBox.sendKeys("text");
		
		WebElement getTextBoxValue = driver.findElement(By.name("username"));
		String value = getTextBoxValue.getAttribute("value");
		System.out.println(value);
	
		WebElement clearBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input"));
		clearBox.clear();
		
		WebElement disabledBox = driver.findElement(By .xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		boolean enabledValue = disabledBox.isEnabled();
		System.out.println(enabledValue);
	}

}
