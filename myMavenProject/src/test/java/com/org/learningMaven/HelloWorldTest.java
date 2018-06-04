package com.org.learningMaven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.org.learningMaven.util.LoadDrivers;

public class HelloWorldTest {
	
	private WebDriver wd;

	@Test
	public void OpenUrl() {
		LoadDrivers drivers = new LoadDrivers();
		wd = drivers.initiallizeChromeDriver("https://www.google.com");
		System.out.println(wd.getTitle());
		WebElement searchElement = wd.findElement(By.id("lst-ib"));
		searchElement.sendKeys("Pinaki Patra");
		searchElement.submit();
//		wd.close();
	}
	
	@Test
	public void loadSuggestions() {
		WebElement searchElement = wd.findElement(By.id("lst-ib"));
		searchElement.clear();
		searchElement.sendKeys("India");
//		searchElement.submit();
//		wd.close();
	}
	
}
