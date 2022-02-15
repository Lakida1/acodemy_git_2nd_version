import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class CouponTest {
    WebDriver driver;

    @BeforeEach
    public void init() {
        driver = new ChromeDriver();
        //ChromeOptions chromeOptions = new ChromeOptions();
        //ChromeOptions.addArguments("--disable-logging");
        //driver = new ChromeDriver();
    }

    @Test
    public void applyCouponCode() {
        driver.get("http://shop.acodemy.lv/");
        driver.findElement(By.id("woocommerce-product-search-field-0")).sendKeys("Album");
        driver.findElement(By.id("woocommerce-product-search-field-0")).submit();
        // nize ta ze samaja zapis, no prisvoen ELEMENT searhField =
        //WebElement searchField = driver.findElement(By.id("woocommerce-product-search-field-0"));
//        searchField.sendKeys("Album");

       // zahodit na stranicu, nahodit Album, dobavlaet 1 pcs, zahodit v pole View cart:
      WebElement searchField = driver.findElement(By.id("woocommerce-product-search-field-0"));
       searchField.sendKeys("Album");
       searchField.submit();
       WebElement addToCartButton = driver.findElement(By.id("add-to-cart"));
       addToCartButton.click();
        WebElement viewCart = driver.findElement(By.linkText("View cart"));
        System.out.println();


    }
// zakrivaet stranicu posle operacij po testu:
    //@AfterEach
    //public void pageClose() {
        //driver.quit();
    //}
}
