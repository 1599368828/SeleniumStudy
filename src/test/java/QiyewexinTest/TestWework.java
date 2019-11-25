package QiyewexinTest;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWework {

    public static String url = "https://www.baidu.com/";
    @Test
    public void testStart() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\liky1\\Downloads\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().window().maximize();
        driver.findElement(By.id("kw")).sendKeys("阿萨德强");
        driver.findElement(By.id("su")).click();
        driver.findElement(By.id("kw")).clear();
        driver.findElement(By.id("kw")).sendKeys("nihao");
        driver.findElement(By.id("su")).click();

    }


}
