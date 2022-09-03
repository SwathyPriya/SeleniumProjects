package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCheckBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		
		WebElement java = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[1]"));
		java.click();
		
		WebElement seleniumCB = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/input"));
		boolean selectedCB = seleniumCB.isSelected();
		System.out.println(selectedCB);
		
		//Deselect only checked
		WebElement CB1 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[1]"));
		if(CB1.isSelected())
		{
			CB1.click();
		}
		WebElement CB2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[2]"));
		if(CB2.isSelected())
		{
			CB2.click();
		}
		
		WebElement Option1CB = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[1]"));
		Option1CB.click();
		WebElement Option2CB = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[2]"));
		Option2CB.click();
		WebElement Option3CB = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[3]"));
		Option3CB.click();
		WebElement Option4CB = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[4]"));
		Option4CB.click();
		WebElement Option5CB = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[5]"));
		Option5CB.click();
		WebElement Option6CB = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[6]"));
		Option6CB.click();
		
	}

}
