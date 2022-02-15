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

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

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
        driver.get("http://shop.acodemy.lv/");
        homePage.clickOnProduct("Hoodie");
        homePage.selectColor("Green");
        System.out.println("123");
    }
//        homePage.getAllProducts();
//        for (int i = 0; i < homePage.getAllProducts().size(); i++) {
//            {if (homePage.getAllProducts().get(i).getText().contains("Cap")) {
//                    homePage.getAllProducts().get(i).click();}}}

        //analogicnaja zapis (to cto vise):
//        for (WebElement product: homePage.getAllProducts())
//              {if (product.getText().contains("Cap"))
//              {product.click();}
//                  break;}


// zakrivaet stranicu posle operacij po testu:
    //@AfterEach
    //public void pageClose() {
    //driver.quit();
    //}
}
