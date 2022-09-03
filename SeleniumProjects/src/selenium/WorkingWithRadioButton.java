package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/radio.html");
		
		//Identify which radio button is clicked.
		WebElement unclickedRB = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input[1]"));
		WebElement clickedRB = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input[2]"));
		
		boolean status1 = unclickedRB.isSelected();
		boolean status2 = clickedRB.isSelected();
		
		System.out.println(status1);
		System.out.println(status2);
		
		//Click the agegroup RB
		WebElement agegroupRB = driver.findElement(By.name("age"));
		agegroupRB.click();
		
		
		
		
		
		
	}

}
