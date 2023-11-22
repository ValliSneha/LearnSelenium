package seleniumlocators;

import java.awt.geom.Area;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loc1Program {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("WebDriver.chrome.driver", "C:/Users/Sneha/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//Using id attribute
		driver.findElement(By.id("inputUsername")).sendKeys("abc@gmail.com");
		//Using name attribute
		driver.findElement(By.name("inputPassword")).sendKeys("abc123");
		//Using Xpath
		//driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		//Using class attribute(if class name is separated by space then there are two class names use any one)
		driver.findElement(By.className("submit")).click();
		
		//String errorMsg=driver.findElement(By.className("error")).getText();
		
		//Using CSS Selector id- tagname#id 
		//Using CSS Selector classname- tagname.classname (.classname will also work if that is the only class name)
		String errorMsg=driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(errorMsg);
		//Validate CSS in the console by typing $('p.error') 
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(1000);
		
		//Using Xpath- //Tagname[@attribute='value']
		//Validate Xpath in the console by typing $x('//input[@placeholder="Name"]')
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Zara");
		
		//Using CSS Selector- tagname[attribute='value']
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("abc@gmail.com");
		
		//Identify the same element using a different locator with indexing[]
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		
		//Using CSS selector to identify email box with indexing
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("zara0000@gmail.com");
		
		//Using parent to child in Xpath- //parenttagname/childtagname 
		//(if more than one elements then use indexing)
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876543");
		
		//Clicking Reset Login button using css selector (.classname) 
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		//Using parent to child in CSS Selector- "parenttagname childtagname
		String resetmsg=driver.findElement(By.cssSelector("form p")).getText();
		System.out.println(resetmsg);
		
		//Clicking goto login
		//1. driver.findElement(By.className("go-to-login-btn")).click();
		//2. parent to child using xpath
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		
		//Using CSS Selector #tagname
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Zohi");
		
		//Using CSS Selector Regular Expression
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.id("chkboxOne")).click();
		
		//Using Xpath Regular Expression
		//If there are two class names separated by space give anyone while using By.class and both as 
		//it is while using By.Xpath
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
		
			

	}

}
