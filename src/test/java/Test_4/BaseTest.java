package Test_4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils {
    @Test
    @BeforeMethod
    public void openBrowser(){
        System.setProperty("webdriver.gecko.driver","src\\Resources\\java\\Test_4\\DriverResources\\geckodriver.exe");
        driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.nopcommerce.com/");


    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
