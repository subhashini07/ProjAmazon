package org.test;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amaz {
	public static void main(String[]arg) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SureshG\\subhaworkspace\\AmazonProj\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("wallclock for living room");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		List<WebElement>li=	driver.findElements(By.tagName("img"));
		int size=li.size();
		System.out.println("No of wallclocks :"+size);
		if(size<=10) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		driver.findElement(By.xpath("(//img[@class='s-image'])[4]")).click();
		String par=driver.getWindowHandle();
		Set<String> all=driver.getWindowHandles();
		for(String X:all) {
			if(!X. equals(par)) {
				driver.switchTo().window(X);
			}
		}Thread.sleep(5000);
	    WebElement qnt= driver.findElement(By.xpath("//select[@name='quantity']"));
		Select s= new Select(qnt);
		s.selectByVisibleText("15");
		driver.findElement(By.id("buy-now-button")).click();
		
		
	}


}
