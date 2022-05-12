package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {
    public WebDriver driver;
    @Given("User opens the supersport website")
    public void user_opens_the_supersport_website() throws Throwable {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\CMDQ1\\IdeaProjects\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://supersport.com/");
    }

    @Then("^User clicks on the DStv Premiership link$")
    public void user_clicks_on_the_dstv_premiership_link() throws Throwable {
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[1]/div[1]/div/ul/li[2]/a/div/div")).click();
    }

    @Then("^User clicks on the tables link to show the table$")
    public void user_clicks_on_the_tables_link_to_show_the_table() throws Throwable {
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div/ul/li[5]/a")).click();
    }

    @Then("^User gets the maximum number of goals scored$")
    public void user_gets_the_maximum_number_of_goals_scored() throws Throwable {

    }

    @And("^User displays the maximum number$")
    public void user_displays_the_maximum_number() throws Throwable {

    }
}
