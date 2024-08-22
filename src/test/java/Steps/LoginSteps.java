package Steps;

import Pages.LoginPage;
import com.opencsv.exceptions.CsvException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Base;

import java.io.IOException;

public class LoginSteps extends Base
{
    LoginPage loginPage = new LoginPage();

    public LoginSteps() throws IOException, CsvException {
    }

    @Given("user open the website and go to login page")
    public void userOpenTheWebsiteAndGoToLoginPage() {
        loginPage.LoginPageFun();
    }

    @When("user fill {string} and {string} and click login")
    public void userFillAndAndClickLogin(String username, String password) {
        loginPage.FillData(username,password);
    }

    @Then("user should navigate to home page")
    public void userShouldNavigateToHomePage() {
        loginPage.ToHome();
    }



}
