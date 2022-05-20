package iiht.CAssessment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Help {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		
		driver.findElement(By.xpath("//a[@class='inherit contact-channel'][normalize-space()='Help']")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[normalize-space()='My Account']")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[contains(text(),'How do I track my order from my account?')]")).click();
		driver.findElement(By.xpath("//figure[@class='header__topBar_logo']//*[name()='svg']")).click();

	}

}
