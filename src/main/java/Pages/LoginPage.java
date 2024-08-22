package Pages;
import com.opencsv.exceptions.CsvException;
import org.example.Base;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LoginPage extends Base {

    By Emaill =By.xpath("//input[@id='Email']");
    By PassWord=By.xpath("//input[@id='inputPassword']");
    By Login=By.xpath("//input[@id='btnLogin']");

    public LoginPage() throws IOException, CsvException {
    }


    public void LoginPageFun() {

        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Login")).click();
    }

    public void FillData(String username, String password)
    {

        driver.findElement(Emaill).sendKeys(username);
        driver.findElement(PassWord).sendKeys(password);
        driver.findElement(Login).click();
    }

    public void ToHome() {
        Assert.assertTrue(driver.findElement(By.xpath("//button[@id='createDynamicReports']")).isDisplayed());

    }


}
