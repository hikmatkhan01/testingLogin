package khanLogin2;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    	System.out.print("Yes Work");
		System.setProperty("webdriver.chrome.driver", "/eclips_workspace/chromedirver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Miakhel");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademyy");
		driver.findElement(By.className("signInBtn")).click();
		System.out.print(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Mia 1");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("khan@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("Hikmat@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("567890764");
//		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("11122233344");
		driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.print(driver.findElement(By.className("infoMsg")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Miakhel");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
		
		
		
	}

}
