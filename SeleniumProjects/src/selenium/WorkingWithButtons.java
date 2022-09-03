package selenium;

//import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.Point;

public class WorkingWithButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");
		
		//Find the position of the Button
		WebElement getPositionButton = driver.findElement(By.id("position"));
		Point xypoint = getPositionButton.getLocation();
		int xValue=xypoint.getX();
		int yValue=xypoint.getY();
		System.out.println("xvalue is "+xValue +"Yvalue is "+yValue);
		
		//Find the color of Button
		WebElement colorButton = driver.findElement(By.id("color"));
		String color = colorButton.getCssValue("background-color");
		System.out.println("Color of Button is "+color);
		
		//Find the Size of button
		WebElement sizeButton = driver.findElement(By.id("size"));
		int height = sizeButton.getSize().getHeight();
		int width = sizeButton.getSize().getWidth();
		System.out.println("Height is "+height +"Width is"+width);
		
		//Goto Home Page
		WebElement homeButton = driver.findElement(By.id("home"));
		homeButton.click();
		
				
	}

}
