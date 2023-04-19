package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    String baseUrl = ""; // Set up the browser
    public static WebDriver driver;

    public void openWeb(String baseUrl) {

        driver = new ChromeDriver();
        driver.get(baseUrl);


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Time out

        driver.close(); //Browser close
    }
}
