package seleniumlocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Loc2Program {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "C:/Users/Sneha/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String pass=getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String name="abc";
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(pass);
		driver.findElement(By.className("submit")).click();
		Thread.sleep(1000);
		String succMsg=driver.findElement(By.tagName("p")).getText();
		System.out.println(succMsg);
		Assert.assertEquals(succMsg,"You are successfully logged in.");
		//Using CSS locator: "Parenttagname childtagname"
		String welMsg=driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
		System.out.println(welMsg);
		Assert.assertEquals(welMsg, "Hello "+name+",");
		//You can also replace tagname with "*" and write "//*[text()='Log Out']". "*" represents anything.
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();

	}
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		//Using parent to child in CSS Selector- "parenttagname childtagname"
		String passwordText=driver.findElement(By.cssSelector("form p")).getText();
		String[] passwordArray=passwordText.split("'");
		
		return passwordArray[1];
		
		
	}

}
