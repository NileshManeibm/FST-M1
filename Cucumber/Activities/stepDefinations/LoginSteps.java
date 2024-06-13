package stepDefinations;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginSteps extends BaseClass{

    @BeforeAll
    public static void setup(){
        WebDriverManager.firefoxdriver().setup();
        driver =new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @Given("User should be on login page")
    public void openPage()
    {

        driver.get("https://v1.training-support.net/selenium/login-form");
        Assertions.assertEquals("Login Form",driver.getTitle());
    }
    @When("the user enters username and Password")
    public void enterCrediancial (){
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
    }
    @And("click the login button")
    public void clickSubmit(){

        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Then("get the confirmation text and verify message")
    public void confirmMessage()
    {
        String message =driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message is: " + message);
    }

    @Given("User should be on login page")
    public void openPage1()
    {
        driver.get("https://v1.training-support.net/selenium/login-form");
        Assertions.assertEquals("Login Form",driver.getTitle());
    }
    @When("the user enters {string} and {string}")
    public void enterCrediancial (String Username, String Password){


        driver.findElement(By.id("username")).sendKeys(Username);
        driver.findElement(By.id("password")).sendKeys(Password);
    }
    @And("click the login button")
    public void clickSubmit1(){
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Then("get the confirmation text and verify message as {string}")
    public void confirmMessage1()
    {
        String message =driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message is: " + message);
    }


    @AfterAll
    public static void closeTheBrowser()
    {
        driver.quit();
    }

}
