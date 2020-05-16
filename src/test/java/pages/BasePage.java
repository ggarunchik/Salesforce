package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    WebDriver driver;
    WebDriverWait wait;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 20);
    }

    public abstract BasePage isPageOpened();

    public abstract BasePage openPage();

    public void waitForElementToDisappear(By elementBy) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(elementBy));
    }

    public void waitForElementVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public boolean isElementPresent(By elementBy) {
        return elementBy != null;
    }


}