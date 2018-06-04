package com.org.learningMaven.util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoadDrivers {
	public WebDriver initiallizeChromeDriver(String url) {
		System.out.println("Initializing ChromeDriver");
		System.setProperty("webdriver.chrome.driver","E:/Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		return driver;
	} 
}
