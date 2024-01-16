package seminars.five.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GettingStarted {
    @Test
    public void testGoogleSearch() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        searchBox.submit();
        WebElement selenium = driver.findElement(By.partialLinkText("https://www.selenium.dev"));
        List<String> links = driver.findElements(By.tagName("a")).stream().map(it -> it.getAttribute("href")).collect(Collectors.toList());
        assertTrue(links.contains("https://www.selenium.dev/"));
        assertTrue(selenium.getText().contains("Selenium"));
        driver.quit();
    }
}