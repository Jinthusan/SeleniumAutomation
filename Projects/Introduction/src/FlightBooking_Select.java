import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightBooking_Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello world");
		
		System.setProperty("webdriver.chrome.driver", "E:\\SLIIT\\QA Udemy\\Selenium\\Softwares\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement webelement = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select selctorDropdown = new Select(webelement);
		
		
		selctorDropdown.selectByIndex(1);
		System.out.println(selctorDropdown.getFirstSelectedOption().getText());
		selctorDropdown.selectByValue("AER");//getting using the value in the tag(web element)
		selctorDropdown.selectByVisibleText("USD");
		System.out.println(selctorDropdown.getFirstSelectedOption().getText());
		
		
		
	}

}
