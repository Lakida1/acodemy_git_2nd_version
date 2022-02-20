import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import page_object.ProductPage;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import page_object.HeaderPage;
import page_object.HomePage;
import page_object.ProductPage;

import java.security.Key;
import java.util.List;

import static constants.Colors.BLUE;
import static constants.Product.CAP;
import static constants.Product.HOODIE;
import static org.hamcrest.MatcherAssert.assertThat;
//import page_object.HeaderPage;
//import page_object.HomePage;
//import utils.LocalDriverManager;

//import static page_object.ProductPage.HOODIE;
//import static constants.

@Slf4j
public class CouponTest{
    WebDriver driver;
    HeaderPage header;
    HomePage homePage;
    ProductPage productPage;


    @BeforeEach
    public void init(){

        driver = new ChromeDriver();// private final WebDriver driver = LocalDriverManager.getInstance();
        this.header = new HeaderPage(driver);
        this.homePage = new HomePage(driver);
        this.productPage = new ProductPage(driver);
    }
    @Test
            public void applyCoupon() {

        log.info("Step 1:");
        driver.get("http://shop.acodemy.lv/");
        log.info("Step 2" );
        homePage.clickOnProduct(HOODIE);
        log.info("Step 3:");
        productPage.selectColor(BLUE);
        log.info("Step 4  ");
        homePage.addToCart(HOODIE);

        }
//   @AfterEach
// public void closeDriver()
//   {driver.quit();}


        }
    //naiti element, nazat na nego. NE DLA PageObject proektorovanija
//        WebElement searchField = driver.findElement(By.id("woocommerce-product-search-field-0"));
//        searchField.sendKeys("album");
//        searchField.submit();
//        WebElement addCartButton = driver.findElement(By.name("add-to-cart"));
//        addCartButton.click();
//        WebElement viewCartButton = driver.findElement(By.linkText("View cart"));
//        viewCartButton.click();}


 //protis po vsem objectam, 2 metoda:

//        for (int i = 0; i < homePage.getAllProducts().size(); i++) {
//        if (homePage.getAllProducts().get(i).getText().contains("cap")){
//        homePage.getAllProducts().get(i).click();
//        }
//
//        for(WebElement product: homePage.getAllProducts())
//        {if(product.getText().contains("Cap"))
//        {
//        product.click();
//        }}