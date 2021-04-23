import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello world");
		
		System.setProperty("webdriver.chrome.driver", "E:\\SLIIT\\QA Udemy\\Selenium\\Softwares\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Uncheck checkbox
		driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());
		Assert.assertFalse(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());
		//get count of checkboxes in the UI
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
	}

}
