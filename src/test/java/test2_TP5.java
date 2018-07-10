import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.WeakHashMap;

public class test2_TP5 {

    WebDriver driver;
    @Test
    public void test1(){
        driver = new ChromeDriver();
        driver. get("http://google.com");
        driver.quit();
    }
}
