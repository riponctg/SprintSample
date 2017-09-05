package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

/**
 * Created by smhoque on 9/4/17.
 */
public class CommonAPI {

    public WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void  setUp(String url){
        System.setProperty("webdriver.chrome.driver", "/Users/smhoque/IdeaProjects/SprintSample/Generic/Driver/chromedriver-2");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
