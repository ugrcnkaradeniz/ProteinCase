package com.ProteinTech.step_definitions;


import com.ProteinTech.pages.DashBoardPage;
import com.ProteinTech.utilities.BrowserUtils;
import com.ProteinTech.utilities.ConfigurationReader;
import com.ProteinTech.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Set;


public class MyStepdefs {

    String firstTitle;

    @Given("navigates to url")
    public void navigatesToUrl() {

        Driver.get().get(ConfigurationReader.get("url"));
        
    }

    @And("verify user can see main tabs")
    public void verifyUserCanSeeMainTabs() {
        DashBoardPage dashBoardPage=new DashBoardPage();
        //I use is.Displayed() method for verify main tabs,I used list of MainTabs webelement
        for(int a=0;a<dashBoardPage.MainTabs.size();a++){
            Assert.assertTrue(dashBoardPage.MainTabs.get(a).isDisplayed());
        }
    }

    @And("click to {string} tabs")
    public void clickToTabs(String tab) {
        //whatever it says in the tab parameters the system clicks on it
        new DashBoardPage().Tabs(tab).click();
    }


    @Then("verify that the {string} is opened")
    public void verifyThatTheIsOpened(String tab) throws InterruptedException {
        Thread.sleep(2000);
        String expectResult="active"; //when I click to tab active attribute should displayed
        String actualResult=new DashBoardPage().Tabs(tab).getAttribute("active");
        Assert.assertEquals(expectResult,actualResult);
    }

    @When("scroll down to the page")
    public void scrollDownToThePage() throws InterruptedException {
        //for scroll down I used scrollToElement method from BrowserUtils
        //scroll to until Open Roles section is present
        BrowserUtils.scrollToElement(new DashBoardPage().openRolesPage);
        Thread.sleep(2000);

    }

    @Then("verify Open roles section is present")
    public void verifyOpenRolesSectionIsPresent() {


        Assert.assertTrue(new DashBoardPage().openRolesPage.isDisplayed());
    }

    @Then("verify that {string} position is under the Software Development section")
    public void verifyThatPositionIsUnderTheSoftwareDevelopmentSection(String position) {

        //I stored all position under Sosteware Development
        String allposition=new DashBoardPage().SoftwareDevelopmentSection.get(0).getText();
        Assert.assertTrue(allposition.contains(position));



    }

    @And("click to {string} section")
    public void clickTo(String sds) {

        firstTitle=Driver.get().getTitle();
        new DashBoardPage().SDSections(sds).click();


    }

    @Then("verify the new tab is opened")
    public void verifyTheNewTabIsOpened() {

        //I use for handle multiple window
        String WindowHandle= Driver.get().getWindowHandle();
        Set<String> WindowHandles = Driver.get().getWindowHandles();
        for (String Handle : WindowHandles) {
            if(!Handle.equals(WindowHandle)){
                Driver.get().switchTo().window(Handle);
            }

        }

        String SecondTitle=Driver.get().getTitle();
        Assert.assertFalse(firstTitle.equals(SecondTitle));





    }





}
