package io.repoOne.moduleTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
  private WebDriver driver;
  private WebElement webElement;

  public void navigateDummy(String address, String selector) {
    driver = new ChromeDriver();
    driver.navigate().to(address);
    webElement = driver.findElement(By.cssSelector(selector));
    webElement.click();
  }
}
