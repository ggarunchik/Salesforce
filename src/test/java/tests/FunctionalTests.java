package tests;

import models.Account;
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
}