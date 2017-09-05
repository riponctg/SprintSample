package sprintHome;

import Base.CommonAPI;
import org.testng.annotations.Test;

/**
 * Created by smhoque on 9/4/17.
 */
public class sprint extends CommonAPI {
    @Test
    public void navigateToHome(){
        System.out.println(driver.getCurrentUrl());


    }
}
