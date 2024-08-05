package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Acitivity5 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/input-events");
        System.out.println(driver.getTitle());
            Actions act = new Actions(driver);
            act.click().pause(1000).build().perform();
        String frontText = driver.findElement(By.className("active")).getText();
        System.out.println(frontText);
        act.doubleClick().pause(1000).build().perform();
        frontText = driver.findElement(By.className("active")).getText();
        System.out.println(frontText);
        act.contextClick().pause(1000).build().perform();
        frontText = driver.findElement(By.className("active")).getText();
        System.out.println(frontText);
        driver.close();




    }

}
