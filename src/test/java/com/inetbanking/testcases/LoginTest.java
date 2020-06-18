package com.inetbanking.testcases;

import com.inetbanking.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseClass {

   @Test
    public void loginTest() {
        driver.get(baseURL);
        logger.info("URL is open");
        LoginPage loginPage=new LoginPage(driver);
        loginPage.setUserName(username);
        logger.info("enter username");
        loginPage.setPassword(password);
        logger.info("enter password");
        loginPage.clickSubmit();
         System.out.println(driver.getTitle());
        if (driver.getTitle().equals("Guru99 Bank Manager HomePage")){
            Assert.assertTrue(true);
            logger.info("login test passed");
        }
        else {
            Assert.assertTrue(false);
            logger.info("login test failed");
        }
    }


}
