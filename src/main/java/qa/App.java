package qa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        WebElement input = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        input.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement btn = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a"));
        btn.click();
        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("79170977178");
        
    }

}
