package com.selenium;

import java.awt.datatransfer.SystemFlavorMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LounchBrowser {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.airvistara.com/in/en");
	driver.manage().window().maximize();
	String actual_title=driver.getTitle();
	String expected_title="Book Flights & Check In Online | Vistara";
	if (actual_title.equals(expected_title))
	{
		System.out.println("Test Case is Pass");
	}
	else {
		System.out.println("Test case is Fail");
      }
	System.out.println("Test case is Fail");
}
}

