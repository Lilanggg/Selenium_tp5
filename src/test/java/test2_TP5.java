import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

public class test2_TP5 {

    WebDriver driver;

    @Before
    public void init(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver. get("http://www.amazon.fr");
    }

    @Test
    public void test1(){
        Actions action = new Actions(driver);
        WebElement categorie = driver.findElement(By.id("nav-link-shopall"));
        action.moveToElement(categorie).perform();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[data-nav-panelkey='VideogamesConsolesPanel']")));
        action.moveToElement(driver.findElement(By.cssSelector("span[data-nav-panelkey='VideogamesConsolesPanel']"))).perform();
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Nintendo Switch")));
        WebElement nintendo = driver.findElement(By.linkText("Nintendo Switch"));
        nintendo.click();
        
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
