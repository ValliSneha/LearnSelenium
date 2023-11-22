package seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSelenium {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "C:/Users/Sneha/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		// driver.close(); //->closes the current window
		//driver.quit(); //->closes the windows opened by the automation 
	}

}
