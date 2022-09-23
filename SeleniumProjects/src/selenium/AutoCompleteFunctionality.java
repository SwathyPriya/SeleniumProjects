package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteFunctionality {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/autocomplete/");

		driver.switchTo().frame(0);
		WebElement input = driver.findElement(By.id("tags"));
		input.sendKeys("j");
		Thread.sleep(4000); //Use Implicit /Explicit wait only.
		List<WebElement> optionsList = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		for (WebElement webElement : optionsList) {
			
			if(webElement.getText().equals("Java")) {
				webElement.click();
				System.out.println("Selecting"+webElement.getText());
				break;

			}


		}


	}

}
