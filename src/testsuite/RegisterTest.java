package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    @Before
    public void setUp() {
        openWeb("http://demo.nopcommerce.com/");
    }

    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully() {

        // click on the ‘Register’ link
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();

        // Verify the text ‘Register’
        String expectedMessage = "Register";

        //Finding element Xpath
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()='Register']"));

        //Getting text from webpage and storing in variable
        String actualMessage = actualTextElement.getText();

        //Comparing actual and expected result and printing in message in console
        Assert.assertEquals("Register not displayed", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        // click on the ‘Register’ link
        WebElement registerLink = driver.findElement(By.linkText("Register"));

        //Click on register link
        registerLink.click();

        // Select gender radio button
        driver.findElement(By.id("gender-female")).click();

        // Find element for first name
        WebElement firstNameField = driver.findElement(By.id("FirstName"));

        //send the text to Firstname field
        firstNameField.sendKeys("Pinks");

        //Find element for last name
        WebElement lastNameField = driver.findElement(By.name("LastName"));

        //send the text to Last name field
        lastNameField.sendKeys("Shah");

        // Select Day Month and Year , input the value and click
        driver.findElement(By.name("DateOfBirthDay")).click();
        driver.findElement(By.xpath("//option[@value='6']")).click();
        driver.findElement(By.name("DateOfBirthMonth")).click();
        driver.findElement(By.xpath("//option[@value='5' and text()='May']")).click();
        driver.findElement(By.name("DateOfBirthYear")).click();
        driver.findElement(By.xpath("//option[@value='1990']")).click();
        // Find element and enter Email address
        driver.findElement(By.id("Email")).sendKeys("ozapurvi@gmail.com");

        // Find element and Enter Password
        driver.findElement(By.name("Password")).sendKeys("Snow1234");

        // Enter Confirm password
        driver.findElement(By.name("ConfirmPassword")).sendKeys("Snow1234");

        // Click on REGISTER button
        driver.findElement(By.id("register-button")).click();

        // Verify the text 'Your registration completed'.
        String expectedMessage = "Your registration completed";
        WebElement actualTextElement = driver.findElement(By.className("result"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Your registration completed not displayed", expectedMessage, actualMessage);
    }

    @After                                     //Closing browser
    public void tearDown() {

        driver.close();
    }


}
