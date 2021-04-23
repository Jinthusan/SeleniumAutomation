package Section12_Link;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\SLIIT\\QA Udemy\\Selenium\\Softwares\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//Get the count of all links in the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Get the link count which are in the footer
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));//Limiting the webdriver scope
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		WebElement footerFirstColoumn = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(footerFirstColoumn.findElements(By.tagName("a")).size());
		
		//Click each links in the 1st coloumn
		for(int i=1;i<footerFirstColoumn.findElements(By.tagName("a")).size();i++) {
			
			String clickOnLinkTap = Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerFirstColoumn.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTap);;
		}
		//driver.close();
		//Getting the title of the new pages which are opening using widow handles and while loop
		Set<String> windows = driver.getWindowHandles();//5
		Iterator<String> it = windows.iterator();
		
		while(it.hasNext()) {
			System.out.println(driver.switchTo().window(it.next()).getTitle());//each it.next() will increment when running inside while
		}

	}

}
