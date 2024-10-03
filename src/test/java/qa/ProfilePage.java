package qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"R6429576507453769377\"]/div/div/div/div/div/div[2]/div[1]")
    private WebElement userInfo;
    
    @FindBy(xpath = "//*[@id=\"main-navbar-collapse\"]/div/div/ul/li[3]/a[1]")
    private WebElement iconBtn;

    @FindBy(xpath = "//*[@id=\"main-navbar-collapse\"]/div/div/ul/li[3]/ul/li[3]/a")
    private WebElement logoutBtn;

    public ProfilePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public String getUserInfo(){
        return userInfo.getText();
    }

    public void iconBtn(){
        iconBtn.click();
    }

    public void logout(){
        logoutBtn.click();
    }
}
