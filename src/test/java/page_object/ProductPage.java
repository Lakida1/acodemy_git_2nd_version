package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//import utils.LocalDriverManager;

import java.util.List;

public class ProductPage {

    WebDriver driver; // private final WebDriver driver = LocalDriverManager.getInstance();

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }
    public void selectColor (String color)
    {
         final By colorSelect = By.id("pa_color");
        Select sColor = new Select(driver.findElement(colorSelect));
        sColor.selectByVisibleText(color);

    }
}
