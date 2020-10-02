package com.browser;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AxisBank {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\GreensProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Dimension d=new Dimension(800,400);
		driver.manage().window().setSize(d);
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("Sindhuja");
	}
	

}
