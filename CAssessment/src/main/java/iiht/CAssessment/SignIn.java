package iiht.CAssessment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		
		//click on user icon
		driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		//click on SignIn text
		driver.findElement(By.xpath("//a[@class='login-link authentication_popup']")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//Enter SignIn Credentials
		driver.findElement(By.xpath("(//input[@id='spree_user_email'])[2]")).sendKeys("kalpesh1499@yahoo.com");
		driver.findElement(By.xpath("(//input[@id='spree_user_password'])[3]")).sendKeys("Ladder#123");
		
		//clicked on SignIn Button
		driver.findElement(By.xpath("//input[@id='ul_site_login']")).click();
		
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	}

}
