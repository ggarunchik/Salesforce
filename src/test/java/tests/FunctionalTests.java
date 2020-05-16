package tests;

import models.Account;
import models.Contact;
import models.User;
import org.testng.annotations.Test;

public class FunctionalTests extends BaseTest{

    @Test
    public void login(){
        Account account = new Account("Gleb Glebich", "+375447228535", "tut.by", "20", "Fish");
        loginPage
                .openPage()
                .provideCredsAndLogin("garunchikgleb-01uj@force.com", "user776e6")
                .verifyLogin()
                .openPage()
                .clickNew()
                .createAccount(account);
    }

    @Test(description = "Create new contact test")
    public void createContact() {
        Contact contact = new Contact.ContactBuilder("Garunchino","Gleb")
                .setFirstName("Gleb4ik")
                .setMiddleName("Wait for it")
                .setSuffix("44")
                .setTitle("Doctor who")
                .setEmail("hustonWeGotBeer@fakeuber.com")
                .setPhone("+375232323")
               // .setMobile("+3333333")
                .setDepartment("The Office")
                .setFax("really?")
                .setMailingStreet("markVallet20")
                .setSalutation("Mr.").build();

        loginPage
                .openPage()
                .provideCredsAndLogin("garunchikgleb-01uj@force.com", "user776e6")
                .goToContacts()
                .clickNew()
                .createContact(contact);
    }
}