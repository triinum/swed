package pages;

import org.openqa.selenium.By;


public class Small_loanPage extends BasePage {

 
   
	public void fillout_Loanform() {
		
		driver.findElement(By.id("email")).sendKeys("ll");
		driver.findElement(By.id("pass")).sendKeys("너의 페북 비번");
		driver.findElement(By.id("pass")).sendKeys("somehi");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

}
