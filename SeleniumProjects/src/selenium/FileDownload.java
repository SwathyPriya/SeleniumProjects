package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		
		WebElement downloadButton = driver.findElement(By.id("j_idt93:j_idt95"));
		downloadButton.click();
		Thread.sleep(3000);//Use Implicit/explicit wait only
		
		
		File fileLocation = new File("C:\\Users\\Swathy Priya\\Downloads"); //Open downloads location
		File[] totalFiles = fileLocation.listFiles(); //Find the totalfiles
		
		for (File file : totalFiles) {
			if(file.getName().equals("TestLeaf Logo.png")) {
				System.out.println("File is downloaded");
				break;
			}

		
		
		
		}
		
		
		
	}

}
