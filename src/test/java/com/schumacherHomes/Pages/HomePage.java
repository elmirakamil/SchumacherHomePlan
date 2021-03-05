package com.schumacherHomes.Pages;

import com.schumacherHomes.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(xpath = "//a[.='House Plans'] ")
    private WebElement housePlans;

    public void clickOnHousePlanTab(){
        BrowserUtils.clickOnElement(housePlans);

    }

}
