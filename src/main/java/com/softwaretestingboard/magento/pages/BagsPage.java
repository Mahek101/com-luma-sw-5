package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.Utilities.Utility;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BagsPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement overnightDuffle;


    public void clickOnOverNighDuffle() {
        clickOnElement(overnightDuffle);
        CustomListeners.test.log(Status.PASS,"Click on OverNightDuffle");
        Reporter.log("Clicking on OverNightDuffle " + overnightDuffle.toString());
    }

}
