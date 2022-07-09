import org.openqa.selenium.By;

public class SearchBox extends WebPage{

	
	By searchBoxLocator = By.className("sc-4995aq-4 dNPmGY");
	By searchButtonLocator = By.id("header-search-find-link");
	
	public void search(String text) {
		type(searchBoxLocator, text);
		click(searchButtonLocator);
	}
	
	
}
