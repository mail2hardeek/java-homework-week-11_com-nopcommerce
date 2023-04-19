package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";         //Stored URL in variable

    @Before

    public void setup() {                                    //Method set up for opening browser

        openWeb(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {                        //Method
        //Find element login
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        //Click on login button
        loginLink.click();
        //implicit wait 20sec
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Expected message on webpage
        String expectedMessage = "Welcome, Please Sign In!";
        WebElement actualText = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        //comparing expected and actual message
        String actualMessage = actualText.getText();
        //Verifing the messages
        Assert.assertEquals("Not redirected to Login page", expectedMessage, actualMessage);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Find element login
        WebElement loginLink = driver.findElement(By.className("ico-login"));

        //Click on login button
        loginLink.click();

        //Find element for email address and send email through sendkeys
        driver.findElement(By.id("Email")).sendKeys("ozapurvi50@gmail.com");

        //Find element for password and send password through sendkey
        driver.findElement(By.name("Password")).sendKeys("Snow1234");

        //Find element for Login button and click the button
        driver.findElement(By.xpath("//button[@type='submit' and @class='button-1 login-button']")).click();

        //Expected text on button
        String expectedLogOutText = "Log out";

        //Xpath to find element for text
        WebElement logOutLink = driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));

        //Find the text on webpage and store the text in variable
        String actualLogOutLinkText = logOutLink.getText();

        //Comparing the text and printing message in console
        Assert.assertEquals("Log out text not displayed", expectedLogOutText, actualLogOutLinkText);

    }

    @Test
    public void verifyTheErrorMessage() {

        //Find element login
        WebElement loginLink = driver.findElement(By.linkText("Log in"));

        //Click on login button
        loginLink.click();

        //Find element for email address and send email through sendkeys
        driver.findElement(By.id("Email")).sendKeys("Prime123@gmail.com");

        //Find element for password and send password through sendkey
        driver.findElement(By.name("Password")).sendKeys("Prim123");

        //Find element for Login button and click the button
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();

        //Expected text on button
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        //Xpath to find element for text
        WebElement actualText = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));

        //Find the text on webpage and store the text in variable
        String actualMessage = actualText.getText();

        //Comparing the text and printing message in console
        Assert.assertEquals("Error message not displayed", expectedMessage, actualMessage);
    }


}



