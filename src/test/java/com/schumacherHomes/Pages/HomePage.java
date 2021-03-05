package com.schumacherHomes.Pages;

import com.schumacherHomes.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage {

    @FindBy(xpath = "(//li[@class='has-mega'])[1]")
    protected WebElement housePlans;


    public void clickOnHousePlanTab(){
//        List<WebElement> tabsList = housePlans.findElements(By.tagName("li"));
//        for (WebElement li : tabsList) {
//            if (li.getText().equals("House Plans")){
//                li.click();
//            }
//        }
      BrowserUtils.clickOnElement(housePlans);
        //housePlans.click();
    }

}
