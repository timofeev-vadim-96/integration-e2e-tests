package seminars.five.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextFieldSiteTest {
    @Test
    public void testGoogleSearch() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement login = driver.findElement(By.name("user-name"));
        login.sendKeys("standard_user");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("secret_sauce");
        password.submit();
        WebElement products = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
        assertEquals("Products", products.getText());
        driver.quit();
    }
}