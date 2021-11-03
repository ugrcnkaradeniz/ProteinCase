package com.ProteinTech.pages;

import com.ProteinTech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashBoardPage extends BasePage{

    //I created for  getting properties from abstract class

    @FindBy(xpath = "//section//div[@class='OpenRules_Content__4hkeW']")
    public WebElement openRolesPage;  //I located Open roles page

    @FindBy(xpath = "//b[text()='Software Development']/..")
    public List<WebElement> SoftwareDevelopmentSection;

    //I created this method for locate all section one by one
    public WebElement SDSections(String section){
        String xpath="//a[text()='"+section+"']";

        return Driver.get().findElement(By.xpath(xpath));

    }
}
