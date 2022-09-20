package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {
    public WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @After
    public void close(){
        driver.close();
        driver.quit();
    }
}
