package org.informatorio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
	
	@Test
	public void firstTest() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		System.out.print("Page opened");
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.cssSelector("input"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		driver.quit();
	}
}
