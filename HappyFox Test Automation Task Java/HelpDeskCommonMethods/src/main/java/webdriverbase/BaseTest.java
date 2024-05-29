package webdriverbase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
    	// We have mentioned the chrome driver Path Explicitly on line 15 under the BeforeSuite method.Try Using user.dir property to get the home directory location.
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Desktop\\D drive\\automation\\Chrome driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    
    @AfterSuite
    public void afterSuite() {
        if(null != driver) {
            driver.close();
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}


