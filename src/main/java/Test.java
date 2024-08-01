import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        // Set the path of the chromedriver executable


        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.google.com");

        // Print the title
        System.out.println("Title: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}
