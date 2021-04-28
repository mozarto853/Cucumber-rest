package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchSteps {

    WebDriver driver = null;

    @Given("browser is open")
    public void browser_is_open() {
        System.setProperty("webdriver.chrome.driver","C:\\JavaProjects\\RestAssured\\drivers\\chromedriver89.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    @And("user is on google search page")
    public void user_is_on_google_search_page() {
        System.out.println("Inside Step- user is on google page");

        driver.navigate().to("https://google.com");
    }

    @When("^user enters a (.*) in search box$")
    public void user_enters_a_text_in_search_box(String text) {
        driver.findElement(By.name("q")).sendKeys(text);
    }

    @And("hits enter")
    public void hits_enter() {
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {
        System.out.println("Inside Step- user is navigated to search results");
        driver.getPageSource().contains("Kiseki Wiki");  //Checks if page has the word "Kiseki Wiki"

        driver.close();
        driver.quit();
    }
}
