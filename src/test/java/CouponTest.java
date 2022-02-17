import constants.Products;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import page_object.HeaderPage;
import page_object.HomePage;

import static constants.Products.HOODIE;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
@Slf4j
public class CouponTest {
    WebDriver driver;
    HeaderPage header;
    HomePage homePage;

    @BeforeEach
    public void init() {
        driver = new ChromeDriver();// zdes proishodit inicializacija driver:
        HeaderPage header = new HeaderPage(driver); // sozdali object header na osnove class HeaderPage, v k-j podajom driver, k-j proincializirovan v class HeaderPage
        this.header = new HeaderPage(driver);
        this.homePage = new HomePage(driver);
    }

    @Test
    public void applyCouponCode() {
        log.info("Step 1: user open Web page");
        driver.get("http://shop.acodemy.lv/");

        log.info("Step 2: User select product by product name" + HOODIE);
        homePage.clickOnProduct("Hoodie");

        log.info("Step 3: user select color of product");
        homePage.selectColor("Green");

        log.info("Step 4: user select a logo");

        log.info("Step 5: user cancel first color");

        log.info("Step 6: user select new color of product"); // net info na kakih cvetah vozmozno vibrat logo - esli netu logo, to 2-e pole dolzno stat neaktivnim

        log.info("Step 7: user select quantity of product");

        System.out.println("123");
    }


// zakrivaet stranicu posle operacij po testu:
//    @AfterEach
//    public void pageClose() {
//    driver.quit();
//    }
}
