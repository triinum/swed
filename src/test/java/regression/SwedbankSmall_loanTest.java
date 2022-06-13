package fillout_loanform;

import annotations.CustomFrameworkAnnotations;
import base.BaseTest;
import com.github.javafaker.Faker;
import enums.TestCaseType;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.SwedBankMain;
import pages.SwedbankSmall_loan;
import utils.StringDecodeImpl;

public class SwedbankSmall_loanTest extends BaseTest {


    // driver.manage().window().maximize();

  
    @CustomFrameworkAnnotations(testCaseType = TestCaseType.FUNCTIONAL, testCaseModule = "Login")
  //  @Test(testName = "Validate login with invalid credentials", dataProvider = "getUsernameAndPassword", groups = {"regression"})
    @Test(testName = "Navigate to small loan application form", groups = {"fillout_loanform"})
    public void mainPagetoloanPage() {
        SwedBankMain swedBankMain = new SwedBankMain();
        swedBankMain.clickAcceptCookies();
        swedBankMain.filloutInitialForm();
        }
//                .filloutInitialForm()
  //              .setLoanAmount(); 
   
}

/*   //  @CustomFrameworkAnnotations(testCaseType = TestCaseType.INTEGRATION, testCaseModule = "Login")
    @Test(testName = "Fill out loan form", groups = {"fillout_loanform"})
    public void validateLogin() {
        String welcomeText = new SwedbankSmall_loan().loginToHRMPortal("Admin", adminPassword).getWelcomeMessage();
        Assertions.assertThat(welcomeText)
                .containsIgnoringCase("welcome");

    }

    @CustomFrameworkAnnotations(testCaseType = TestCaseType.E2E, testCaseModule = "Login")
    @Test(testName = "Valdate login-logout operation in the OrangeHRM", groups = {"fillout_loanform"})
    public void validateLoginLogoutOperation() {
        new SwedbankSmall_loan().loginToHRMPortal("Admin   ", adminPassword).getWelcomeMessage();

        String loginPageTitle = new SwedBankMain().logout().getLoginPageTitle();
        Assertions.assertThat(loginPageTitle)
                .as("Object is Null").isNotNull()
                .as("It doesn't contain expected text").containsIgnoringCase("LOGIN Panel");

    }

    @CustomFrameworkAnnotations(testCaseType = TestCaseType.FUNCTIONAL, testCaseModule = "Login")
    @Test(testName = "Validate login with invalid credentials", dataProvider = "getUsernameAndPassword", groups = {"regression"})
    public void validateLoginWithInvalidCredentials(String username, String pwd) {
        new SwedbankSmall_loan().loginToHRMPortal(username, pwd);
        Boolean errorMessageIsDisplayed = new SwedbankSmall_loan().checkInvalidCredentialsErrorMessage();
        Assertions.assertThat(errorMessageIsDisplayed)
                .isTrue();

        String actualErrorMessage = new SwedbankSmall_loan().getInvalidCredentialsErrorMessage();
        Assertions.assertThat(actualErrorMessage)
                .containsIgnoringCase("Invalid credentials");
    }


    public void userIsAbleToNavigateToAuthenticationPage() {
        openStartPage().navigateToAuthenticationPage();
    }

    @Test(description = "User is able to create account")
    public void userIsAbleToCreateAccount() {
        User user = new UserBuilder().build();
        openStartPage()
                .navigateToAuthenticationPage()
                .navigateToCreateAccountPage(user.getEmail())
                .fillAccountInfo(user)
                .register();
    }

    public void userIsAbleToNavigateToAuthenticationPage() {
        openStartPage().navigateToAuthenticationPage();
    }
 */


