import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends WebPage{

	
	By searchBoxLocator = By.className("cAcojy");
	By searchButtonLocator = By.className("gaMakD");
	
	public SearchBox(WebDriver driver) {
		super(driver);
	}

	public void search(String text) {
		type(searchBoxLocator, text);
		click(searchButtonLocator);
	}
	
	
}
