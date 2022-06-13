package pages;

import enums.WaitStrategy;
import org.openqa.selenium.By;


public final class SwedbankHomePage extends BasePage {

  //  private final By homepageHeading = By.class("login-title");
    private final By welcomeSection = By.id("welcome");
    private final By loanMenuButton = By.xpath("//a[id()='nav-main'][5]");
    private final By small_loansubMenuButton = By.xpath("//a[id()='nav-main'][5]");
    
   

    public String getmainTitle() {
        return elementHelper.getText(welcomeSection, "Dashboard Title");
    }
    
  //  @Test(description = "Non-registered user is able to navigate to Small Loan Page")
    public void iOpensmallLoanPage() throws Throwable {

        elementHelper.clickElement(loanMenuButton, "Login Button");
       // return new iOpensmallLoanPage();
    }

}



