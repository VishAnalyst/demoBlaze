import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Signup {

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

   

    // Step 2: Open web page and click sign up
    //CASE 1: OPEN WEBPAGE AND Print the Title of the page
    @Test
    public void testPageTitle() {

        try {
        
        String title = driver.getTitle();
        System.out.println("Title of the page is: " + title);

    } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
    } finally {
        // Close the browser
        driver.quit();
    } 
    }

    @Test

    

    //CASE 2: OPEN WEBPAGE AND LOCATE LOGO ELEMENT IS PRESENT.
    public void LogoofPage() {

        try {

    // Locate the logo using XPath (by `src` attribute or by `width` and `height`)
    WebElement logo = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@src='bm.png' and @width='50' and @height='50']")));

    // Check if the logo is displayed and print confirmation
    if (logo.isDisplayed()) {
        System.out.println("Logo is present on the page.");
    } else {
        System.out.println("Logo is not visible on the page.");
    }

    } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
    } finally {
        // Close the browser
        driver.quit();
    } 
    

    }


    @Test   
    //CASE 3: OPEN WEBPAGE AND LOCATE SIGN-UP ELEMENT.
    public void SignupPopup() {

        try {

        //Locating signup button
        WebElement signUpButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='nav-link' and @id='signin2' and contains(text(), 'Sign up')]")));

        // Click on the "Sign up" button to open the pop-up
        signUpButton.click();

        // Wait for the pop-up to be visible
        WebElement signInModal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModalLabel"))); 


        // Print confirmation that the sign-up pop-up is loaded
        if (signInModal.isDisplayed()) {
            System.out.println("Sign-up pop-up is loaded successfully.");
        } else {
            System.out.println("Sign-up pop-up did not load.");
        }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close the browser
            driver.quit();
        } 

    }

    @Test
        //Close button 
        public void CloseButton() {

        try {

            //Locating signup button
            WebElement signUpButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='nav-link' and @id='signin2' and contains(text(), 'Sign up')]")));
    
            // Click on the "Sign up" button to open the pop-up
            signUpButton.click();

            // Wait for the pop-up to be visible
            WebElement UsernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sign-username")));
            UsernameField.sendKeys("TestUser");

            // Use JavaScript to click outside of the pop-up at coordinates (1, 1)
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("document.elementFromPoint(1, 1).click();");

            System.out.println("Clicked outside the pop-up to close it.");
    
            

            
    
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            } finally {
                // Close the browser
                driver.quit();
            } 
    
        }
    


        @Test

                //CASE 3: LOCATE USERNAME FIELD NAME.
                public void UsernameFieldName() {

                    try {

                    //Locating signup button
                    WebElement signUpButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='nav-link' and @id='signin2' and contains(text(), 'Sign up')]")));

                    // Click on the "Sign up" button to open the pop-up
                    signUpButton.click();

                    // Wait for the pop-up to be visible
                    WebElement usernameSignUpName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='sign-username']")));
                    System.out.println("The username field name is printed as: " + usernameSignUpName.getText());

                    } catch (Exception e) {
                        System.out.println("An error occurred: " + e.getMessage());
                    } finally {
                        // Close the browser
                        driver.quit();
                    } 
                }
        @Test

                //CASE 3: LOCATE USERNAME FIELD.
                public void UsernameField() {

                    try {

                    //Locating signup button
                    WebElement signUpButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='nav-link' and @id='signin2' and contains(text(), 'Sign up')]")));

                    // Click on the "Sign up" button to open the pop-up
                    signUpButton.click();    

                    // Wait for the pop-up to be visible
                    WebElement UsernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sign-username")));
                    System.out.println("The username field name is printed as: " + UsernameField.getText());
                    UsernameField.sendKeys("TestUser");
                    System.out.println("The username field is accepting the values as " + UsernameField.getText());

                    } catch (Exception e) {
                        System.out.println("An error occurred: " + e.getMessage());
                    } finally {
                        // Close the browser
                        driver.quit();
                    } 
                }        

           

        @Test

                //CASE 3: LOCATE PASSWORD FIELD NAME.
                public void PasswordFieldName() {

                    try {

                    //Locating signup button
                    WebElement signUpButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='nav-link' and @id='signin2' and contains(text(), 'Sign up')]")));

                    // Click on the "Sign up" button to open the pop-up
                    signUpButton.click();

                    // Wait for the pop-up to be visible
                    WebElement passwordSignUpName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='sign-password']")));
                    System.out.println("The username field name is printed as: " + passwordSignUpName.getText());

                    } catch (Exception e) {
                        System.out.println("An error occurred: " + e.getMessage());
                    } finally {
                        // Close the browser
                        driver.quit();
                    } 
                }

        @Test
                //CASE: LOCATE PASSWORD FIELD.
                public void PasswordField() {

                    try {

                    //Locating signup button
                    WebElement signUpButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='nav-link' and @id='signin2' and contains(text(), 'Sign up')]")));

                    // Click on the "Sign up" button to open the pop-up
                    signUpButton.click();

                    // Wait for the pop-up to be visible
                    WebElement PasswordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sign-password")));
                    System.out.println("The username field name is printed as: " + PasswordField.getText());
                    PasswordField.sendKeys("TestUser123");
                    System.out.println("The username field is accepting the values as " + PasswordField.getText());

                    } catch (Exception e) {
                        System.out.println("An error occurred: " + e.getMessage());
                    } finally {
                        // Close the browser
                        driver.quit();
                    } 
                } 

        
        @Test
        
        public void FieldValidation() {

        try {

            //Locating signup button
            WebElement signUpButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='nav-link' and @id='signin2' and contains(text(), 'Sign up')]")));
    
            // Click on the "Sign up" button to open the pop-up
            signUpButton.click();

            //Click the Sign-up button
            WebElement SignupButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='button' and @onclick='register()' and contains(@class, 'btn btn-primary')]")));

            //Sign-UpButton Click
            SignupButton.click();

            //JavaScript alert Code
            wait.until(ExpectedConditions.alertIsPresent());

            // Switch to the alert
            Alert alert = driver.switchTo().alert();
            
            // Print the alert message
            String alertMessage = alert.getText();
            System.out.println("Alert message displayed: " + alertMessage);
            
            // Accept the alert to close it
            alert.accept();

          
    
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            } finally {
                // Close the browser
                driver.quit();
            } 
    
        }
                
        @Test        
                //CASE: FILLING SIGNUP FORM.
                public void SignUpForm() {

                    try {

                    //Locating signup button
                    WebElement signUpButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='nav-link' and @id='signin2' and contains(text(), 'Sign up')]")));

                    // Click on the "Sign up" button to open the pop-up
                    signUpButton.click();

                    // Username field
                    WebElement UsernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sign-username")));
                    UsernameField.sendKeys("TestUser");
                    System.out.println("The username field is accepting the values as " + UsernameField.getText());

                    // Password field
                    WebElement PasswordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sign-password")));
                    PasswordField.sendKeys("TestUser123");
                    System.out.println("The Password field is accepting the values as " + PasswordField.getText());

                    //Click the Sign-up button
                    WebElement SignupButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='button' and @onclick='register()' and contains(@class, 'btn btn-primary')]")));
                    
                    if (SignupButton.isDisplayed()) {
                        System.out.println("Sign-up pop-up is loaded successfully.");
                    } else {
                        System.out.println("Sign-up pop-up did not load.");
                    }
        
                    SignupButton.click();
                    
                    } catch (Exception e) {
                        System.out.println("An error occurred: " + e.getMessage());
                    } finally {
                        // Close the browser
                        driver.quit();
                    } 
                }     



    @Test

    public void Footer() {

try {

    // Locate the footer element using XPath by class names
    WebElement footer = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//footer[contains(@class, 'py-5') and contains(@class, 'bg-inverse')]")));

    // Check if the footer is displayed and print confirmation
    if (footer.isDisplayed()) {
        System.out.println("Footer is present on the page.");
    } else {
        System.out.println("Footer is not visible on the page.");
    }

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