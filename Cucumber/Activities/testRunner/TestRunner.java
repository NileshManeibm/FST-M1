package testRunner;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/java/Features",
        glue = {"stepDefinations"},
        tags = "@activity4",
        publish = true,
        plugin= {"html:src/reports/HTML_Report.html"
        }



)
public class TestRunner {

}
