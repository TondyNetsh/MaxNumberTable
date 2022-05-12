package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        //driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[5]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div/ul/li[5]/a")).click();
    }

    @And("^User gets the maximum number of draws$")
    public void user_gets_the_maximum_number_of_draws() throws Throwable {
        Thread.sleep(5000);
        WebElement TogetRows = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[3]/table/tbody"));
        List<WebElement> TotalRowsList = TogetRows.findElements(By.tagName("tr"));
        //System.out.println("Total number of Rows in the table are : "+ TotalRowsList.size());

        int tableSize = TotalRowsList.size();
        List draws = new ArrayList<Integer>();
        for(int i = 1; i <= tableSize; i++) {
            draws.add(Integer.parseInt(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[3]/table/tbody/tr["+i+"]/td[5]")).getText()));
        }

        Collections.sort(draws);
        System.out.println(draws.get(tableSize-1));
    }
}
