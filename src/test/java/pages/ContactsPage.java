package pages;

import elements.Dropdown;
import elements.TextArea;
import elements.TextInput;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ContactsPage extends BasePage{
    private static final String NEW_BUTTON_CSS = "[title=New]";
    private static final String SAVE_BUTTON_CSS = "[title=Save]";
    private static final String DROPDOWN_INPUT_CSS = ".uiAutocompleteOption";
    private static final String SUCCESS_TOAST_XPATH = "//div[@class='slds-theme--success slds-notify--toast slds-notify slds-notify--toast forceToastMessage']";


    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public BasePage isPageOpened() {
        return null;
    }

    @Override
    public BasePage openPage() {
        driver.get("https://ap17.lightning.force.com/lightning/o/Contact/list?filterName=Recent");
        return this;
    }

    public ContactsPage clickNew() {
        driver.findElement(By.cssSelector(NEW_BUTTON_CSS)).click();
      //  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(SAVE_BUTTON_CSS)));
        return this;
    }

    public ContactsPage createContact(Contact contact) {
        new TextInput(driver, "First Name").write(contact.getFirstName());
        new TextInput(driver, "Middle Name").write(contact.getMiddleName());
        new TextInput(driver, "Last Name").write(contact.getLastName());
        new TextInput(driver, "Suffix").write(contact.getSuffix());
        new TextInput(driver, "Title").write(contact.getTitle());
        new TextInput(driver, "Email").write(contact.getEmail());
        new TextInput(driver, "Phone").write(contact.getPhone());
        new TextInput(driver, "Mobile").write(contact.getMobile());
        new TextInput(driver,"Fax").write(contact.getFax());
        new TextArea(driver, "Mailing Street").write(contact.getMailingStreet());
        new Dropdown(driver,"Salutation").clickOnDropdownAndSelectElement(contact.getSalutation());
        new Dropdown(driver,"Salutation").isElementSelected(contact.getSalutation());
        setAccountName(contact);
        clickSave(contact);
        return this;
    }

    public ContactsPage setSalutation(String elementName) {
        new Dropdown(driver,"Salutation").clickOnDropdownAndSelectElement(elementName);
        new Dropdown(driver,"Salutation").isElementSelected(elementName);
        return this;
    }

    public ContactsPage setAccountName(Contact contact) {
        new TextInput(driver, "Account Name").write(contact.getAccountName());
        driver.findElement(By.cssSelector(DROPDOWN_INPUT_CSS)).click();
        return this;
    }

    public void clickSave(Contact contact) {
        driver.findElement(By.cssSelector(SAVE_BUTTON_CSS)).click();
       // verifyToast(contact);
    }

    public void verifyToast(Contact contact) {
        String currentToastMessage = driver.findElement(By.xpath(SUCCESS_TOAST_XPATH)).getText();
        String expectedToastMessage = "contact.getLastName() " + " " + " was saved";
      //  Assert.assertEquals(currentToastMessage, expectedToastMessage);
      //  Assert.assertTrue(currentToastMessage.contains(expectedToastMessage));


    }
}
