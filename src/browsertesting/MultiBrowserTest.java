package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    static String browser = "Chrome";
    static WebDriver driver;
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser Name");
        }
        // Open the baseUrl
       driver.get(baseUrl);
        // Maximise the browser
        driver.manage().window().maximize();
        // Give Implicit Wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Get the Title
        System.out.println("The title: " + driver.getTitle());
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
