package Steps;

import Pages.WhatsApp;
import com.opencsv.exceptions.CsvException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Base;

import java.io.IOException;

public class WhatsAppSteps extends Base {
    WhatsApp whatsapp = new WhatsApp();

    public WhatsAppSteps() throws IOException, CsvException {
    }


    @When("user enter code")
    public void userEnterCode() throws IOException {
        whatsapp.Login();
    }

    @And("go to home page")
    public void goToHomePage() {
        System.out.println("Go to home page");
    }

    @And("write a message")
    public void writeAMessage() {

    }

    @Then("send this message")
    public void sendThisMessage() {
    }
}
