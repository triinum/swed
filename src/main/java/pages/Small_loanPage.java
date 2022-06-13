package pages;

import org.openqa.selenium.By;


public final class Small_loanPage extends BasePage {

 
    private final By usernameTxtBox = By.id("txtUsername");
    private final By passwordTxtBox = By.id("txtPassword");
    private final By loginButton = By.id("btnLogin");
    private final By loginPageTitle = By.id("logInPanelHeading");
    private final By invalidCredentials = By.id("spanMessage");
	
	public void fillout_Loanform() {
		
		driver.findElement(By.id("email")).sendKeys("너의 페북 아이디");
		driver.findElement(By.id("pass")).sendKeys("너의 페북 비번");
		driver.findElement(By.id("pass")).sendKeys("somehi");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

}
