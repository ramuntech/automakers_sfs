package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.base.BasePage;

public class LoginPage extends BasePage {
	
	//locators
	By txtUserId = By.id("userid");
	By txtPassword = By.id("password");
	By btnLogin = By.id("login");
	
	public void performUserLogin(String userId, String password) {
		setText(txtUserId, userId);
		setText(txtPassword, password);
		click(btnLogin);
	}

}
