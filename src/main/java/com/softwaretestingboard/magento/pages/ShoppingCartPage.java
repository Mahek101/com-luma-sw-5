package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.Utilities.Utility;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement actualTextShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement size;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement colour;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement name;
    @CacheLookup
    @FindBy(xpath = "//input[@class='input-text qty'])[1]")
    WebElement quantity;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']")
    WebElement price;
    @CacheLookup
    @FindBy(xpath = "//input[@class='input-text qty'])[1]")
    WebElement changeQuantity;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateCart;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']")
    WebElement updatePrice;


    public String getActualText(){
        String text = getTextFromElement(actualTextShoppingCart);
        CustomListeners.test.log(Status.PASS, "Text On Page " + text);
        Reporter.log("Text On Page " + text);
        return text;
    }
    public String getProductName(){
        String productname = getTextFromElement(productName);
        CustomListeners.test.log(Status.PASS, "Product name On Page " + productName);
        Reporter.log("Product name On Page " + productName);
        return productname;
    }
    public int getSize(){
        int getsize = getNumberFromElement((By) size);
        CustomListeners.test.log(Status.PASS, "Total number of elements " + getsize);
        Reporter.log("Text number of elements" + getsize);
        return getsize;
    }
    public String getColour(){
        String getcolour = getTextFromElement(colour);
        CustomListeners.test.log(Status.PASS, "Colour is : " + getcolour);
        Reporter.log("Colour is : " + getcolour);
        return getcolour;

    }
    public String getName(){
        String getname = getTextFromElement(name);
        CustomListeners.test.log(Status.PASS, "Name of the Product is : " + getname);
        Reporter.log("Name of the Product is : " + getname);
        return getname;

    }
    public int getQuantity(){
        int getquantity = getNumberFromElement((By) quantity);
        CustomListeners.test.log(Status.PASS, "Total number of products are: " + getquantity);
        Reporter.log("Text number of products are: " + getquantity);
        return getquantity;
    }
    public String getPrice(){
        String getprice = getTextFromElement(price);
        CustomListeners.test.log(Status.PASS, "Price of the Product : " + getprice);
        Reporter.log("Price of the Product : " + getprice);
        return getprice;
    }
    public void changeQuantityTo5(String quantity){
        CustomListeners.test.log(Status.PASS,"Change quantity" + quantity);
        Reporter.log("Change quantity" + quantity + " to Quantity field " + changeQuantity.toString());
        sendTextToElement(changeQuantity,quantity);
    }
    public void updateShoppingCart(){
        clickOnElement(updateCart);
        CustomListeners.test.log(Status.PASS,"Click on Update Cart");
        Reporter.log("Click on Update Cart " + updateCart.toString());
    }

    public String verifyProductPrice(){
        String updateprice = getTextFromElement(updatePrice);
        CustomListeners.test.log(Status.PASS, "Update price of the Product : " + updateprice);
        Reporter.log("Update price of the Product : " + updateprice);
        return updateprice;
    }


}
