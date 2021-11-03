package com.ProteinTech.pages;

import com.ProteinTech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {


    @FindBy(xpath = "//div//nav//a")    //I located List of Main tabs
    public List<WebElement> MainTabs;



    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    } //I put PageFacrory for using weblemets


    // I created this method for locate tabs one by one
    public WebElement Tabs(String tab){
        String xpath="//a[text()='"+tab+"']";

        return Driver.get().findElement(By.xpath(xpath));

    }


}
