package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class Base
{

    public static WebDriver driver;
    public static void LunchBrowser() throws InterruptedException {
        By Icone =By.xpath("//header/div[2]/div[1]/span[1]/div[4]/div[1]/span[1]");
        By sendbar= By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/footer[1]/div[1]/div[1]/span[2]/div[1]/div[2]/div[1]/div[1]/div[1]/p[1]");
        By send_messages=By.xpath("//span[@data-icon='send']");
        By attachment= By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/footer[1]/div[1]/div[1]/span[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]");
        By image_input =By.xpath("//span[contains(text(),'Photos & videos')]");
        By caption =By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/span[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/p[1]");
        By send_image=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/span[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/span[1]");
        int  counter=0;
        String string="بنرحب بيك  ";

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        String csvFilePath = "src/main/resources/Contact.csv";
        List<Contact> contacts = CsvReader.readCsv(csvFilePath);

        for (Contact contact : contacts) {
            counter++;
            String name = contact.getName();
            String phoneNumber = contact.getPhoneNumber();

            String url = "https://web.whatsapp.com/send?phone="+phoneNumber;

            Thread.sleep(1000);
            driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));

            driver.get(url);

            Thread.sleep(1000);
            driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));

            driver.findElement(sendbar).sendKeys(  name+string);

            Thread.sleep(1000);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

            driver.findElement(send_messages).click();

            Thread.sleep(3000);
            driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));

            driver.findElement(attachment).click();
            driver.findElement(image_input).click();

            Thread.sleep(3000);
            driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));

            driver.findElement(caption).sendKeys("*تعالي اليوم الروحي*");

            Thread.sleep(3000);
            driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));

            driver.findElement(send_image).click();

            Thread.sleep(3000);
            driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));

            System.out.println("number of iterator is :"+counter);

        }



    }
}





