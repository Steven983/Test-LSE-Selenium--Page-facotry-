package testCases;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.MainSitePageFactory;

public class MainSiteTestCase {
 WebDriver driver;
 MainSitePageFactory testFactory;

@Before
 public void first(){
 driver = new ChromeDriver();
 testFactory = new MainSitePageFactory(driver);
}
@Test
 public void clickOkay(){
 testFactory.someElementToclick();
}


}
