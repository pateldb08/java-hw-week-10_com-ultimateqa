package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {

    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        // Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        //Open the URL into browser
        driver.get(baseUrl);
        // Maximise the browser
        driver.manage().window().maximize();
        //Give the Implicit wait to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Get the Title of the page
        System.out.println("The Title: " + driver.getTitle());
        // Get the Current URL
        System.out.println("The Current URL: " + driver.getCurrentUrl());
        // Get the Page Source
        System.out.println("The Page Source: " + driver.getPageSource());
        //Get the Email Field and Type the Email
        driver.findElement(By.id("user[email]")).sendKeys("abc@gmail.com");
        //Get the Password Field and Type the Password
        driver.findElement(By.id("user[password]")).sendKeys("xyz123");

        // close the driver
        driver.close();





    }

}
