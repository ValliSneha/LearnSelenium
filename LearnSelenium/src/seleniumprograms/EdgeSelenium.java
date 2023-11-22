package seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EdgeSelenium {

	public static void main(String[] args) {
		System.setProperty("WebDriver.edge.driver", "C:/Users/Sneha/edgedriver_win64.zip/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());


	}

}
