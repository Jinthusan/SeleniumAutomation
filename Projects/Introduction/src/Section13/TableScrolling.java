package Section13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableScrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\SLIIT\\QA Udemy\\Selenium\\Softwares\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//Scroll 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,500)");//Scroll the whole window
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");//scroll the table
		
		//Get sum of the Amount coloumn
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int sum = 0;
		for(int i=0 ; i<values.size();i++) {
			sum = sum + Integer.parseInt(values.get(i).getText());
		}
		System.out.println(sum);
		//Validate the sum in the page and our out put is same
		driver.findElement(By.className("totalAmount")).getText();
		int expVal = Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());	
		Assert.assertEquals(sum, expVal);
	}

}
