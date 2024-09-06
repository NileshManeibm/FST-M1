package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;

    @BeforeClass
    public void beforeMethod(){
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        //Open browser
        driver.get("https://v1.training-support.net");
        Reporter.log("Browser Opened");
    }

    @Test
    public void homePageTest(){
        // Use getTitle() to get and print the title of the page
        System.out.println("Title is: " + driver.getTitle());
        // Make an assertion using assertEquals() to make sure the title of the page is "Training Support".
        Assert.assertEquals(driver.getTitle(), "Training Support");
        // Use findElement() to find the "About Us" Button on the page and click it.
        driver.findElement(By.id("about-link")).click();
        // Get and print the title of the new page.
        System.out.println("New Page Title is: " + driver.getTitle());
        // Assert the title of the new page.
        Assert.assertEquals(driver.getTitle(), "About Training Support");
        Reporter.log("About Us page loaded");
    }

    @AfterClass
    // Close the browser
    public void tearDown(){
        Reporter.log("Browser closed");
        driver.quit();
    }
}