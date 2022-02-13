import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class CouponTest {
    WebDriver driver;
    @BeforeEach
    public void init()
    {    driver = new ChromeDriver();
        //ChromeOptions chromeOptions = new ChromeOptions();
        //ChromeOptions.addArguments("--disable-logging");
        driver = new ChromeDriver();
    }
    @Test
    public void applyCouponCode() {
        driver.get("http://shop.acodemy.lv/");
       driver.getTitle();
       System.out.println(driver.getTitle());
        //assertThat(driver.getTitle(),equals("Online shop – acodemy – Just another WordPress site"));
        //assertThat(driver.getTitle(),equals("123"));
        //assertThat(driver.getTitle(),containsString("Online Shop"));
    }
    @AfterEach
    public void pageClose() {
        driver.quit();}
}
