package pages;

import enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;

public  class SwedBankMain extends BasePage {
    
    //WebElement headingSection = driver.findElement(By.id("small-loan-calculator"));
   // WebElement cookiesWindow = driver.findElement(By.class("ui"));

    WebElement swedLogo = driver.findElement(By.xpath("//img[@alt='Swedbank logo']"));
    WebElement fillout_application_button = driver.findElement(By.xpath("//*[@id='mainForm'] and text()='Täidan taotluse']"));
    WebElement acceptCookies = driver.findElement(By.xpath("//button[text()='Nõustun kõigi küpsistega']"));
    WebElement netIncome = driver.findElement(By.xpath("//*[@id='incomeOwner']"));
    WebElement generalTerms = driver.findElement(By.xpath("//p[@class='disclaimer' and text()='kliendiandmete töötlemise põhimõtetele']"));
    WebElement nextButtom = driver.findElement(By.xpath("//*[@id='B_next']"));
    WebElement articleHeading = driver.findElement(By.xpath("//div[@class='mainform']//h2"));
    String expectedheading_article = "Vajad lisaraha suuremateks ostudeks?";
    
//WebElement email = driver.findElement(By.xpath("//*[@id='exampleInputEmail1']"));
    /* private final By logout = By.xpath("//button[text()='Täidan taotluse']");
    private final By monthlyPayment = By.id("monthly-payment-result");
    private final By fillout_ApplicationButton = By.xpath("//button[text()='Täidan taotluse']");
    private final By nonRegisteredClientButton = By.id("allow-apply-action");
    */ 
    


    public void clickAcceptCookies(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
        swedLogo.click();
        acceptCookies.click();      
	}

  	public void headingText(){
        String heading = articleHeading.getText();
        Assert.assertEquals(expectedheading_article, articleHeading);
  	}   
      
    public void moveto_fillout_application_page() {
    fillout_application_button.click();
    } 
    public void filloutInitialForm(){
      //  password.clear();
      // executor.executeScript("arguments[0].click();",loginBtn);
      //  netIncome.sendKeys("2000");
        generalTerms.click();
        nextButtom.click();
    }


 /*   public void accept_Cookies() {
	 //   driver.manage().timeouts().implicitlyWait(10);
     //   driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
        elementHelper.clickElement(logout, "Welcome Section");
    }
 */
/*     public WebElement getLogo() {
        return wait.until(ExpectedConditions.visibilityOf(logo));
    }
    public void setLoanAmount(){
        username.clear();
        wait.until(ExpectedConditions.visibilityOf(username)).sendKeys("1000");
    }

    public String getLoanTitle() {
        return elementHelper.getText(headingSection, "Väikelaenu kalkulaator");
    }
 
    public String getWelcomeMessage() {
        return elementHelper.getText(logout, "Welcome Msg");
    } */
  

}
