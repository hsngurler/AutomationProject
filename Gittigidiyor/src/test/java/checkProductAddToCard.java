import org.junit.Assert;
import org.junit.Test;

public class checkProductAddToCard extends AllTests {

	NavigationPage navigationPage ;
	ProductListPage productListPage ;
	ProductDetailPage productDetailPage ;
	CardPage cardPage ;
	
	
	
	@Test
	public void searchProduct() {
		
		navigationPage.searchBox.search("bilgisayar");
		Assert.assertSame(productListPage.isOnProductPage() , "Not on Product List Page");
		
	}
	
	
	@Test
	public void SecondPage() {
		
		productListPage.goSecondPage();
		Assert.assertSame(productListPage.isOnSecondProductPage() , "Not on second Product List Page");
		
	}
	
	
	@Test
	public void selectProduct() {
		
		int random = (int)(Math.random()*(4-1+1)+1);
		productListPage.selectRandomProduct(random);
		Assert.assertSame(productDetailPage.isOnProductDetailPage() , "Not on Product Detail Page");
		
	}
	
	
	@Test
	public void addToCard() {
		
		productDetailPage.addProductToCard();
		
	}
	
	
	@Test
	public void goCardPage() {
		
		navigationPage.clickCardPageContainer();
		
	}
}
