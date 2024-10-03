package qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;

    @FindBy(xpath ="//*[@id=\"username\"]")
    private WebElement loginField;

    @FindBy(xpath = "//*[@id=\"kc-login\"]")
    private WebElement loginBtn;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement passwdField;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void inputLogin(String login){
        loginField.sendKeys(login);
    }

    public void inputPasswd(String password) {
        passwdField.sendKeys(password);
    }

    public void clickLoginBtn(){
        loginBtn.click();
    }
    

}
