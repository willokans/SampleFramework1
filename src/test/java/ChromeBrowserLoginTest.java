

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Will on 24/09/2017.
 */
public class ChromeBrowserLoginTest {

    WebDriver driver = null;
    public static final String File_Log4j = "src//test/Properties//log4j2.properties";
    Logger logger = Logger.getLogger("ChromeBrowserLoginTest");




    @BeforeClass
    public void beforeClassSetup() {
        System.setProperty("webdriver.chrome.driver", "src//test//Drivers//chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Configure log4j properties file
        PropertyConfigurator.configure(File_Log4j);

    }

    @Test
    public void LogIn() throws InterruptedException {

        driver.get("https://ie.yahoo.com/?p=us");
        logger.info("Open broswer");

        driver.findElement(By.id("uh-signin")).click();
        logger.info("Click on login button");
        Thread.sleep(3000);

        WebElement emailTextbx = driver.findElement(By.id("login-username"));
        emailTextbx.click();
        emailTextbx.clear();
        emailTextbx.sendKeys("willokans@yahoo.com");
        logger.info("Enter email address into inbox");
        Thread.sleep(3000);

        WebElement loginbtn = driver.findElement(By.id("login-signin"));
        loginbtn.click();
        logger.info("Clicked Login btn");
        Thread.sleep(3000);


        logger.info("Open broswer");
        Thread.sleep(2000);
        logger.info("Open broswer");
        Thread.sleep(2000);
        logger.info("Open broswer");
        Thread.sleep(2000);
        logger.info("Open broswer");
        Thread.sleep(2000);
        logger.info("Open broswer");
        Thread.sleep(2000);
        logger.info("Open broswer");
        Thread.sleep(2000);
        logger.info("Open broswer");
        Thread.sleep(2000);
        logger.info("Open broswer");
        logger.info("Open broswer");
        Thread.sleep(2000);
        logger.info("Open broswer");


        Thread.sleep(5000);
    }

    @Test
    public void closeBrowser() throws InterruptedException {
        logger.info("Close broswer");
        Thread.sleep(2000);
        driver.close();
    }

    @AfterClass
    public void tearDown() throws InterruptedException {

        driver.quit();
        logger.info("Quit broswer");
        Thread.sleep(2000);
        logger.info("Quit broswer");
        Thread.sleep(2000);
        logger.info("Quit broswer");
        Thread.sleep(2000);
        logger.info("Quit broswer");
        Thread.sleep(2000);
        logger.info("Quit broswer");
    }

}
