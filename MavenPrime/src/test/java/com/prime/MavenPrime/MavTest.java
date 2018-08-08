package com.prime.MavenPrime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MavTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver; 
		ChromeOptions options= new ChromeOptions(); 
		 
		 options.addArguments("disable-notifications");
		 options.addArguments("disabble-extensions");
		 options.addArguments("disable-infobars");
		System.setProperty("webdriver.chrome.driver", "E:\\PrimusBank\\lib\\chro\\chromedriver.exe");
		 
		 driver=new ChromeDriver(options);
		 
		 driver.get("https://www.google.co.in");
		 driver.manage().window().maximize();
		 WebElement ee=driver.findElement(By.id("lst-ib"));
		ee.sendKeys("DevOps Engineer");
		 ee.submit();
		 driver.findElement(By.linkText("What Is a DevOps Engineer? | Puppet")).click();
		 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		 driver.close();
		 

	}

}
