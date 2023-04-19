package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    @Before
    public void setUp() {                                      //Browser opening
        openWeb("http://demo.nopcommerce.com/");
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        //  click on the 'Computers' Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']")).click();

        // Verify the text 'Computers'
        String expectedMessage = "Computers";

        //Find Element and store in variable through Xpath
        WebElement actualTextElement = driver.findElement(By.xpath("//h1"));

        //Storing value of text from webpage
        String actualMessage = actualTextElement.getText();

        //Verify the text
        Assert.assertEquals("Computers not displayed", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //  click on the 'Electronics' Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile' ]//a[text()='Electronics ']")).click();

        // Verify the text 'Electronics'
        String expectedMessage = "Electronics";

        //Find Element and store in variable through Xpath
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()='Electronics']"));

        //Storing value of text from webpage
        String actualMessage = actualTextElement.getText();

        //Verify the text
        Assert.assertEquals("Electronics not displayed", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //  click on the 'Electronics' Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile' ]//a[text()='Electronics ']")).click();

        // Verify the text 'Electronics'
        String expectedMessage = "Electronics";

        //Find Element and store in variable through Xpath
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[text()='Electronics']"));

        //Storing value of text from webpage
        String actualMessage = actualTextElement.getText();

        //Verify the text
        Assert.assertEquals("Electronics not displayed", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        //  click on the ‘Digital downloads’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Digital downloads ')]")).click();

        // Verify the text ‘Digital downloads’
        String expectedMessage = "Digital downloads";

        //Find Element and store in variable through Xpath
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'')]"));

        //Storing value of text from webpage
        String actualMessage = actualTextElement.getText();

        //Verify the text
        Assert.assertEquals("Digital downloads not displayed", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        // click on the ‘Books’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[starts-with(text(),'Books ')]")).click();

        // Verify the text ‘Books’
        String expectedMessage = "Books";

        //Find Element and store in variable through Xpath
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));

        //Storing value of text from webpage
        String actualMessage = actualTextElement.getText();

        //Verify the text
        Assert.assertEquals("Books not displayed", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //  click on the ‘Jewelry’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry ')]")).click();

        //  Verify the text ‘Jewelry’
        String expectedMessage = "Jewelry";

        //Find Element and store in variable through Xpath
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));

        //Storing value of text from webpage
        String actualMessage = actualTextElement.getText();

        //Verify the text
        Assert.assertEquals("Jewelry not displayed", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        // click on the ‘Gift Cards’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards ')]")).click();

        // Verify the text ‘Gift Cards’
        String expectedMessage = "Gift Cards";

        //Find Element and store in variable through Xpath
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));

        //Storing value of text from webpage
        String actualMessage = actualTextElement.getText();

        //Verify the text
        Assert.assertEquals(" Gift Cards not displayed", expectedMessage, actualMessage);
    }
    @After                                     //Closing browser
    public void tearDown() {

        closeBrowser();
    }
}
