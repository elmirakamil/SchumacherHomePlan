package com.schumacherHomes.stepDefinitions;

import com.schumacherHomes.Pages.HomePage;
import com.schumacherHomes.Pages.HousePlanPage;
import com.schumacherHomes.Pages.SantaBarbaraHousePage;
import com.schumacherHomes.utilities.ConfigurationReader;
import com.schumacherHomes.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

public class HousePlanVirtualTourStepDefinitions {

    HomePage homePage = new HomePage();
    HousePlanPage housePlanPage = new HousePlanPage();
    SantaBarbaraHousePage santaBarbaraHousePage = new SantaBarbaraHousePage();


    @Given("user in the homePage")
    public void user_in_the_home_page() {

        System.out.println("::: Starting Automation:::");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("user clicks the HOUSE PLANS navigation tab")
    public void userClicksTheHOUSEPLANSNavigationTab() {
        homePage.clickOnHousePlanTab();
    }

    @And("user clicks any house in the page")
    public void userClicksAnyHouseInThePage() {
          housePlanPage.clickSantaBarbaraHouse();

    }


    @And("user clicks Self-Guided Tour in Virtual Tours session")
    public void userClicksSelfGuidedTourInVirtualToursSession() {
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("window.scrollBy(0,500)");
        santaBarbaraHousePage.clickSelfGuidedTour();

    }

    @Then("Self-Guided Tour content shows up, user able to see house's 3D interior")
    public void selfGuidedTourContentShowsUpUserAbleToSeeHouseSDInterior() throws InterruptedException {
        String expectedText = "Self-Guided Tour";
        String actualText = santaBarbaraHousePage.getSelfGuidedTourDashBoardText();

        Assert.assertEquals("Test Failed!!!", expectedText, actualText);
        System.out.println("Good job Nurbiye!");

        Thread.sleep(3000);
        Driver.closeDriver();

    }
}
