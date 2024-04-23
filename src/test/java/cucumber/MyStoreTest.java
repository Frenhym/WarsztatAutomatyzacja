package cucumber;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MyStoreTest {
    private WebDriver driver;

@Given("User is on MyStore page")
    public void openMystorePage() {
    this.driver = new ChromeDriver();
    this.driver.get("https://mystore-testlab.coderslab.pl");
    this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
}
}
