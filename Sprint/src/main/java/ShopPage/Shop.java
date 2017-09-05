package ShopPage;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by smhoque on 9/4/17.
 */
public class Shop extends CommonAPI {
    @FindBy(how = How.CSS, using = ".sprint-menu > li:nth-child(1) > a:nth-child(1) > span:nth-child(1)")
    public static WebElement elementShop;

    public void searchShop(){
        elementShop.click();
    }
}
