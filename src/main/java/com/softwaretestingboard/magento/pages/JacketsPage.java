package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.Utilities.Utility;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JacketsPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//div[2]//div[3]//select[1]")
    WebElement productFilter;
    @CacheLookup
    @FindBy(xpath = "//strong[@class = 'product name product-item-name']")
    WebElement nameList1;
    @CacheLookup
    @FindBy(xpath = "//strong[@class = 'product name product-item-name']")
    WebElement nameList2;
    @CacheLookup
    @FindBy(xpath = "//span[@class='price-container price-final_price tax weee']")
    WebElement priceList1;
    @CacheLookup
    @FindBy(xpath = "//span[@class='price-container price-final_price tax weee']")
    WebElement priceList2;


    public ArrayList<String> getProductList1() {
        List<WebElement> beforeFilterProductList = driver.findElements((By) nameList1);
        ArrayList<String> beforeFilterProductList1 = new ArrayList<>();
        for (WebElement list : beforeFilterProductList) {
            beforeFilterProductList1.add(String.valueOf(list.getText()));
        }
        Collections.sort(beforeFilterProductList1);
        CustomListeners.test.log(Status.PASS,"Product List 1 ");
        Reporter.log("Product List 1 " + beforeFilterProductList1.toString());
        return beforeFilterProductList1;
    }

    public void selectProductNameFilter(String filterName) {
        selectByVisibleTextFromDropDown(productFilter, filterName);
    }

    public ArrayList<String> getProductList2() {
        List<WebElement> afterFilterProductList = driver.findElements((By) nameList2);
        ArrayList<String> afterFilterProductList1 = new ArrayList<>();
        for (WebElement list1 : afterFilterProductList) {
            afterFilterProductList1.add(String.valueOf(list1.getText()));
        }
        CustomListeners.test.log(Status.PASS,"Product List 2 ");
        Reporter.log("Product List 2 " + afterFilterProductList1.toString());
        return afterFilterProductList1;
    }


    public ArrayList<String> getPriceList1() {
        List<WebElement> beforeFilterPriceList = driver.findElements((By) priceList1);
        ArrayList<String> beforeFilterPriceList1 = new ArrayList<>();
        for (WebElement list1 : beforeFilterPriceList) {
            beforeFilterPriceList1.add(String.valueOf(list1.getText()));
        }
        Collections.sort(beforeFilterPriceList1);
        CustomListeners.test.log(Status.PASS,"Price List 1 ");
        Reporter.log("Price List 1 " + beforeFilterPriceList1.toString());
        return beforeFilterPriceList1;
    }

    public ArrayList<String> getPriceList2() {
        List<WebElement> afterFilterPricetList = driver.findElements((By) priceList2);
        ArrayList<String> afterFilterPriceList1 = new ArrayList<>();
        for (WebElement list1 : afterFilterPricetList) {
            afterFilterPriceList1.add(String.valueOf(list1.getText()));
        }
        CustomListeners.test.log(Status.PASS,"Price List 2 ");
        Reporter.log("Price List 2 " + afterFilterPriceList1.toString());
        return afterFilterPriceList1;
    }

}
