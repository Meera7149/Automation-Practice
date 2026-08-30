package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

@FindBy(xpath="//*[@id='sign_in_username_email']") WebElement user_name;
@FindBy(xpath="//*[@id='sign_in_password']") WebElement password;
@FindBy(xpath="//*[@data-target='#profileModal']") WebElement signin;
@FindBy(xpath="//*[@class=\"btn btn-lightyellow btn-minwidth\"]") WebElement ok_button;

public Login(WebDriver driver) {
	
	PageFactory.initElements(driver,this);
	//Pages
	//testing
}

public void username_enter(String username) {
	user_name.sendKeys(username);
}
public void password_enter(String password_entered) {
	password.sendKeys(password_entered);
}
public void signin_click() {
	signin.click();
}
public void ok_click() {
	ok_button.click();

}
}
