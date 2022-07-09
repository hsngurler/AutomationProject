import org.openqa.selenium.By;

public class ProductListPage extends WebPage {

	
	By catagories = By.className("u0996x-2 lbZvZt");
	By productCardLocator = By.className("sc-1nx8ums-0 dyekHG");
	By secondPageLocator = By.cssSelector("[aria-label=2. sayfa]");
	By previousPageLocator = By.cssSelector("[aria-label=Önceki sayfa]");
	
	public Boolean isOnProductPage() {
		return ElementExist(catagories);

	}
	
	public void goSecondPage() {
		findElement(secondPageLocator).click();

	}
	public Boolean isOnSecondProductPage() {
		return ElementExist(previousPageLocator);
		
	}

	public void selectRandomProduct(int i) {
		findElementList(productCardLocator).get(i).click();
		
	}

}
