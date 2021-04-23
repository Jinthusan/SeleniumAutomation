package Section13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

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
		
		System.out.println("Total Raws = " + driver.findElements(By.cssSelector("[class='table-display'] tr")).size());
		System.out.println("Total Coloumns = " + driver.findElements(By.cssSelector("[class='table-display'] tr th")).size());	
		System.out.println("Second raw is = " + driver.findElement(By.cssSelector("[class='table-display'] tr:nth-child(3)")).getText());

	}

}
