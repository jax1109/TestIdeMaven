package main;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
/**
 * Created by Jax on 06.11.15.
 */
public class Test1 {

        private WebDriver driver;
        private String baseUrl;
        private boolean acceptNextAlert = true;
        private StringBuffer verificationErrors = new StringBuffer();

        @Before
        public void setUp() throws Exception {
            driver = new FirefoxDriver();
            baseUrl = "http://localhost:8000/";
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

        @Test
        public void testIdeMaven() throws Exception {
            driver.get(baseUrl + "/DVWA-1.9/login.php");
            driver.findElement(By.name("username")).clear();
            driver.findElement(By.name("username")).sendKeys("admin");
            driver.findElement(By.name("password")).clear();
            driver.findElement(By.name("password")).sendKeys("password");
            driver.findElement(By.name("Login")).click();
            driver.findElement(By.xpath("//li[@onclick=\"window.location='logout.php'\"]")).click();
            driver.findElement(By.name("username")).clear();
            driver.findElement(By.name("username")).sendKeys("admin");
            driver.findElement(By.name("password")).clear();
            driver.findElement(By.name("password")).sendKeys("password");
        }


    }
