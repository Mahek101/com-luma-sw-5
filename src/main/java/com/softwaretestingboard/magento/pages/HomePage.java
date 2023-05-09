package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.Utilities.Utility;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Women')]")
    WebElement womenMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement tops;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement jackets;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-5']")
    WebElement menMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]")
    WebElement bottoms;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pants;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-6']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")
    WebElement gearMenu;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement bags;


    public void mouseHoverOnWomenMenu(){
        mouseHoverToElement(womenMenu);
        CustomListeners.test.log(Status.PASS,"Mouse hover on WomenMenu");
        Reporter.log("Mouse hover on WomenMenu" + womenMenu.toString());

    }
    public void mouseHoverOnTops(){
        mouseHoverToElement(tops);
        CustomListeners.test.log(Status.PASS,"Mouse hover on Tops");
        Reporter.log("Mouse hover on Tops" + tops.toString());
    }
    public void mouseHoverOnJacketsAndClick(){
        mouseHoverToElementAndClick(jackets);
        CustomListeners.test.log(Status.PASS,"Mouse hover and click on Jackets");
        Reporter.log("Mouse hover and click on Jackets" + jackets.toString());
    }
    public void mouseHoverOnMenMenu(){
        mouseHoverToElement(menMenu);
        CustomListeners.test.log(Status.PASS,"Mouse hover on MenMenu");
        Reporter.log("Mouse hover on MenMenu" + menMenu.toString());
    }
    public void mouseHoverOnBottoms(){
        mouseHoverToElement(bottoms);
        CustomListeners.test.log(Status.PASS,"Mouse hover on Bottoms");
        Reporter.log("Mouse hover on Bottoms" + bottoms.toString());
    }
    public void clickOnPants(){
        mouseHoverToElementAndClick(pants);
        CustomListeners.test.log(Status.PASS,"Mouse hover and click on Pants");
        Reporter.log("Mouse hover and click on Pants" + pants.toString());
    }
    public void mouseHoverOnGearMenu(){
        mouseHoverToElement(gearMenu);
        CustomListeners.test.log(Status.PASS,"Mouse hover on GearMenu");
        Reporter.log("Mouse hover on GearMenu" + gearMenu.toString());
    }
    public void mouseHoverOnBagsAndClick(){
        mouseHoverToElementAndClick(bags);
        CustomListeners.test.log(Status.PASS,"Mouse hover and click on Bags");
        Reporter.log("Mouse hover and click on Bags" + bags.toString());
    }
}


