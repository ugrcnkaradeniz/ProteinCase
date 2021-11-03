package com.ProteinTech.utilities;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;



public class BrowserUtils {
    public static void scrollToElement(WebElement element) {
        //I put for scrull to element
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

}
