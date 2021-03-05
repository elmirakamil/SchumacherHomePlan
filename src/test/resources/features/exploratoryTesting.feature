
@ExploratoryTest
  Feature: User can enjoy watching whole house plans

    Scenario:User can able to click "HOUSE PLANS" in homePage and scroll down to enjoy Virtual Tours
      Given user in the homePage
      When user clicks the "HOUSE PLANS" navigation tab
      And user clicks any house in the page
      And user scrolls down to that house page
      And user clicks "Self-Guided Tour" in "Virtual Tours" session
      Then "Self-Guided Tour" window shows up, user able to see house's 3D interior


      #Challange: validate if self-Guided Tour is playing after clicking play button

