package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity1 {
AndroidDriver driver;

@BeforeClass
    public void setUp() throws MalformedURLException {
    UiAutomator2Options caps = new UiAutomator2Options()
            .setPlatformName("Android")
            .setAutomationName("UiAutomator2")
            .setAppPackage("com.miui.calculator")
            .setAppActivity(".cal.CalculatorActivity")
            .noReset();

    //set url
    URL serverURL = new URL("http://localhost:4723/wd/hub");
    //initialise driver
    driver = new AndroidDriver(serverURL, caps);
}

    @Test
    public void multiplyTest()
    {
        driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_7_s")).click();
        driver.findElement(AppiumBy.accessibilityId("multiply")).click();

        driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_6_s")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();

        //assertion
        String result = driver.findElement(AppiumBy.id("com.miui.calculator:id/result")).getText();
        Assert.assertEquals(result, "= 42");


    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

}
