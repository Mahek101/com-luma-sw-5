package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.Utilities.Utility;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class PantsPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement cronusYogaPant;
    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']")
    WebElement size32;
    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']")
    WebElement colourBlack;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement actualText;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCartLink;


    public void mouseHoverOnCronusYogaPant() {
        CustomListeners.test.log(Status.PASS, "Mouse hover on Cronus Yoga Pant");
        Reporter.log("Mouse hover on Cronus Yoga Pant" + cronusYogaPant.toString());
        mouseHoverToElement(cronusYogaPant);
    }

    public void clickOnSize32() {
        CustomListeners.test.log(Status.PASS, "Click on Size32");
        Reporter.log("Click on Size32" + size32.toString());
        mouseHoverToElementAndClick(size32);
    }

    public void clickOnBlackColour() {
        CustomListeners.test.log(Status.PASS, "Click on Black colour");
        Reporter.log("Click on Black colour" + colourBlack.toString());
        clickOnElement(colourBlack);
    }

    public void clickOnAddToCart() {
        CustomListeners.test.log(Status.PASS, "Click on Add to cart");
        Reporter.log("Click on Add to cart" + addToCart.toString());
        clickOnElement(addToCart);
    }

    public String getActualText() {
        String text = getTextFromElement(actualText);
        CustomListeners.test.log(Status.PASS, "Text On Page " + text);
        Reporter.log("Text On Page " + text);
        return text;
    }

    public void clickOnShoppingCartLink() {
        CustomListeners.test.log(Status.PASS, "Click on Shopping cart link");
        Reporter.log("Click on Shopping cart link" + shoppingCartLink.toString());
        clickOnElement(shoppingCartLink);
    }


}
