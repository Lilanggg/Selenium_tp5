import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
