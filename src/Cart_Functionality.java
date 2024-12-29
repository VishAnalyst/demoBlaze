import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart_Functionality {

    private WebDriver driver;
    private WebDriverWait wait;

    // Step 1: Setup method to initialize the browser
    @Before
    public void setUp() {
        // Set the path to the Chrome driver
        System.setProperty("webdriver.chrome.driver", "/Users/preethianil/Downloads/Selenium/Chrome drivers/chromedriver-mac-arm64/chromedriver");

        // Initiate the driver
        driver = new ChromeDriver();

        //Initialise web driver wait    
        // Initialize WebDriverWait with a timeout of 10 seconds
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
       


        //Call the website
        driver.get("https://www.demoblaze.com/");


        // Maximize the browser window
        driver.manage().window().maximize();
    }

    @Test

    public void CartButtonFunctionality() {

        try {

       //Locatinf the product 1st and clicking the link
       WebElement samsungLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Samsung galaxy s6']")));
       samsungLink.click();


        //Locating the add to cart button display it and click the same
        WebElement addToCartButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//a[@class='btn btn-success btn-lg']")));

            // Check if the button is displayed
            if (addToCartButton.isDisplayed()) {
                System.out.println("The 'Add to cart' button is displayed.");
                
                // Click on the button
                addToCartButton.click();
                System.out.println("'Add to cart' button clicked successfully.");
            } else {
                System.out.println("'Add to cart' button is not displayed.");
            }

            //Clicking the add to cart button
            addToCartButton.click();

            System.out.println("The 'Add to cart' button is clicked."); 

            // Perform actions that trigger the alert (customize according to your scenario)
             
            //JavaScript alert Code
             wait.until(ExpectedConditions.alertIsPresent());
    

            // Switch to alert
             Alert alert = driver.switchTo().alert();

             // Get the alert text
            String alertText = alert.getText();
            System.out.println("Alert Textn displayed is: " + alertText);

            // Accept the alert
            alert.accept();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close the browser
            driver.quit();
        } 
    } 
        
        @Test

        public void CartPageFunctionality () {

            try {
        
            //Locate the cart
            WebElement CartLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Cart']")));
            if(CartLink.isDisplayed()){
                System.out.println("The cartLink is preent on the navgation");
            }else{
                System.out.println("The cartLink is not preent on the navgation");
            }
            
            
            driver.get("https://www.demoblaze.com/prod.html?idp_=1#");

            //Clicking the cart button
            CartLink.click();

            WebElement addToCartButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//a[@class='btn btn-success btn-lg']")));

            
            //Clicking the add to cart button
            addToCartButton.click();

            // Perform actions that trigger the alert (customize according to your scenario)
             
            //JavaScript alert Code
             wait.until(ExpectedConditions.alertIsPresent());
    

            // Switch to alert
             Alert alert = driver.switchTo().alert();

             // Get the alert text
            String alertText = alert.getText();
            System.out.println("Alert Textn displayed is: " + alertText);

            // Accept the alert
            alert.accept();

            CartLink.click();
            System.out.println("The car link is clicked");



            //Locate the total price displayed and print
            WebElement totalAmountElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@id='totalp']")));

            // Get the displayed value
            String displayedValue = totalAmountElement.getText();
            System.out.println("The total amount displayed is: " + displayedValue);


            //Locate the place the order button display it and click
            WebElement PlaceOrderButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-target='#orderModal']")));
            if(PlaceOrderButton.isDisplayed()){
                System.out.println("PlaceOrder button is displayed: ");
            }else{
                System.out.println("PlaceOrder button is not displayed: ");
            }
            

            //Clicking the Place order button
            PlaceOrderButton.click();

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close the browser
            driver.quit();
        } 
    }
        
            
    @Test

    public void PlaceOrderForm() {
   
        try {

                                                    //Locatinf the product 1st and clicking the link
                                                    WebElement samsungLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Samsung galaxy s6']")));
                                                    samsungLink.click();


                                                    //Locating the add to cart button display it and click the same
                                                    WebElement addToCartButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
                                                    By.xpath("//a[@class='btn btn-success btn-lg']")));

                                                    // Check if the button is displayed
                                                    if (addToCartButton.isDisplayed()) {
                                                    System.out.println("The 'Add to cart' button is displayed.");
                                                        
                                                    // Click on the button
                                                    addToCartButton.click();
                                                    System.out.println("'Add to cart' button clicked successfully.");
                                                    } else {
                                                        System.out.println("'Add to cart' button is not displayed.");
                                                    }

                                                    //Clicking the add to cart button
                                                    addToCartButton.click();

                                                    System.out.println("The 'Add to cart' button is clicked."); 

                                                    // Perform actions that trigger the alert (customize according to your scenario)
                                                    
                                                    //JavaScript alert Code
                                                    wait.until(ExpectedConditions.alertIsPresent());
                                            

                                                    // Switch to alert
                                                    Alert alert = driver.switchTo().alert();

                                                    // Get the alert text
                                                    String alertText = alert.getText();
                                                    System.out.println("Alert Textn displayed is: " + alertText);

                                                    // Accept the alert
                                                    alert.accept();

                                                    //Locate the cart
                                                    WebElement CartLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Cart']")));
                                                    CartLink.click();

                                                    //Locate the total price displayed and print
                                                    WebElement totalAmountElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@id='totalp']")));

                                                    // Get the displayed value
                                                    String displayedValue = totalAmountElement.getText();
                                                    System.out.println("The total amount displayed is: " + displayedValue);


                                                    //Locate the place the order button display it and click
                                                    WebElement PlaceOrderButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-target='#orderModal']")));
                                                    if(PlaceOrderButton.isDisplayed()){
                                                        System.out.println("PlaceOrder button is displayed: ");
                                                    }else{
                                                        System.out.println("PlaceOrder button is not displayed: ");
                                                    }
                                                    

                                                    //Clicking the Place order button
                                                    PlaceOrderButton.click();
            
                //Place order form is displayed
                WebElement PlaceOrderFormTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[@id='orderModalLabel']")));
                System.out.println("Title of the page is displayed as" + PlaceOrderFormTitle.getText());
                
                //Total Label
                WebElement TotalElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='totalm']")));
                System.out.println("total of the page is displayed as" + TotalElement.getText());

                //Username Label
                WebElement UsernameLabel = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='name']")));
                System.out.println("total of the page is displayed as" + UsernameLabel.getText());

                //Country
                WebElement CountryLabel = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='country']")));
                System.out.println("total of the page is displayed as" + CountryLabel.getText());

                //City
                WebElement CityLabel = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='city']")));
                System.out.println("total of the page is displayed as" + CityLabel.getText());

                //CreditCard
                WebElement CreditCardLabel = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='card']")));
                System.out.println("total of the page is displayed as" + CreditCardLabel.getText());
                
                //Month
                WebElement MonthLabel = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='month']")));
                System.out.println("total of the page is displayed as" + MonthLabel.getText());

                //Year
                WebElement YearLabel = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='year']")));
                System.out.println("total of the page is displayed as" + YearLabel.getText());
                                            
                //Purchase button
                WebElement PurchaseButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Purchase']")));
                System.out.println("total of the page is displayed as" + PurchaseButton.getText());

            






                


        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close the browser
            driver.quit();
        } 
    }




     // Step 3: Teardown method to close the browser after each test
    @After
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}

