package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import utils.LocalDriverManager;
//
public class HeaderPage {
    WebDriver driver; //   private final WebDriver driver = LocalDriverManager.getInstance();

        public HeaderPage(WebDriver driver){
            this.driver = driver;
        }

    public By searchField = By.id("woocommerce-product-search-field-0");
    public void searchForAllProduct(String nameOfProduct){
        driver.findElement(searchField).sendKeys(nameOfProduct);
        driver.findElement(searchField).submit();
    }


}
