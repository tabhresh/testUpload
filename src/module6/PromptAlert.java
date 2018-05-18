package module6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {

		//Instantiat a Browser or Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.in/2018/01/blog-post.html");
		
		driver.findElement(By.id("prompt")).click();
		
		Alert PA = driver.switchTo().alert();

		PA.sendKeys("Selenium");
		Thread.sleep(4000);
		
		PA.accept();
		Thread.sleep(4000);
	}

}
