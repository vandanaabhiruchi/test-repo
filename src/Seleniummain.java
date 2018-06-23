import java.security.PublicKey;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniummain {

	//public static void main(String[] args, String css, String attribute) {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WebDriver driver;

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanda\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");

		//driver = new ChromeDriver();


		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\vanda\\Downloads\\selenium\\geckodriver_win64\\gecodriver.exe");

	//WebDriver driver1 = new FirefoxDriver();
	
		
	
	
	/*String browsertype = "chrome";
	
if (browsertype == "chrome") {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanda\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");

	
	}
	}*/
	
/*String browsertype1 = "Firefox";

if (browsertype1 == "Firefox") {	
System.setProperty("webdriver.gecko.driver", "C:\\Users\\vanda\\Downloads\\selenium\\geckodriver.exe");
WebDriver driver1 = new FirefoxDriver();*/

//System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanda\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");

//WebDriver chromedriver = new ChromeDriver();

//chromedriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);



/*chromedriver.get("http://automationpractice.com/index.php?controller=authentication");
WebElement searchBox = chromedriver.findElement(By.id("search_query_top"));
WebElement searchButton = chromedriver.findElement(By.name("submit_search"));

WebElement signIn = chromedriver.findElement(By.xpath("//a[@class='login']"));

signIn.click();

WebElement email = chromedriver.findElement(By.xpath("//input[@id='email']"));

email.sendKeys("trainee@lps.co.nz");

WebElement password = chromedriver.findElement(By.xpath("//input[@id='passwd']"));
password.sendKeys("password01");

WebElement submit = chromedriver.findElement(By.xpath("//button[@id='SubmitLogin']//span"));

//button[@id='SubmitLogin']//span

submit.click();*/

//chromedriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//*chromedriver.get("http://automationpractice.com/index.php?controller=authentication");

System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanda\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");

WebDriver chromedriver = new ChromeDriver();
chromedriver.get("http://automationpractice.com/index.php?controller=authentication");
WebElement searchBox = chromedriver.findElement(By.id("search_query_top"));
searchBox.sendKeys("Test");
WebElement searchButton = chromedriver.findElement(By.name("submit_search"));
searchButton.click();
WebElement signIn = chromedriver.findElement(By.xpath("//a[@class='login']"));
signIn.click();
WebElement loginBox = chromedriver.findElement(By.cssSelector(".is_required.validate.account_input.form-control"));
loginBox.sendKeys("trainee@lps.co.nz");

//Implicit wait will wait for the word in whole project

//chromedriver.manage().timeouts().implicitlyWait(30, Timeunitrg1)

chromedriver.get("http://automationpractice.com/index.php?controller=authentication");

((JavascriptExecutor)chromedriver).executeScript("document.getElementById('search_query_top')value.top();");



}

}

	
