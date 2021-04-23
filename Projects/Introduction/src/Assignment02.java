import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello world");
		
		System.setProperty("webdriver.chrome.driver", "E:\\SLIIT\\QA Udemy\\Selenium\\Softwares\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		
		driver.get("https://www.cleartrip.com/");
		
		WebElement webelementAdult = driver.findElement(By.id("Adults"));
		Select dropdownAdult = new Select(webelementAdult);
		dropdownAdult.selectByIndex(2);
		
		WebElement webelementChildren = driver.findElement(By.id("Childrens"));
		Select dropdownChildren = new Select(webelementChildren);
		dropdownChildren.selectByIndex(3);
		
		WebElement webelementInfant = driver.findElement(By.id("Infants"));
		Select dropdownInfant= new Select(webelementInfant);
		dropdownInfant.selectByIndex(1);
		
		driver.findElement(By.id("MoreOptionsDiv")).click();
		
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Indigo");
		
		driver.findElement(By.id("SearchBtn")).click();
		
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		
	}

}
