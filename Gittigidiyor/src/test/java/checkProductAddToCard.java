import java.io.IOException;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.junit.Test;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class checkProductAddToCard extends AllTests {

	NavigationPage navigationPage ;
	ProductListPage productListPage ;
	ProductDetailPage productDetailPage ;
	/*CardPage cardPage ;*/
	
	
	
	@Test
	public void stage1_searchProduct() {
		
		navigationPage = new NavigationPage(driver);
		navigationPage.searchBox.search("bilgisayar");
		productListPage = new ProductListPage(driver);
		Assert.assertTrue("Not on Product List Page" , productListPage.isOnProductPage());
		
	}
	
	
	@Test
	public void stage2_SecondPage() {
		
		productListPage = new ProductListPage(driver);
		productListPage.goSecondPage();
		Assert.assertTrue("Not on second Product List Page" , productListPage.isOnSecondProductPage());
		By popUpCloseButton = By.className("wis_clsbtn");
		wait.until(ExpectedConditions.visibilityOfElementLocated(popUpCloseButton));
		driver.findElement(popUpCloseButton).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(popUpCloseButton));
		
		
	}
	
	
	@Test
	public void stage3_selectProduct() {
		
		int random = (int)(Math.random()*(4)+1)-1;
		productListPage = new ProductListPage(driver);
		productListPage.selectRandomProduct(random);
		
		productDetailPage = new ProductDetailPage(driver);
		By addCardButtonLocator = By.id("add-to-basket");
		wait.until(ExpectedConditions.visibilityOfElementLocated(addCardButtonLocator));
		Assert.assertTrue("Not on Product Detail Page" , productDetailPage.isOnProductDetailPage());
		
	}
	
	@Test
	public void stage4_writeProductToTextFile() throws IOException {
		
		By popUpCloseButton = By.className("wis_clsbtn");
		wait.until(ExpectedConditions.visibilityOfElementLocated(popUpCloseButton));
		productDetailPage = new ProductDetailPage(driver);
		productDetailPage.writeToText();
		
	}
	
	
	
	/*@Test
	public void addToCard() {
		
		productDetailPage.addProductToCard();
		
	}
	
	
	@Test
	public void goCardPage() {
		
		navigationPage.clickCardPageContainer();
		
	}*/
}
