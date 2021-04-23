import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello world");
		
		System.setProperty("webdriver.chrome.driver", "E:\\SLIIT\\QA Udemy\\Selenium\\Softwares\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://www.espncricinfo.com/");
		System.out.println(driver.getTitle()); //To validate the landed page is correct using the title name
		//System.out.println(driver.getCurrentUrl()); //To validate the landed URL is correct bcs sometimes if it got hacked sometimes it might redirect to some other wiered page so this validation will helps to make sure
		//System.out.println(driver.getPageSource());
		
		driver.get("https://courseweb.sliit.lk/my/");
		driver.navigate().back();//move back for the previous site
		//driver.close();//close the current chrome window/ tab which got open for the test
		driver.quit();//close all the windows and taps at a time(to close child windows)*/
		
		driver.get("https://www.salesforce.com/ap/?ir=1");
		driver.findElement(By.cssSelector(".dropdown-toggle.disabled")).click();
		
		driver.findElement(By.id("username")).sendKeys("This is my email");
		driver.findElement(By.name("pw")).sendKeys("123");
		//driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.findElement(By.cssSelector("#password")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		
	}

}
