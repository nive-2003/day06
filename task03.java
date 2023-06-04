package com.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class task03 {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
	     co.addArguments("--remote-allow-origins=*");
	     System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver(co);
	    driver.get("https://demo.wpeverest.com/user-registration/paypal-integration-form/");

	    Boolean Displayemail = driver.findElement(By.xpath("//*[@id=\"user_email\"]")).isDisplayed();
	    System.out.println("Element displayed is :"+Displayemail);
	    WebElement checkBoxElement = driver.findElement(By.xpath("//*[@id=\"multiple_choice_1641271687_CPU i5 8th Gen\"]"));
	    boolean isSelected = checkBoxElement.isSelected();
	    System.out.println(isSelected);
	    if(isSelected == false) {
	    	checkBoxElement.click();
	    }
	    
	    
	}

}
