package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.*;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class MenTest extends BaseTest {

    HomePage homePage ;
    PantsPage pantsPage ;
    ShoppingCartPage shoppingCartPage ;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        pantsPage = new PantsPage();
        shoppingCartPage = new ShoppingCartPage();
    }

    @Test(groups = {"sanity","regression"})
    public void userShouldAddProductSuccessFullyToShoppinCart() throws InterruptedException {
        homePage.mouseHoverOnMenMenu();
        Thread.sleep(1000);
        homePage.mouseHoverOnBottoms();
        Thread.sleep(1000);
        homePage.clickOnPants();
        Thread.sleep(1000);
        pantsPage.mouseHoverOnCronusYogaPant();
        pantsPage.clickOnSize32();
        pantsPage.clickOnBlackColour();
        pantsPage.clickOnAddToCart();
        Assert.assertEquals(pantsPage.getActualText(),"You added Cronus Yoga Pant to your shopping cart.","Text is not displayed");
        pantsPage.clickOnShoppingCartLink();
        Assert.assertEquals(shoppingCartPage.getActualText(),"Shopping Cart","Text is not displayed");
        Assert.assertEquals(shoppingCartPage.getProductName(),"Cronus Yoga Pant","Product name is not displayed");
        Assert.assertEquals(shoppingCartPage.getSize(),32,"Size is not displayed");
        Assert.assertEquals(shoppingCartPage.getColour(),"Black","Colour is not displayed");
    }
}
