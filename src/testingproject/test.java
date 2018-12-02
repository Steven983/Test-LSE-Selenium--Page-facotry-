package testingproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class test {

	 
	//ChromeDriver is launched and is directed to the London South East website
	public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Stefan\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("http://lse.co.uk") ;
	  
	   // User is taken from the home page to the Foreign exchanges page to view todays FX rates
	   WebElement polLink = driver.findElement((By.linkText("FX")));
	   polLink.click();	   
	   driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);


	   

	 
	   WebElement test = driver.findElement(By.xpath("//*[@id= 'toolBar']/div[1]/form/input[2]")); test.click(); 


	   // User is inputing his chosen Stock/Share and then being taken to the corresponding page dedicated to his chosen stock/share
	   WebElement pooper = driver.findElement(By.name("SharePrice"));
	   pooper.sendKeys("VAL");
	   
	   // User is then logging into his account by entering his email and password and then clicking the login button
	   WebElement accept = driver.findElement(By.xpath("//*[@id='toolBar']/div[1]/form/input[2]")); accept.click();
	   WebElement t = driver.findElement(By.name("txtEmail"));
	   t.sendKeys("testing101@gmail.com");
	   WebElement o = driver.findElement(By.name("txtPassword"));
	   o.sendKeys("testing101"); 
	  WebElement z = driver.findElement(By.name("sbmNavLogin")); z.click();
	  
	
	  
	  
	  // User is now writing a comment on the message board about his corresponding share/stock 
	  
	WebElement chat = driver.findElement(By.xpath("//*[@id=\"shareChatIndie\"]")); chat.click();
	 WebElement subject = driver.findElement(By.xpath("//*[@id=\"threadsContainerWide\"]/div[1]/form/div[1]/input"));
	 subject.sendKeys("Testing");
	 
	 WebElement comment = driver.findElement(By.xpath("//*[@id=\"postBody\"]"));
	 comment.sendKeys("This is a test");
	 
	}
	
}

	 
	 
