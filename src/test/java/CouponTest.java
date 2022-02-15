import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import page_object.HeaderPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class CouponTest {
    WebDriver driver;
    HeaderPage header;

    @BeforeEach
    public void init() {
        driver = new ChromeDriver();// zdes proishodit inicializacija driver:
        HeaderPage header = new HeaderPage(driver); // sozdali object header na osnove class HeaderPage, v k-j podajom driver, k-j proincializirovan v class HeaderPage
        this.header = new HeaderPage(driver);

    }

    @Test
    public void applyCouponCode() {
        driver.get("http://shop.acodemy.lv/");
        header.searForAllProduct("Beanie");

    }
// zakrivaet stranicu posle operacij po testu:
    //@AfterEach
    //public void pageClose() {
        //driver.quit();
    //}
}
