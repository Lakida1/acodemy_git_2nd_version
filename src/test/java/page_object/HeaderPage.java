package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPage {
    WebDriver driver;
    //costructor:
    public HeaderPage(WebDriver driver) {
        this.driver = driver;
    }

    public By searchFild = By.id("woocommerce-product-search-field-0");
    // sozdali class HeaderPage, tam objavili driverm ctobi on zapolnilsja s pomoscju constructora, pri sozdaniji novogo object v HeaderPage, budem podavat v nego driver, k-j proinicalizirovan
    //ukazali element i to kak budem ego nahodit (po ID)
    //sozdali Method, v k-j podajom nazvanije producta i v etom metode nahodim etot element (search.Field) i otpravlaem tuda imja producta, k-e prihodit iz classa, v k-j podaem eto znacenije
    //v etom ze metode clikaem na najdennij elemnt

    public void searForAllProduct(String nameOfProduct){
        driver.findElement(searchFild).sendKeys(nameOfProduct);
        driver.findElement(searchFild).submit();
    }
}
