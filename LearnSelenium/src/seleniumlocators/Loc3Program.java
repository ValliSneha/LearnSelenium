package seleniumlocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loc3Program {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "C:/Users/Sneha/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//parent to child and then sibling
		driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).click();
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		//child to parent
		// Using driver.findElement("//header/div/button[1]/parent::div")
		//child to parent and then to grandparent //header/div/button[1]/parent::div/parent::header
		////child to parent and then to grandparent and to child //header/div/button[1]/parent::div/parent::header/a
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		
		

	}

}
