package seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxSelenium {

	public static void main(String[] args) {
		System.setProperty("WebDriver.gecko.driver", "C:/Users/Sneha/geckodriver-v0.33.0-win64.zip/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());


	}

}
