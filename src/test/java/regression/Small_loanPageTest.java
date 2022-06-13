package regression;

import annotations.CustomFrameworkAnnotations;
import base.BaseTest;
import com.github.javafaker.Faker;
import enums.TestCaseType;
import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.*;
import pages.SwedbankHomePage;
import pages.Small_loanPage;
import utils.StringDecodeImpl;


public final class Small_loanPageTest extends BaseTest {


    public void userIsAbleToNavigateToSmallLoanPage() throws Throwable{
        final SwedbankHomePage swedbankHomePage = new SwedbankHomePage();
        swedbankHomePage.iOpensmallLoanPage();
    }
}
