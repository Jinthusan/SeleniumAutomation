import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e_DisableAtttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\SLIIT\\QA Udemy\\Selenium\\Softwares\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		//From to To
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[value='DEL']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		//Pick current date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		//Check the return date is disable
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("is disable");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		//Check box
		driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		
		//Get passenger count
		driver.findElement(By.id("divpaxinfo")).click();
		WebElement webelement = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select dropdown = new Select(webelement);

		dropdown.selectByIndex(5);
		//select currency
		WebElement webelementCurrency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdownCurrency = new Select(webelementCurrency);
		
		dropdownCurrency.selectByValue("USD");
		
		driver.close();

	}

}
