package qa;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import junit.framework.Assert;
import qa.configuration.Conf;

public class AppTest {
    private static WebDriver driver;
    private static LoginPage loginPage;
    private static MenuPage menuPage;
    private static ProfilePage profilePage;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", Conf.getProperty("chromedriver"));
        driver = new ChromeDriver();
        driver.get(Conf.getProperty("url"));
        loginPage = new LoginPage(driver);
        menuPage = new MenuPage(driver);
        profilePage = new ProfilePage(driver);
    }

    @Test
    public void loginTest(){
        loginPage.inputLogin(Conf.getProperty("isu"));
        loginPage.inputPasswd(Conf.getProperty("password"));
        loginPage.clickLoginBtn();
        menuPage.clickProfileBtn();
        System.out.println(Conf.getProperty("userIdentity"));
        Assert.assertEquals(Conf.getProperty("userIdentity"), profilePage.getUserInfo());
    }

    @AfterClass
    public static void stop(){
        profilePage.iconBtn();
        profilePage.logout();
        driver.quit();
    }
}
