package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Yahoo extends PageModel.Base{
	///https://espanol.yahoo.com/
	private By climaVerMas = By.xpath("//a[contains(text(), 'Ver más')]");

	public Yahoo(WebDriver driver) {
			super.driver = driver;
			PageFactory.initElements(driver, this);
	}
	public void Yahoo() {	
	}
	
	public void clickClima() {
		esperarElemento(climaVerMas);
		findElemento(climaVerMas).click();
	}
	public void clickVerMas() {
		clickElemento(climaVerMas);
	}

}
