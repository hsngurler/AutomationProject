import java.time.Duration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class AllTests {
		
	
	static NavigationPage navigationPage ;
	
	static WebDriver driver;
	static WebDriverWait wait;
	
	
	@BeforeClass
	
	public static void setUp() {
		
		By popUpCloseButton = By.className("wis_clsbtn");
		By cookiesAcceptButton = By.className("lfsBU");
		
		driver = new FirefoxDriver();
		driver.get("https://www.gittigidiyor.com/");
		driver.manage().window().maximize();
		
		wait = new WebDriverWait(driver ,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(popUpCloseButton));
		driver.findElement(popUpCloseButton).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(popUpCloseButton));
		driver.findElement(cookiesAcceptButton).click();
	}
	
	
	/*@AfterClass
	
	public static void tearDown() {
		
		driver.quit();
		
	}*/
	

}
