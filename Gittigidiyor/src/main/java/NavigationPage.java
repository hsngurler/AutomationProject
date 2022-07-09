import org.openqa.selenium.By;

public class NavigationPage extends WebPage {

		
	SearchBox searchBox;
	By cardContainerLocator = By.className("dIB");
	
	public SearchBox searchBox() {
		return this.searchBox;
	}

	public void clickCardPageContainer() {
		click(cardContainerLocator);
	}
	
	
}
