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
        swedBankMain.headingText();
        swedBankMain.filloutInitialForm();
    }
}
