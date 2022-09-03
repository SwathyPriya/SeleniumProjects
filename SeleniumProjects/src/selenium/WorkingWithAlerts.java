package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		
		//click alertbox button and click ok in alert window.
		WebElement alertBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertBox.click();
		Alert alert = driver.switchTo().alert();		
		alert.accept();
		
		//Click confirm button and select cancel button in alert window.
		WebElement confirmBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		confirmBox.click();
		Alert confirmalert = driver.switchTo().alert();
		confirmalert.dismiss();
		
		
		//Click PromptButton 
		WebElement promptBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		promptBox.click();
		Alert promptalert = driver.switchTo().alert();
		Thread.sleep(3000);
		promptalert.sendKeys("MyInstitute");
		Thread.sleep(3000);
		promptalert.accept();
		
		
		

	}

}
