package com.flipkart;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.edgedriver().setup();
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
		d.manage().window().minimize();
		d.navigate().forward();	
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get("https://www.amazon.in");
		d.findElement(By.xpath("//a[contains(text(),'Today')]")).click();
		JavascriptExecutor js = (JavascriptExecutor)d;
		WebElement ad = d.findElement(By.xpath("//div[@class='nav-search-facade']"));
		
		//js.executeScript("arguments[0].scrollIntoView();", ad);
		js.executeScript("arguments[0].click()", ad);
		WebElement dr=d.findElement(By.xpath("//option[text()='Under ₹500']"));
		dr.click();
		Robot d1 = new Robot();
		d1.keyPress(KeyEvent.VK_ENTER);
		d1.keyRelease(KeyEvent.VK_ENTER);
		
		d.findElement(By.xpath("//span[text()='Electricity bill payment']")).click();
		
		//js.executeScript("arguments[0].scrollIntoView(true)", dr);
		
		
		
		
		
		
		
	}
}
		
