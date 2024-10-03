package qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {
    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"main-menu-inner\"]/ul[1]/li[2]/a")
    private WebElement profileBtn;

    public MenuPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickProfileBtn(){
        profileBtn.click();
    }
}

