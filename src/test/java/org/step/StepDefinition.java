package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
    WebDriver driver;
	@Given("User launch the browser")
	public void user_launch_the_browser() {
           WebDriverManager.chromedriver().setup();
           driver = new ChromeDriver();
           driver.get("https://www.facebook.com/");
           driver.manage().window().maximize();

	}

	@When("User Login with Valid {string} and {string}")
	public void user_Login_with_Valid_and(String string, String string2) {
            driver.findElement(By.id("email")).sendKeys(string);
            driver.findElement(By.id("pass")).sendKeys(string2);

	}


}
