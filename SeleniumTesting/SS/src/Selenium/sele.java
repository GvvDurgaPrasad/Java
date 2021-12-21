package Selenium;

import selenium.testing.ChromeDriver;
import selenium.testing.WebDriver;

public class sele {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
	}


}
