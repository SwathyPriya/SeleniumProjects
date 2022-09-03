package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		
		
		//Dropdown by Index,Value,VisibleText
		WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropDown1);
		select.selectByIndex(2);
		select.selectByValue("3");
		select.selectByVisibleText("Selenium");
		
		
		//Find number of options in dropdown
		List<WebElement> listofoptions= select.getOptions();
		int size = listofoptions.size();
		System.out.println(size);
		
		//Using sendKeys to select one option
		dropDown1.sendKeys("Loadrunner");
		
		
		//MultiSelect Box
		WebElement multiSelect = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select multiSelectBox = new Select(multiSelect);
		multiSelectBox.selectByIndex(1);
		multiSelectBox.selectByIndex(3);
		
		
		
		
		
		
	}

}
