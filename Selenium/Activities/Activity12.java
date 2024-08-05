package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12 {
    public static void main(String[] args)
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("Home page title: " + driver.getTitle());
        WebElement textbox=driver.findElement(By.id("input-text"));
        System.out.println("The textbox is:\t"+textbox.isEnabled());
        WebElement EnableButton=driver.findElement(By.id("toggleInput"));
        EnableButton.click();
        System.out.println("The textbox is:\t"+textbox.isEnabled());
        driver.close();
    }
}
