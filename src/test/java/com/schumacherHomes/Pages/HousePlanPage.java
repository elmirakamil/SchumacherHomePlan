package com.schumacherHomes.Pages;

import com.schumacherHomes.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HousePlanPage extends BasePage{

    @FindBy(xpath = "//a[@href='https://www.schumacherhomes.com/house-plans/santa-barbara/']")
    protected WebElement santaBarbaraHouse;

    public void clickSantaBarbaraHouse(){
        BrowserUtils.clickOnElement(santaBarbaraHouse);
    }



}
