package org.step;// ChromeOptions --> to handle browser level
// This program for chromeOptions 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOpt {
	 WebDriver driver;
		@Given("User launch the browser")
		public void user_launch_the_browser() {
	           WebDriverManager.chromedriver().setup();
	           driver = new ChromeDriver();
	           //Create obj for ChromeOptions
	           //Call method addArguments
               ChromeOptions options = new ChromeOptions();
               // In method declare "--disable-notification"--> To disable notify
               // Incognito--> for incognito mode in browser
               options.addArguments("--disable-notification");
               options.addArguments("-incognito-");
	           options.addArguments("-maximize-");
	           driver.get("https://www.facebook.com/");
	           driver.manage().window().maximize();

		}

		@When("User Login with Valid {string} and {string}")
		public void user_Login_with_Valid_and(String string, String string2) {
	            driver.findElement(By.id("email")).sendKeys(string);
	            driver.findElement(By.id("pass")).sendKeys(string2);

		}

}
