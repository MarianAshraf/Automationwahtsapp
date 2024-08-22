package Pages;
import org.example.Base;
import org.example.Contact;
import org.example.CsvReader;
import org.openqa.selenium.By;
import org.testng.Assert;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WhatsApp extends Base {


    By Icone =By.xpath("//header/div[2]/div[1]/span[1]/div[4]/div[1]/span[1]");
    By sendbar= By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/footer[1]/div[1]/div[1]/span[2]/div[1]/div[2]/div[1]/div[1]/div[1]/p[1]");
    By send_messages=By.xpath("//span[@data-icon='send']");
    By attachment= By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/footer[1]/div[1]/div[1]/span[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]");
    By image_input =By.xpath("//span[contains(text(),'Photos & videos')]");
    By caption =By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/span[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/p[1]");
    By send_image=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/span[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/span[1]");



    public void Login()  {
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        String csvFilePath = "src/main/resources/Contact.csv";
//        List<Contact> contacts = CsvReader.readCsv(csvFilePath);
//        for (Contact contact : contacts) {
//            System.out.println("mmmmmmmmmmmmmmmmmmmmmmm"+contact);
//            String name = contact.getName();
//            String phoneNumber = contact.getPhoneNumber();
//            String url = "https://web.whatsapp.com/send?phone="+phoneNumber;
//            driver.get(url);
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
//            Assert.assertTrue(driver.findElement(Icone).isDisplayed());
//            driver.findElement(sendbar).sendKeys("Hello  "+name);
//            driver.findElement(send_messages).click();
//            driver.findElement(attachment).click();
//            driver.findElement(image_input).click();
//            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//            driver.findElement(caption).sendKeys("*تعالي اليوم الروحي*");
//            driver.findElement(send_image).click();
//            driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
              System.out.println("hello");
        }


    }

