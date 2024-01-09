package org.example;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver; // Or other browser driver
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

//    protected WebDriver driver;

    @BeforeTest
    public void  setup()    {
        /*System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();*/
        System.out.println("Printing: BeforeTest setup");
    }

    @AfterTest
    public void teardown() {
//        driver.quit();
        System.out.println("Printing: AfterTest setup");
    }
}
