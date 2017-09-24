import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Will on 24/09/2017.
 */
public class FirefoxBrowserLoginTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "src//test//Drivers//geckodriver");

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("https://ie.yahoo.com/?p=us");
    }
}
