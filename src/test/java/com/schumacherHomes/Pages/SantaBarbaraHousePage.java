package com.schumacherHomes.Pages;

import com.schumacherHomes.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SantaBarbaraHousePage extends BasePage {

    @FindBy( xpath = "//h2[.='Virtual Tours']")
    private WebElement VirtualTours;

    @FindBy( xpath = "//h5[.='Self-Guided Tour']")
    private WebElement selfGuidedTour;

    @FindBy(xpath = "//h3[.='Self-Guided Tour']")
    private WebElement selfGuidedTourDashboard;

    public void clickSelfGuidedTour(){
        BrowserUtils.clickOnElement(selfGuidedTour);
    }

    public String getSelfGuidedTourDashBoardText(){
        return selfGuidedTourDashboard.getText();
    }



}
