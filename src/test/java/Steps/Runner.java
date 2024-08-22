package Steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/WhatsApp.feature", glue = "Steps",
        plugin = {"pretty", "html:target/reports/report.html"}, tags = "@whatsapp"
)

public class Runner  {
}
