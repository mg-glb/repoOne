package io.repoOne.moduleTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author m.gigena
 *
 */
public class BasePage {
  /**
   * @author m.gigena
   */
  private WebDriver driver;
  /**
   * @author m.gigena
   */
  private WebElement webElement;

  /**
   * @author m.gigena
   * @param address String
   * @param selector String
   */
  public final void navigateDummy(final String address, final String selector) {
    driver = new ChromeDriver();
    driver.navigate().to(address);
    webElement = driver.findElement(By.cssSelector(selector));
    webElement.click();
  }
}
