package com.inetbanking.testcases;


import com.inetbanking.testdata.ReadConfig;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {

    ReadConfig readconfig=new ReadConfig();

    public String baseURL=readconfig.getApplicationURL();
    public String username=readconfig.getUsername();
    public String password=readconfig.getPassword();
    public static WebDriver driver;
    public static Logger logger;

   @BeforeClass
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
        driver=new ChromeDriver();
        logger = Logger.getLogger("ebanking");
        PropertyConfigurator.configure("Log4j.properties");

    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
