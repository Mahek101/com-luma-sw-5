package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.Utilities.Utility;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OverNightDufflePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement actualTextOverNightDuffle;
    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement changeQuantity;
    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement actualText;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;


    public String getText() {
        String text = getTextFromElement(actualTextOverNightDuffle);
        CustomListeners.test.log(Status.PASS, "Text On Page " + text);
        Reporter.log("Text On Page " + text);
        return text;
    }

    public void changeTheQuantity(String quantity) {
        driver.findElement((By) changeQuantity).clear();
        CustomListeners.test.log(Status.PASS, "Change the Quantity " + changeQuantity);
        Reporter.log("Change the Quantity" + quantity + " To " + changeQuantity);
        sendTextToElement(changeQuantity, quantity);
    }

    public void ckickOnAddToCart() {
        CustomListeners.test.log(Status.PASS, "Click on add to cart");
        Reporter.log("Click on add to cart" + addToCart.toString());
        clickOnElement(addToCart);
    }

    public String getActualText() {
        String text2 = getTextFromElement(actualText);
        CustomListeners.test.log(Status.PASS, "Text On Page " + text2);
        Reporter.log("Text On Page " + text2);
        return text2;
    }

    public void clickOnShoppingCartLink() {
        CustomListeners.test.log(Status.PASS, "Click on Shopping Cart");
        Reporter.log("Click on Shopping Cart" + shoppingCart.toString());
        clickOnElement(shoppingCart);
    }

}
