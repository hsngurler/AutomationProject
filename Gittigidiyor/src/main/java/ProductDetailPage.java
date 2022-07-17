import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends WebPage {

	
	By addCardButtonLocator = By.id("add-to-basket");
	By productInformationLocator = By.className("display-inlineBlock");
	By productPriceLocator = By.className("lastPrice");
	
	public ProductDetailPage(WebDriver driver) {
		super(driver);
	}

	public Boolean isOnProductDetailPage() {
		return ElementExist(addCardButtonLocator);
	}

	public void addProductToCard() {
		click(addCardButtonLocator);
		
	}
	
	public void writeToText() throws IOException {
		String productInformation = findElement(productInformationLocator).getText();
		String priceInformation = findElement(productPriceLocator).getText();
		
		File output = new File("productDetail.txt");
		FileWriter fileWriter = new FileWriter(output);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		
		printWriter.write(productInformation + " - " + priceInformation);
		printWriter.close();
	}

}
