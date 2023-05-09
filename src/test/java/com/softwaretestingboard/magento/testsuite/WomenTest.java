package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.JacketsPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class WomenTest extends BaseTest {
    HomePage homepage ;
    JacketsPage jacketsPage = new JacketsPage();

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homepage = new HomePage();
        jacketsPage = new JacketsPage();
    }

    @Test(groups = {"sanity","regression"})
    public void verifyTheSortByProductNameFilter() {
        homepage.mouseHoverOnWomenMenu();
        homepage.mouseHoverOnTops();
        homepage.mouseHoverOnJacketsAndClick();
        jacketsPage.selectProductNameFilter("Product Name");
        Assert.assertEquals(jacketsPage.getProductList1(), jacketsPage.getProductList2());
    }

    @Test(groups = {"smoke","regression"})
    public void verifyTheSortByPriceFilter() {
        homepage.mouseHoverOnWomenMenu();
        homepage.mouseHoverOnTops();
        homepage.mouseHoverOnJacketsAndClick();
        jacketsPage.selectProductNameFilter("Price");
        Assert.assertEquals(jacketsPage.getPriceList1(), jacketsPage.getPriceList2());
    }
}
