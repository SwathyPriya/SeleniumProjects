package selenium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/pages/table.html");

		//Find number of columns
		List<WebElement> columns = driver.findElements(By.tagName("th"));
		int columnSize = columns.size();
		System.out.println("Column Size is "+columnSize);

		//Find number of rows
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowSize = rows.size();
		System.out.println("Row Size is "+rowSize);

		//Find the percentage of 'Learn to interact with elements
		WebElement getPercent = driver.findElement(By.xpath("//td[normalize-space() = 'Learn to interact with Elements'] //following::td[1]"));
		String percent = getPercent.getText();
		System.out.println("Percentage is "+percent);
		
		//Find the lowest percentage and check it.
		//1.Obtain the list of percentage
		List<WebElement> allProgress = driver.findElements(By.xpath("//td[2]"));
		List<Integer> numberList = new ArrayList<Integer>();
		
		for (WebElement webElement : allProgress) {
			String individualProgress = webElement.getText().replace("%", ""); //remove %
			numberList.add(Integer.parseInt(individualProgress));//convert string to int
		}	
		System.out.println("FinalList: "+numberList);
		
		//2. Find the smallest of above arraylist
		int smallestPercent = Collections.min(numberList);
		System.out.println("Smallest "+smallestPercent);
		
		String smallValue = Integer.toString(smallestPercent)+"%";
		
		String finalXpath ="//td[normalize-space()="+"\""+smallValue+"\""+"]"+"//following::td[1] ";
		System.out.println("Final Xpath is "+finalXpath);
		WebElement check = driver.findElement(By.xpath(finalXpath));
		check.click();
		
	}

}
