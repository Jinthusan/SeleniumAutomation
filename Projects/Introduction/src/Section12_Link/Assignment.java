package Section12_Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\SLIIT\\QA Udemy\\Selenium\\Softwares\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption2")).click();
		String optionName = driver.findElement(By.cssSelector("label[for='benz']")).getText();
		System.out.println(optionName);
		
		WebElement webelement = driver.findElement(By.id("dropdown-class-example"));
		Select selectDropdown = new Select(webelement);
		selectDropdown.selectByVisibleText(optionName);
		
		driver.findElement(By.id("name")).sendKeys(optionName);
		driver.findElement(By.id("alertbtn")).click();
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		System.out.println(alertText.contains(optionName));
		

	}

}
