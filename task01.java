package com.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class task01 {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
	     co.addArguments("--remote-allow-origins=*");
	     System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver(co);
	    driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
	    
	   driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
	}

}

