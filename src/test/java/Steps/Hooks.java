package Steps;
import com.opencsv.exceptions.CsvException;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.example.Base;

import java.io.IOException;


public class Hooks extends Base {


    public Hooks()  {
    }

    @Before
    public void start () throws InterruptedException {
        LunchBrowser();
    }
//
//    @After
//    public void quit()
//    {
//        driver.quit();
//    }
}

