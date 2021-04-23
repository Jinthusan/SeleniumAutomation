package WindowHandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent2ChildAndReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\SLIIT\\QA Udemy\\Selenium\\Softwares\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		Set<String> windowsId = driver.getWindowHandles();
		//[parentid,childid,subchildId]
		Iterator<String> it = windowsId.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		
		driver.findElement(By.cssSelector("p.im-para.red")).getText();
		String emailID = driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(emailID);
		
		
		
		
		
		

	}

}
