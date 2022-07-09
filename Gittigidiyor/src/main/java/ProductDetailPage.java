import org.openqa.selenium.By;

public class ProductDetailPage extends WebPage {

	
	By addCardButtonLocator = By.id("add-to-basket");
	
	public Boolean isOnProductDetailPage() {
		
		return ElementExist(addCardButtonLocator);
		
	}

	public void addProductToCard() {
		click(addCardButtonLocator);
		
	}

}
