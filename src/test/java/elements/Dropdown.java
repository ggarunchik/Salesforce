package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Dropdown {
    private static final String SELECT_LOCATOR_XPATH = "//article//span[contains(text(),'%s')]/../..//div[@class='uiPopupTrigger']";
    private static final String SELECTION_LOCATOR_XPATH = "//a[@title = '%s']";
    //private static final String SELECTED_LOCATOR_XPATH = "//article//span[contains(text(),'%s')]/../..//div[@class='uiPopupTrigger']/..//a[@class='select']";
    private static final String SELECTED_LOCATOR_XPATH = "//a[@class= 'select']";
    WebElement element;

    public Dropdown(WebDriver driver, String label) {
        element = driver.findElement(By.xpath(String.format(SELECT_LOCATOR_XPATH, label)));
    }

    public void clickOnDropdownAndSelectElement(String elementName) {
        element.click();
        selectElement(elementName);
    }

    public void selectElement(String elementName) {
        element.findElement(By.xpath(String.format(SELECTION_LOCATOR_XPATH, elementName))).click();
    }


    public void isElementSelected(String elementName) {
        String currentSelectedElement = element.findElement(
                By.xpath(String.format(SELECTED_LOCATOR_XPATH, elementName))).getText();
        Assert.assertEquals(currentSelectedElement, elementName);

    }

}