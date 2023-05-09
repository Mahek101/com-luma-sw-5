package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.BagsPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.OverNightDufflePage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class GearTest extends BaseTest {


    HomePage homePage ;
    BagsPage bagsPage ;
    OverNightDufflePage overNightDufflePage ;
    ShoppingCartPage shoppingCartPage ;


    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        bagsPage = new BagsPage();
        overNightDufflePage = new OverNightDufflePage();
        shoppingCartPage = new ShoppingCartPage();

    }

    @Test(groups = {"sanity","regression"})
    public void userShouldAddProductSuccessFullyToShoppinCart(){
        homePage.mouseHoverOnGearMenu();
        homePage.mouseHoverOnBagsAndClick();
        bagsPage.clickOnOverNighDuffle();
        Assert.assertEquals(overNightDufflePage.getText(),"Overnight Duffle","Text is not displayed");
        overNightDufflePage.changeTheQuantity("3");
        overNightDufflePage.ckickOnAddToCart();
        Assert.assertEquals(overNightDufflePage.getActualText(),"You added Overnight Duffle to your shopping cart.","Text is not displayed");
        overNightDufflePage.clickOnShoppingCartLink();
        Assert.assertEquals(shoppingCartPage.getName(),"\"Overnight Duffle","Name is not displayed");
        Assert.assertEquals(shoppingCartPage.getQuantity(),3,"Quantity is not displayed");
        Assert.assertEquals(shoppingCartPage.getPrice(),"$135.00","Price is not displayed");
        shoppingCartPage.changeQuantityTo5("5");
        shoppingCartPage.updateShoppingCart();
        Assert.assertEquals(shoppingCartPage.verifyProductPrice(),"$225.00","Price is not displayed");
    }
}
