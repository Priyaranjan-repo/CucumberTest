package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class login {

	public WebDriver driver;

	@Given("user Launch the edge browser")
	public void user_launch_the_edge_browser() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		System.out.println("user Launched the edge browser");
	}

	@When("user is open to URL {string}")
	public void user_is_open_to_url(String string) {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("user is open to URL");

	}

	@When("enter username as {string} and password as {string}")
	public void enter_username_as_and_password_as(String username, String password) {
		driver.findElement(By.xpath("//input[@name='username']")).clear();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);

	}

	@When("click on submit")
	public void click_on_submit() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	@Then("page Title")
	public void page_title() {

		String expectedTitle = driver.getTitle();

		Assert.assertEquals("OrangeHRM", expectedTitle);
		System.out.println("page title matched");

	}

}
