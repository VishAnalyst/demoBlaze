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



public class Login_Check {

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

   

    //LOGIN POP-UP TITLE
    //CASE 1: Click Login from the navigation and print the title of the pop up
    @Test
    public void TestLoginPopUp() {

        try {
        
            //Locate the Login Link and click
            WebElement loginLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='login2' and text()='Log in']")));
            loginLink.click();

            WebElement loginModalTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logInModalLabel")));

            // Print confirmation that the sign-up pop-up is loaded
            if (loginModalTitle.isDisplayed()) {
                System.out.println("LOGIN pop-up is loaded successfully.");
            } else {
                System.out.println("LOGIN pop-up did not load.");
            }




            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            } finally {
                // Close the browser
                driver.quit();
            } 
        }

        //Locate this USERNAME ELEMENT FIELD
        //CASE 2: LOCATE USERNAME ELEMENT AND DISPLAY IT
                @Test

                //CASE 3: LOCATE USERNAME FIELD NAME.
                public void UsernameFieldNameLogin() {

                    try {

                    //LAUNCH AND CLICK THE LOGIN LINK
                    WebElement loginLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='login2' and text()='Log in']")));
                    loginLink.click();

                    // Wait for the pop-up to be visible
                    WebElement usernameLabel = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//label[@for='log-name' and contains(text(),'Username:')]")));

                    // Print the text of the label
                    if(usernameLabel.isDisplayed()){
                        System.out.println("Label text: " + usernameLabel.getText());
                    } else {
                            System.out.println("Username label is not diaplayed");    
                    }

                    } catch (Exception e) {
                        System.out.println("An error occurred: " + e.getMessage());
                    } finally {
                        // Close the browser
                        driver.quit();
                    } 
                }
        
                @Test

                //CASE 3: LOCATE USERNAME FIELD, PASS THE VALUE AND DISPLAY THE SAME.
                public void UsernameFieldLogin() {

                    try {

                     //LAUNCH AND CLICK THE LOGIN LINK
                     WebElement loginLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='login2' and text()='Log in']")));
                     loginLink.click();

                    // Wait for the pop-up to be visible
                    WebElement UsernameFieldLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
                    if (UsernameFieldLogin.isDisplayed()){
                        System.out.println("The username field name is printed as: " + UsernameFieldLogin.getText());
                    }else{
                        System.out.println("The login username field is not displayed");
                    }
                    
                    UsernameFieldLogin.sendKeys("TestUser");
                    System.out.println("The username field is accepting the values as " + UsernameFieldLogin.getText());

                    } catch (Exception e) {
                        System.out.println("An error occurred: " + e.getMessage());
                    } finally {
                        // Close the browser
                        driver.quit();
                    } 
                }
        @Test
        
        //CASE: USERNAME FIELD VALIDATION. 
        public void UsenameFieldValidation() {

        try {

            //Locate the Login Link and click
            WebElement loginLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='login2' and text()='Log in']")));
            loginLink.click();

            //Click the log in button
            WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='button' and @onclick='logIn()' and contains(text(),'Log in')]")));
            loginButton.click();

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

                //CASE 3: LOCATE PASSWORD FIELD NAME PASS THE VLAUE AND DISPLAY THE SAME.
                public void PasswordFieldName() {

                    try {

                     //LAUNCH AND CLICK THE LOGIN LINK
                     WebElement loginLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='login2' and text()='Log in']")));
                     loginLink.click();
 
                    // LOCATE THE PASSWORD LABEL
                    WebElement passwordlabel = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='log-pass']")));
                    if(passwordlabel.isDisplayed()){
                        System.out.println("The password field name is printed as: " + passwordlabel.getText());
                    }else{

                        System.out.println("The password label is not displayed");
                    }
                    

                    } catch (Exception e) {
                        System.out.println("An error occurred: " + e.getMessage());
                    } finally {
                        // Close the browser
                        driver.quit();
                    } 
                }

            @Test
                //CASE: LOCATE PASSWORD FIELD & DISPLAY WHAT VALUE IS PASSED.
                public void PasswordField() {

                    try {

                     //LAUNCH AND CLICK THE LOGIN LINK
                     WebElement loginLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='login2' and text()='Log in']")));
                     loginLink.click();

                    // Wait for the pop-up to be visible
                    WebElement PasswordFieldLogin= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginpassword")));
                    if(PasswordFieldLogin.isDisplayed()){
                        System.out.println("The username field name is printed as: " + PasswordFieldLogin.getText());
                    }else{
                        System.out.println("Password field is not displayed");
                    }
                    
                    PasswordFieldLogin.sendKeys("TestUser123");
                    System.out.println("The username field is accepting the values as " + PasswordFieldLogin.getText());

                    } catch (Exception e) {
                        System.out.println("An error occurred: " + e.getMessage());
                    } finally {
                        // Close the browser
                        driver.quit();
                    } 
                }
            
            @Test   
            //CASE: PASSWORD FIELD VALIDATION. 
            public void PasswordFieldValidation() {

            try {
    
                //Locate the Login Link and click
                WebElement loginLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='login2' and text()='Log in']")));
                loginLink.click();
    
                //Click the Login button
                WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='button' and @onclick='logIn()' and contains(text(),'Log in')]")));
                loginButton.click();
    
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

            //CASE: FILLING login  FORM.
            public void LoginButtonLabel() {
            try {

            //Locate the Login Link and click
            WebElement loginLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='login2' and text()='Log in']")));
            loginLink.click();

            //Click the Login button
            WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='button' and @onclick='logIn()' and contains(text(),'Log in')]")));
            if(loginButton.isDisplayed()){
                System.out.println("The Login button is displayed");

            }else{
                System.out.println("The Login button is not displayed");
            }

            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            } finally {
                // Close the browser
                driver.quit();
            } 

            }

                
            @Test        
                //CASE: FILLING login form FORM.
                public void LoginForm() {

                    try {

                    //Locating signup button
                        WebElement LoginInLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='login2' and contains(text(), 'Log in')]")));

                    // Click on the "Sign up" button to open the pop-up
                    LoginInLink.click();

                    // Username field
                    WebElement LoginUsernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
                    LoginUsernameField.sendKeys("TestUser");
                    System.out.println("The login username field is accepting the values as " + LoginUsernameField.getText());

                    // Password field
                    WebElement LoginPasswordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginpassword")));
                    LoginPasswordField.sendKeys("TestUser123");
                    System.out.println("The login Password field is accepting the values as " + LoginPasswordField.getText());

                    //Click the Sign-up button
                    WebElement logInButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='button' and @onclick='logIn()' and contains(text(), 'Log in')]")));

                     // Print confirmation that the button is found
                     if (logInButton.isDisplayed()) {
                    System.out.println("Log in button is present and visible.");
                    }

                     // Optional: Click the button
                    logInButton.click();
                    System.out.println("Log in button clicked successfully.");
                    
                    } catch (Exception e) {
                        System.out.println("An error occurred: " + e.getMessage());
                    } finally {
                        // Close the browser
                        driver.quit();
                    } 
                }     


            //Closing the login pop up

            @Test
                    //Close button 
                    public void CloseButton() {

                    try {

                        //Locating signup button
                        WebElement LoginUpLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='login2' and contains(text(), 'Log in')]")));

                
                        // Click on the "Sign up" button to open the pop-up
                        LoginUpLink.click();

                        
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


   
    // Step 3: Teardown method to close the browser after each test
    @After
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}