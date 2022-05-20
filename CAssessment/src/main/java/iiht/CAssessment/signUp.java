package iiht.CAssessment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		
		//Click on user icon
		driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
		//click on SignUp text
		driver.findElement(By.xpath("//a[@class='signup-link authentication_popup']")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		//Enter email Address and Password to create an account 
		driver.findElement(By.cssSelector("#spree_user_email")).sendKeys("kalpesh1499@yahoo.com");
		driver.findElement(By.xpath("(//*[@id='spree_user_password'])[2]")).sendKeys("Ladder#123");
		
		//click and signed up Successfully
		driver.findElement(By.xpath("//input[@value='Sign Up']")).click();

	}

}
