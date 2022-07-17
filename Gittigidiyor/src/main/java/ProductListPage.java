import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ProductListPage extends WebPage {

	
	By catagories = By.className("lbZvZt");
	By productCardLocator = By.className("khXIrI");
	By secondPageLocator = By.className("ZxdVY");
	By previousPageLocator = By.className("iGOuPd");
	By addToBasketButtonLocator = By.className("iRsyUX");
	
	public ProductListPage(WebDriver driver) {
		super(driver);
	}

	public Boolean isOnProductPage() {
		return ElementExist(catagories);

	}
	
	public void goSecondPage() {
		findElement(secondPageLocator).click();

	}
	public Boolean isOnSecondProductPage() {
		return ElementEnabled(previousPageLocator);
		
	}

	
	public void selectFirstProduct() {

		findElement(productCardLocator).click();
		
	}
	
	
	public void selectRandomProduct(int i) {
		
		Actions action = new Actions(driver);
		action.moveToElement(findElement(productCardLocator)).click().build().perform();
		click(productCardLocator);
	}

}
