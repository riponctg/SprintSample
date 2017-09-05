package ShopPageSearch;

import Base.CommonAPI;
import ShopPage.Shop;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by smhoque on 9/4/17.
 */
public class ShopSearch extends CommonAPI {
    @Test
    public void search(){
        Shop shop = PageFactory.initElements(driver, Shop.class);
        shop.searchShop();
<<<<<<< HEAD
        driver.navigate().back();
=======
        System.out.println("This is Sprint Shop Page");

>>>>>>> c036944f7228877664da12497a39cae57e9e8464
    }
}
