package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTesting1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
	//	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone" +Keys.ENTER);
		
	//	driver.findElement(By.id("nav-search-submit-button")).click();
		
	//	driver.findElement(By.linkText("Mobiles")).click();
		
	//	driver.findElement(By.partialLinkText("Pay")).click();
		
	//	driver.findElement(By.className("gb_f")).click();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iPhone" +Keys.ENTER);
		
	}

}
