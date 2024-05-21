package nop_commerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NopCommerceMultiBrowser {
    static String browser = "Chrome";
    static WebDriver driver;
    static String baseurl = "https://demo.nopcommerce.com/";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        //open url
        driver.get(baseurl);
        //Print title of the page
        String title = driver.getTitle();
        System.out.println("The title of the page is :" + title);
        //Print the current Url
        String currentUrl = driver.getCurrentUrl();
        System.out.println("The current url is :" + currentUrl);
        //Print the page source
        System.out.println("The page source is :" + driver.getPageSource());
        //Navigate to the login Url
        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(loginUrl);
        //Print the current url
        System.out.println("The current Url is : " + driver.getCurrentUrl());
        //Navigate back to the home page
        driver.navigate().back();
        //Navigate to the login page
        driver.navigate().to(loginUrl);
        //Print current url
        System.out.println("The current url is :" + driver.getCurrentUrl());
        //Refresh the page
        driver.navigate().refresh();
        //Click on login link and Enter the email to the email field and Enter password in password field
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("Prime123@gmail.com");
        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("Prime123");
        //Click on Login button
        driver.findElement(By.className("login-button")).click();
        //Close the browser
        driver.quit();
    }


}


