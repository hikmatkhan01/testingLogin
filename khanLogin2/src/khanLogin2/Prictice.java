package khanLogin2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prictice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.print("Miakhel");
        System.setProperty("webdriver.chrome.driver", "/eclips_workspace/chromedirver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("userName");
        driver.findElement(By.name("inputPassword")).sendKeys("enter password");
        driver.findElement(By.className("signInBtn")).click();
        System.out.print(driver.findElement(By.cssSelector(".error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("username");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Email");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("phone number");
    	driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.print(driver.findElement(By.className("infoMsg")).getText());
//		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains()]"));
        
       

	}

}
