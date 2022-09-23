package selenium;

import java.util.List;

//import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://testleaf.herokuapp.com/pages/Image.html");

	
	//WebElement firstImage = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
	//firstImage.click();
	
	WebElement brokenImage = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
	
	if(brokenImage.getAttribute("naturalWidth").equals("0")) {
		
		System.out.println("Image is broken");
	}else {
		
		System.out.println("Image is not broken");
	}
		
	List<WebElement> imgCount =  driver.findElements(By.tagName("img"));
	System.out.println(imgCount.size());

	
	}

}
