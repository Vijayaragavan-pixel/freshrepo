package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature",glue= {"demo1"},
monochrome = true,
plugin = {"pretty", "html:target/HtmlReports"})

public class paraBank {

}
