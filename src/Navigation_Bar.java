import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Navigation_Bar {

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

  

   //CASE: Locate home link and print that its present.
   public void HomeLink() {

       try {

            // Locate the logo using XPath (by `src` attribute or by `width` and `height`)
            WebElement homeLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@class, 'nav-link') and contains(text(), 'Home')]")));

            // Print a message to confirm the "Home" link is present
            if (homeLink.isDisplayed()) {
                System.out.println("The 'Home' link is present.");
            } else {
                System.out.println("The 'Home' link is not displayed.");
            }

            //Clicking homepage link
            homeLink.click();
            // Verify that the home page is displayed by checking the URL or a unique element on the home page
            boolean isHomePageDisplayed = wait.until(ExpectedConditions.urlContains("index.html"));

            if (isHomePageDisplayed) {
                System.out.println("Home page is successfully displayed after clicking the Home link.");
            } else {
                System.out.println("Failed to navigate to the Home page.");
            }
            

   } catch (Exception e) {
       System.out.println("An error occurred: " + e.getMessage());
   } finally {
       // Close the browser
       driver.quit();
   }

   }


   @Test 
   //CASE: Locate home link and print that its present.
   public void CartLink() {

    try {

        // Locate the logo using XPath (by `src` attribute or by `width` and `height`)
        WebElement homeLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@class, 'nav-link') and contains(text(), 'Cart')]")));

         // Print a message to confirm the "Home" link is present
         if (homeLink.isDisplayed()) {
             System.out.println("The 'Cart' link is present.");
         } else {
             System.out.println("The 'Cart' link is not displayed.");
         }

         //Clicking homepage link
         homeLink.click();
         // Verify that the home page is displayed by checking the URL or a unique element on the home page
         boolean isCartPageDisplayed = wait.until(ExpectedConditions.urlContains("cart.html"));

         if (isCartPageDisplayed) {
             System.out.println("Home page is successfully displayed after clicking the Home link.");
         } else {
             System.out.println("Failed to navigate to the Home page.");
         }
         

} catch (Exception e) {
    System.out.println("An error occurred: " + e.getMessage());
} finally {
    // Close the browser
    driver.quit();
}

}

@Test

//CASE: Locate home link and print that its present.
public void SignUpPopUp() {

    try {

        // Locate the logo using XPath (by `src` attribute or by `width` and `height`)
        WebElement SignUpPopUpLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@class, 'nav-link') and contains(text(), 'Sign up')]")));

         // Print a message to confirm the "Home" link is present
         if (SignUpPopUpLink.isDisplayed()) {
             System.out.println("The Signup popup is present.");
         } else {
             System.out.println("The Signup popup is no present.");
         }

         //Clicking SignUpPopUp link
         SignUpPopUpLink.click();

         // Verify if the sign-up modal popup is displayed by checking for a unique element within the modal
         WebElement signUpModal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));// Replace with a unique ID or class for the modal

        if (signUpModal.isDisplayed()) {
            System.out.println("Sign-up popup is successfully displayed.");
        } else {
            System.out.println("Sign-up popup is not displayed.");
        }

    } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
    } finally {
        // Close the browser
        driver.quit();
    }

}

@Test

public void ConTactLink() {

try {

    // Locate the Contact element using XPath by class names
    WebElement ContactLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@class, 'nav-link') and contains(text(), 'Contact')]")));

    // Click the "Home" link
    ContactLink.click();

    // Verify if the Contact modal popup is displayed by checking for a unique element within the modal
    WebElement contactModal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("exampleModalLabel")));// Replace with a unique ID or class for the modal

    if (contactModal.isDisplayed()) {
        System.out.println("Contact New Message popup is successfully displayed.");
    } else {
        System.out.println("Contact New Message popup is not displayed.");
    }



} catch (Exception e) {
    System.out.println("An error occurred: " + e.getMessage());
} finally {
    // Close the browser
    driver.quit();
}

}

@Test

public void AboutUsLink() {

try {

    // Locate the About Us element using XPath by class names
    WebElement AboutUsLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@class, 'nav-link') and contains(text(), 'About us')]")));

    // Click the "Home" link
    AboutUsLink.click();

    // Verify if the AboutUs modal popup is displayed by checking for a unique element within the modal
    WebElement aboutUsHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[@class='modal-title' and text()='About us']")));
    
            
            // Check if the "About us" popup is displayed
            if (aboutUsHeader.isDisplayed()) {
                System.out.println("About us popup is loading up.");
            }else{
                System.out.println("About us popup is not loading up.");
            }



} catch (Exception e) {
    System.out.println("An error occurred: " + e.getMessage());
} finally {
    // Close the browser
    driver.quit();
}

}


@Test

public void LogInLink() {

try {

    // Locate the About Us element using XPath by class names
    WebElement LogInLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@class, 'nav-link') and contains(text(), 'Log in')]")));

    // Click the "Home" link
    LogInLink.click();

    // Verify if the AboutUs modal popup is displayed by checking for a unique element within the modal
    WebElement LogInHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[@class='modal-title' and text()='Log in']")));
    
            
            // Check if the "About us" popup is displayed
            if (LogInHeader.isDisplayed()) {
                System.out.println("Login popup is loading up.");
            }else{
                System.out.println("login popup is not loading up.");
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